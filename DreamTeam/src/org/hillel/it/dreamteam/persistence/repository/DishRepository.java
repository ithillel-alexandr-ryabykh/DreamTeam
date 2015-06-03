package org.hillel.it.dreamteam.persistence.repository;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dish;

public interface DishRepository {
	//able to see all dishes by name
	List<Dish> findDishesByName(Dish dish);

	//able to see all dishes
	List<Dish> findAllDishes();
	
	//adding a new dish
	boolean addDish(Dish dish);
	
	//changing the existing dish
	boolean changeDish(Dish existingDish, Dish newDish);

	//deleting the existing dish
	boolean deleteDish(Dish dish);

}
