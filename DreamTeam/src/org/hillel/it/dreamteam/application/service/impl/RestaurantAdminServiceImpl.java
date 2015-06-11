package org.hillel.it.dreamteam.application.service.impl;
import java.util.*;

import org.hillel.it.dreamteam.application.service.RestaurantAdminService;
import org.hillel.it.dreamteam.model.entity.RestaurantAdmin;
import org.hillel.it.dreamteam.model.entity.Dish;
import org.hillel.it.dreamteam.application.service.RestaurantAdminService;;
public class RestaurantAdminServiceImpl implements RestaurantAdminService{

	@Override
	public int changeDishAvailability(Dish dishes, boolean dishAvailability) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeOrdersForDay(RestaurantAdmin restaurantAdmin,
			List<Integer> ordersForDay) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int changeTableAvailability(RestaurantAdmin restaurantAdmin,
			List<Integer> tables) {
		// TODO Auto-generated method stub
		return 0;
	}

}
