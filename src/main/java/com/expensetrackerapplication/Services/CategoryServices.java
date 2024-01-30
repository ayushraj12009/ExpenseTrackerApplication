package com.expensetrackerapplication.Services;

import com.expensetrackerapplication.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServices {

    @Autowired
    private CategoryRepository categoryRepository;
}
