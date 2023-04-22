package com.projects.expenseTracker.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.projects.expenseTracker.model.Income;

public interface IncomesRepository extends MongoRepository<Income, String> {
    
}
