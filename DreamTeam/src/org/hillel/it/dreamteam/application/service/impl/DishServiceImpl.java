package org.hillel.it.dreamteam.application.service.impl;

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
		return repository.findAllDishes();

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
