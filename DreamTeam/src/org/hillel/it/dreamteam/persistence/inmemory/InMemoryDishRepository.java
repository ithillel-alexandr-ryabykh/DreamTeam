package org.hillel.it.dreamteam.persistence.inmemory;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.persistence.repository.DishRepository;

public class InMemoryDishRepository implements DishRepository {

	// shows all dishes by name
	@Override
	public List<Dish> getDishesByName(Dish dish) {
		List<Dish> dishes = new ArrayList<Dish>();
		for (Dish dish1 : dishes) {
			if (dish.equals(dish)) {
				return dish.getDishes();
			}
		}
		return null;
	}

	// shows all dishes
	@Override
	public List<Dish> getAllDishes() {
		return getAllDishes();
	}

	// checking if the dish exists and adding if not
	// creation of new dish in menu, division of dishes will be done in next
	// way: dishes will have id in one table and got by id
	@Override
	public void addDish(Dish dish) {
		if (dish != null) {

			Map<Dish.Type, Dish> submenu = dish.get(dish.getTime());
			if (submenu == null) {
				submenu = new EnumMap<Dish.Type, Dish>(Dish.Type.class);
			}
			submenu.put(dish.getType(), dish);
			dish.put(dish.getTime(), submenu);
		}
	}

	// changing the dish description
	@Override
	public void changeDish(Dish dish) {
		return;
	}

	// deleting of existing dish
	@Override
	public void deleteDish(Dish dish) {
		return;
	}

}
