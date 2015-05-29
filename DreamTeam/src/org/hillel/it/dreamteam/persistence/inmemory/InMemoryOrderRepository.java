package org.hillel.it.dreamteam.persistence.inmemory;

import java.util.*;

import org.hillel.it.dreamteam.persistence.repository.OrderRepository;
import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public class InMemoryOrderRepository implements OrderRepository {

	// shows the order by Id
	@Override
	public void showOrderById(Order order, int id) {
		return;
	}

	// adding a new order
	@Override
	public boolean addOrder(String id) {
		if (getOrderId(order.getOrderId()) == null) {
			order.add(order);
			return true;
		}
		return false;
	}

	// changing of order
	@Override
	public void changeOrder(Order newOrder) {
		return;
	}

	// deleting of existing order
	@Override
	public void deleteOrder(Order order) {
		return;

	}

	// checking if additional services are needed
	@Override
	public boolean extraService(Options service, boolean delivery,
			boolean taxy, int discount, int prepayment) {

		return false;
	}

}
