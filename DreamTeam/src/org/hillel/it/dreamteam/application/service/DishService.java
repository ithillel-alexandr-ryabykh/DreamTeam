package org.hillel.it.dreamteam.application.service;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dish;

public interface DishService {
	/**
	 * Able to see all dishes by name
	 * @param dish stands for dish instance
	 * @return list of dishes found by input name
	 */
	List<Dish> findDishesByName(Dish dish);

	/**
	 * Able to see all dishes
	 * @return full list of dishes
	 */
	List<Dish> findAllDishes();

	/**
	 * Adding a new dish
	 * @param dish new instance of a dish
	 * @return if the dish was added or not
	 */
	boolean addDish(Dish dish);

	/**
	 * Changing the existing dish
	 * @param existingDish a current dish un a list
	 * @param newDish new instance of a dish
	 * @return if it was changed or not
	 */
	boolean changeDish(Dish existingDish, Dish newDish);

	/**
	 * Deleting the existing dish
	 * @param dish existing instance of a dish
	 * @return if was deleted or not
	 */
	boolean deleteDish(Dish dish);
}
