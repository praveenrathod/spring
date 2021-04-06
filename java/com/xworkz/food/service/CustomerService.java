package com.xworkz.food.service;

import com.xworkz.food.entity.CustomerEntity;

public interface CustomerService {
	public boolean validateAndSave(CustomerEntity entity);
}
