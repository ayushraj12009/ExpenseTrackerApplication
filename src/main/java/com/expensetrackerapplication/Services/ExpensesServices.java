package com.expensetrackerapplication.Services;

import com.expensetrackerapplication.Model.Expenses;
import com.expensetrackerapplication.Repository.ExpensesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class ExpensesServices {

    @Autowired
    private ExpensesRepository expensesRepository;

    public Expenses addExpense(Expenses expenses) throws Exception{
        try {
            expensesRepository.save(expenses);
        }
        catch (Exception e){
            throw new Exception("Please Check Your Expenses Details", e);
        }
        return expenses;
    }


    public void deleteExpense(int expenseId) throws Exception{
        try {
            expensesRepository.deleteById(expenseId);
        }
        catch (Exception e){
            throw new Exception("Expense Id is wrong kindly check your id", e);
        }
    }

    public Expenses getExpenseById(int expenseId) throws  Exception{
        try {
           return expensesRepository.findById(expenseId).orElse(null);
        }
        catch (Exception e){
            throw new Exception("Expense Id is worng please check",e);
        }
    }

    public List<Expenses> findAllExpensesList() throws Exception{
        try {
            return expensesRepository.findAll();
        }
        catch (Exception e){
            throw new Exception("Something went wrong",e);
        }
    }


}
