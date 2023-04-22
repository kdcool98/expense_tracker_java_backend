package com.projects.expenseTracker.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projects.expenseTracker.model.Expense;

public interface ExpensesRepository extends MongoRepository<Expense, String> {
    
}
