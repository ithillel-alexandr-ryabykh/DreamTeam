package org.hillel.it.dreamteam.persistance.repository.impl.file;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.persistence.repository.DishRepository;

public class FileDishRepository extends FileBaseRepository<Dish> implements
		DishRepository {
	List<Dish> dishList = new ArrayList<Dish>();

	/**
	 * Shows all dishes by name
	 */
	@Override
	public List<Dish> findDishesByName(Dish dish) {
		List<Dish> dishes = new ArrayList<Dish>();
		for (int i = 0; i < dishes.size(); i++) {
			if (dish.equals(dish)) {
				return dish.getDishes();
			}
		}
		return null;
	}

	/**
	 * Shows all dishes
	 */
	@Override
	public List<Dish> findAllDishes() {
		return dishList;
	}

	/**
	 * Checking if the dish exists and adding if not
	 */
	@Override
	public boolean addDish(Dish dish) {
		if (dish != null) {
			return dishList.add(dish);
		}
		return false;
	}

	/**
	 * Changing the dish description
	 */
	@Override
	public boolean changeDish(Dish existingDish, Dish newDish) {
		if (dishList.remove(existingDish)) {
			return dishList.add(newDish);
		}
		return false;
	}

	/**
	 * Deleting of existing dish
	 */
	@Override
	public boolean deleteDish(Dish dish) {
		return dishList.remove(dish);
	}

}
