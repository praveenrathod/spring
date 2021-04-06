package com.xworkz.food.tester;

import com.xworkz.food.entity.CustomerEntity;
import com.xworkz.food.repository.CustomerRepository;
import com.xworkz.food.repository.CustomerRepositoryImpl;
import com.xworkz.food.service.CustomerService;
import com.xworkz.food.service.CustomerServiceImpl;

public class CustomerTester {
public static void main(String[] args) {
	CustomerEntity entity = new CustomerEntity("lakshmi", "rajajinagar", 987654321, 5, 50, "laxmi@gmail.com");
	
	CustomerRepository repository = new CustomerRepositoryImpl();
	CustomerService service = new CustomerServiceImpl(repository);
	boolean validateAndSave = service.validateAndSave(entity);
	System.out.println(validateAndSave);
}
}
