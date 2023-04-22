package com.projects.expenseTracker.services;

import java.util.List;

import com.projects.expenseTracker.model.Expense;
import com.projects.expenseTracker.model.Income;

public interface ITransactionsDAOService {
    
    public List<Income> getIncomes();

    public List<Expense> getExpenses();

    public Income addIncome(Income income);

    public Expense addExpense(Expense expense);

    public String deleteIncomeById(String id);

    public String deleteExpenseById(String id);

}
