package org.hillel.it.dreamteam.persistence.repository;

import java.util.*;

import org.hillel.it.dreamteam.model.entity.RestaurantAdmin;
import org.hillel.it.dreamteam.model.entity.Dish;

public interface RestaurantAdminRepository {
	//changing of dish availability is it present or not
	int changeDishAvailability(Dish dishes, boolean dishAvailability);

	//at the end of the day updating list of orders for day
	int changeOrdersForDay(RestaurantAdmin restaurantAdmin,
			List<Integer> ordersForDay);

	//checking if table occupied or not
	int changeTableAvailability(RestaurantAdmin restaurantAdmin,
			List<Integer> tables);

}
