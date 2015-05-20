package org.hillel.it.dreamteam.persistence.repository;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dish;

public interface DishesRepository {
	List<Dish> getDishesByName(String dishName);

	List<Dish> getAllDishes();

	int addDish(Dish dish);

	int changeDish(Dish dish);

	int deleteDish(Dish dish);

}
