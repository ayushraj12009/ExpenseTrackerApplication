package com.expensetrackerapplication.Repository;

import com.expensetrackerapplication.Model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}