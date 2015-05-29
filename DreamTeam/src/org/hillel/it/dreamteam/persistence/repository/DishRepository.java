package org.hillel.it.dreamteam.persistence.repository;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dish;

public interface DishRepository {
	//able to see all dishes by name
	List<Dish> getDishesByName(Dish dish);

	//able to see all dishes
	List<Dish> getAllDishes();
	
	//adding a new dish
	void addDish(Dish dish);
	
	//changing the existing dish
	void changeDish(Dish dish);

	//deleting the existing dish
	void deleteDish(Dish dish);

}
