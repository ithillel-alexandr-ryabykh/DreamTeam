package org.hillel.it.dreamteam.persistance.repository.impl.file;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.persistence.repository.DishRepository;

public class FileDishRepository extends FileBaseRepository<Dish> implements DishRepository{
	List<Dish> dishList = new ArrayList<Dish>();

	// shows all dishes by name
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

	// shows all dishes
	@Override
	public List<Dish> findAllDishes() {
		return dishList;
	}

	// checking if the dish exists and adding if not
	// creation of new dish in menu, division of dishes will be done in next
	// way: dishes will have id in one table and got by id
	@Override
	public boolean addDish(Dish dish) {
		if (dish != null) {
			return dishList.add(dish);
		}
		return false;
	}

	// changing the dish description
	@Override
	public boolean changeDish(Dish existingDish, Dish newDish) {
		if (dishList.remove(existingDish)) {
			return dishList.add(newDish);
		}
		return false;
	}

	// deleting of existing dish
	@Override
	public boolean deleteDish(Dish dish) {
		return dishList.remove(dish);
	}

	
}
