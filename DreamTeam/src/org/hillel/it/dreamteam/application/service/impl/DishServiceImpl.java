package org.hillel.it.dreamteam.application.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.persistance.repository.impl.file.FileRepository;
import org.hillel.it.dreamteam.persistence.repository.DishRepository;
import org.hillel.it.dreamteam.application.service.DishService;

;

public class DishServiceImpl implements DishService {
	
		
	
								
	  
	
	

	//DishRepository repository = new InMemoryDishRepository();
	DishRepository repository = FileRepository.getInstance().getDishRepository();

	@Override
	public List<Dish> findDishesByName(Dish dish) {

		return repository.findDishesByName(dish);
	}

	@Override
	public List<Dish> findAllDishes() {
		//return repository.findAllDishes();
		List<Dish> dishList = new ArrayList<>();
		dishList.add(new Dish(1, "Roast Duck (Half)",25,true,"Crispy hong kong style roast duck"));
		dishList.add(new Dish(2, "Crispy Honey Chicken",33,true, "Lightly battered with sesame seed"));
		dishList.add(new Dish(3, "Sweet & Sour Chicken", 22, true, "Lightly battered with pineapple, bell pepper and carrots"));
		dishList.add(new Dish(4, "Lemon Chicken", 18, true, "Lightly battered with lemon sauc"));
		dishList.add(new Dish(5, "Sesame Chicken", 40, true, "Tender chicken, broccoli in spicy sesame sauce"));
		dishList.add(new Dish(6, "General Tso's Chicken", 20, true, "Lightly battered with sweet and chili flavor sauce"));
		dishList.add(new Dish(7, "Orange Peel Chicken", 35, true, "Tender chicken, broccoli, orange peel with sweet szechuan sauce"));

		return dishList;
				

	}

	@Override
	public boolean addDish(Dish dish) {
		return repository.addDish(dish);

	}

	@Override
	public boolean changeDish(Dish existingDish, Dish newDish) {
		return repository.changeDish(existingDish, newDish);
		
	}

	@Override
	public boolean deleteDish(Dish dish) {
		return repository.deleteDish(dish);
	}

}
