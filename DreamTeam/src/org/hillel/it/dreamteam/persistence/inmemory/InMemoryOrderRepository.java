package org.hillel.it.dreamteam.persistence.inmemory;

import java.util.*;

import org.hillel.it.dreamteam.persistence.repository.OrderRepository;
import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public class InMemoryOrderRepository implements OrderRepository {
	List <Order> orderList= new ArrayList<Order>();

	// shows the order by Id
	@Override
	public void showOrderById(Order order, int id) {
		return;
	}

	// adding a new order
	@Override
	public boolean addOrder(Order order, String id) {
		if (order.getOrderId() == null) {
			order.add(order);
			return true;
		}
		return false;
	}

	
	// changing of order
	@Override
	public boolean changeOrder(Order existingOrder, Order newOrder) {
		if (orderList.remove(existingOrder)) {
			return orderList.add(newOrder);
		}
		return false;
	}

	// deleting of existing order
	@Override
	public boolean deleteOrder(Order existingOrder, Order order) {
		return orderList.remove(order);

	}

	// checking if additional services are needed
	@Override
	public boolean extraService(Options service, boolean delivery,
			boolean taxy, int discount, int prepayment) {

		return false;
	}

}
