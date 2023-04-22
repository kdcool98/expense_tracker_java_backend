package com.projects.expenseTracker.response;

import java.util.Date;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Transaction {
    
    private int id;

    private String title;

    private String description;

    private String category;

    private int amount;

    private String type;

    private Date date;

}
