package com.xworkz.food.service;

import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;

public class FoodItemServiceImpl implements FoodItemService{
	
	private FoodItemRepository repository;
	
	public FoodItemServiceImpl(FoodItemRepository repository) {
		System.out.println("invoked FoodItemServiceImpl"+this.getClass().getSimpleName());
		this.repository=repository;
	}
	@Override
	public boolean validateAndSave(FoodItemEntity entity) {
		System.out.println("invoked validateAndSave"+entity);
		if(entity !=null) {
			this.repository.save(entity);
			System.out.println("entity is valid");
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

}
