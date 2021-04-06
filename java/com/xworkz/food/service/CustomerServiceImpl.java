package com.xworkz.food.service;

import com.xworkz.food.entity.CustomerEntity;
import com.xworkz.food.repository.CustomerRepository;

public class CustomerServiceImpl implements CustomerService {
	private CustomerRepository repository;
	
	public CustomerServiceImpl(CustomerRepository repository) {
		System.out.println("invoked CustomerServiceImpl"+this.getClass().getSimpleName());
		this.repository=repository;
		
	}
	@Override
	public boolean validateAndSave(CustomerEntity entity) {
		System.out.println("invoked validateAndSave"+entity);
		if (entity!=null) {
			System.out.println("entity is valid ");
			this.repository.save(entity);
			
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
