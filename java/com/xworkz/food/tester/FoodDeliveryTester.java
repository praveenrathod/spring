package com.xworkz.food.tester;

import com.xworkz.food.constant.FoodType;
import com.xworkz.food.entity.FoodItemEntity;
import com.xworkz.food.repository.FoodItemRepository;
import com.xworkz.food.repository.FoodItemRepositoryImpl;
import com.xworkz.food.service.FoodItemService;
import com.xworkz.food.service.FoodItemServiceImpl;

public class FoodDeliveryTester {
	public static void main(String[] args) {
		FoodItemEntity entity=new FoodItemEntity("Birani", 130.00, 1, FoodType.NOV_VEG, 5, true, "mix");
		
		FoodItemRepository repository=new FoodItemRepositoryImpl();
		FoodItemService service = new FoodItemServiceImpl(repository);
		boolean validateAndSave = service.validateAndSave(entity);
		System.out.println(validateAndSave);
	}

}
