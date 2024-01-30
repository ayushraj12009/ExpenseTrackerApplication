package com.expensetrackerapplication.Model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Expenses {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int expenseId;

    private Double amount;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private String category;

    private Data date;

    private String description;

    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;

}
