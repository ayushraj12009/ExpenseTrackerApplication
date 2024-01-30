package com.expensetrackerapplication.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expenseId;

    private int amount;
    private String category;
    private String date;
    private String description;


    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categoryName;



}
