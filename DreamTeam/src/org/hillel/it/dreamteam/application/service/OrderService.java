package org.hillel.it.dreamteam.application.service;

import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public interface OrderService {
	// checking the order by Id
	Order showOrderById(int id);

	// checking and adding a new order
	boolean addOrder(Order order, int id);

	// changing an existing order
	boolean changeOrder(Order existingOrder, Order newOrder);

	// deleting an existing order
	void deleteOrder(int id);

	// checking and added needed additional services
	boolean extraService(Options service, boolean delivery, boolean taxy,
			int discount, int prepayment);

}
