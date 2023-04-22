package com.projects.expenseTracker.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projects.expenseTracker.model.Expense;
import com.projects.expenseTracker.model.Income;
import com.projects.expenseTracker.respository.ExpensesRepository;
import com.projects.expenseTracker.respository.IncomesRepository;

@Service
public class TransactionsDAOServiceImpl implements ITransactionsDAOService {

    @Autowired
    private ExpensesRepository expensesRepository;

    @Autowired
    private IncomesRepository incomesRepository;

    @Override
    public List<Income> getIncomes() {
        return incomesRepository.findAll();
    }

    @Override
    public List<Expense> getExpenses() {
        return expensesRepository.findAll();
    }

    @Override
    public Income addIncome(Income income) {
        return incomesRepository.insert(income);
    }

    @Override
    public Expense addExpense(Expense expense) {
        return expensesRepository.insert(expense);
    }

    @Override
    public String deleteIncomeById(String id) {
        incomesRepository.deleteById(id);
        return String.format("Income with id : %s is deleted", id);
    }

    @Override
    public String deleteExpenseById(String id) {
        expensesRepository.deleteById(id);
        return String.format("Expense with id : %s is deleted", id);
    }
    
}
