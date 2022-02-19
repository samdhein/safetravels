package com.samhein.safetravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samhein.safetravels.models.Expense;
import com.samhein.safetravels.repositories.ExpenseRepository;

@Service
public class ExpenseService {
	@Autowired
	private ExpenseRepository expenseRepo;
	
	//FindAll
	public List<Expense> allExpenses(){
		return expenseRepo.findAll();
	}
	
	// create
	public Expense createExpense(Expense expense) {
		return expenseRepo.save(expense);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
