package org.hillel.it.dreamteam.persistence.repository;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.RestaurantAdmin;
import org.hillel.it.dreamteam.model.entity.Dish;

public interface RestaurantAdminRepository {
	int changeDishAvailability(Dish dishes, boolean dishAvailability);

	int changeOrdersForDay(RestaurantAdmin restaurantAdmin,
			List<Integer> ordersForDay);

	int changeTableAvailability(RestaurantAdmin restaurantAdmin,
			List<Integer> tables);

}
