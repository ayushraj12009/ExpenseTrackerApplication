package com.expensetrackerapplication.Repository;

import com.expensetrackerapplication.Model.Expenses;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpensesRepository extends JpaRepository<Expenses, Integer> {
}
