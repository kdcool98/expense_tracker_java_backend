package com.projects.expenseTracker.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.projects.expenseTracker.model.Expense;
import com.projects.expenseTracker.model.Income;
import com.projects.expenseTracker.services.ITransactionsDAOService;

@RestController
@RequestMapping(value = "/api/v1/")
@CrossOrigin(
        origins = "*", 
        allowedHeaders = { "Authorization", "Origin", "Content-type" },
        maxAge = 100 // Default maxAge is set to 1800 seconds (30 minutes). Indicates how long the
                     // preflight responses can be cached.
    ) // This might fail in some cases, where the browser makes a 
// "preflight" request, in which browser sends header and Http method to check if the server will
// allow the actual request or not (supports CORS or not).
/* EXPLAINATION :
 * CORS also relies on a mechanism by which browsers make a “preflight” request
 * to the server hosting the cross-origin resource, in order to check that the
 * server will permit the actual request. In that preflight, the browser sends
 * headers that indicate the HTTP method and headers that will be used in the
 * actual request.
 * 
 * So, for this reason, it's better to create a seperate configuration to handle CORS and 
 * this special mechanism of "preflight" requests.
 */
public class TransactionsController {

    @Autowired
    private ITransactionsDAOService transactionsDAOService;

    @RequestMapping(method = RequestMethod.GET, value = "get-incomes")
    public ResponseEntity<List<Income>> getIncomes() {
        return new ResponseEntity<>(transactionsDAOService.getIncomes(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "get-expenses")
    public ResponseEntity<List<Expense>> getExpenses() {
        return new ResponseEntity<>(transactionsDAOService.getExpenses(), HttpStatus.OK);
    }

    @RequestMapping(method=RequestMethod.POST, value="add-income")
    @ResponseBody
    public ResponseEntity<Income> addIncome(@RequestBody Income income) {
        return new ResponseEntity<>(transactionsDAOService.addIncome(income), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, value = "add-expense")
    @ResponseBody
    public ResponseEntity<Expense> addExpense(@RequestBody Expense expense) {
        return new ResponseEntity<>(transactionsDAOService.addExpense(expense), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete-income/{id}")
    public ResponseEntity<String> deleteIncome(@PathVariable("id") String id) {
        return new ResponseEntity<>(transactionsDAOService.deleteIncomeById(id), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete-expense/{id}")
    @ResponseBody
    public ResponseEntity<String> deleteExpense(@PathVariable("id") String id) {
        return new ResponseEntity<>(transactionsDAOService.deleteExpenseById(id), HttpStatus.OK);
    }
    // public Transaction addIncome(TransactionRequest request) {

    // }
    
    // public List<Transaction> getIncomes() {
    // }

    // @RequestMapping(method=RequestMethod.DELETE, value="delete-income/{id}")
    // public String deleteIncome(@PathVariable String id) {
    // }

    //  public Transaction addExpense(TransactionRequest request) {

    // }

    // public List<Transaction> getExpenses() {
    // }

    // @RequestMapping(method = RequestMethod.DELETE, value = "delete-expense/{id}")
    // public String deleteExpense(@PathVariable String id) {
    // }

}



