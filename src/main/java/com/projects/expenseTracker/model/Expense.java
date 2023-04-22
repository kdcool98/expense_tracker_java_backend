package com.projects.expenseTracker.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection="expenses")
public class Expense {

    @Id
    private String _id;
    
    private String title;

    private String description;

    private String category;

    private int amount;

    private String type;

    private Date date;
}

