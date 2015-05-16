package org.hillel.it.dreamteam.persistence.repository;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.RestaurantAdmin;
import org.hillel.it.dreamteam.model.entity.Dishes;

public interface RestaurantAdminRepository {
	int changeDishAvailability(Dishes dishes, boolean dishAvailability);

	int changeOrdersForDay(RestaurantAdmin restaurantAdmin,
			List<Integer> ordersForDay);

	int changeTableAvailability(RestaurantAdmin restaurantAdmin,
			List<Integer> tables);

}
