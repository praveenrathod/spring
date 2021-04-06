package com.xworkz.food.repository;

import com.xworkz.food.entity.CustomerEntity;

public class CustomerRepositoryImpl implements CustomerRepository {
	public CustomerRepositoryImpl() {
	System.out.println("invoked CustomerRepositoryImpl"+this.getClass().getSimpleName());
	}
	@Override
	public void save(CustomerEntity entity) {
		System.out.println("invoked save" + entity);
	}

}
