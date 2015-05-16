package org.hillel.it.dreamteam.persistence.repository;

import java.util.List;

import org.hillel.it.dreamteam.model.entity.Dishes;

public interface DishesRepository {
	List<Dishes> getDishesByName(String dishName);

	List<Dishes> getAllDishes();

	int addDish(Dishes dish);

	int changeDish(Dishes dish);

	int deleteDish(Dishes dish);

}
