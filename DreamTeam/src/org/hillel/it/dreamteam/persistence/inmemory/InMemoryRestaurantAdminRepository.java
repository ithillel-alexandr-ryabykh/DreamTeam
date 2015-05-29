package org.hillel.it.dreamteam.persistence.inmemory;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.RestaurantAdmin;
import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.persistence.repository.RestaurantAdminRepository;

public class InMemoryRestaurantAdminRepository implements
		RestaurantAdminRepository {

	// checking if the dish available(present) or not
	@Override
	public int changeDishAvailability(Dish dishes, boolean dishAvailability) {

		return 0;
	}

	// changing orders for day
	@Override
	public int changeOrdersForDay(RestaurantAdmin restaurantAdmin,
			List<Integer> ordersForDay) {

		return 0;
	}

	// changing the availability of tale,i.e. occupied or not
	@Override
	public int changeTableAvailability(RestaurantAdmin restaurantAdmin,
			List<Integer> tables) {

		return 0;
	}

}
