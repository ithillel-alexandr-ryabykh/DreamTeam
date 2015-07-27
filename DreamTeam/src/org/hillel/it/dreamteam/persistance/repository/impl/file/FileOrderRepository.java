package org.hillel.it.dreamteam.persistance.repository.impl.file;

import java.util.*;

import org.hillel.it.dreamteam.persistence.repository.OrderRepository;
import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public class FileOrderRepository extends FileBaseRepository<Order> implements
		OrderRepository {

	List<Order> orderList = new ArrayList<Order>();

	/**
	 * Shows the order by Id
	 */
	@Override
	public Order showOrderById(int id) {
		for (Order order : orderList) {
			if (order.getId() == id) {
				return order;
			}
		}
		return null;
	}

	/**
	 * Adding a new order
	 */
	@Override
	public boolean addOrder(Order order, int id) {
		if (order.getOrderId() == 0) {
			order.add(order);
			return true;
		}
		return false;
	}

	/**
	 * Changing of order
	 */
	@Override
	public boolean changeOrder(Order existingOrder, Order newOrder) {
		if (orderList.remove(existingOrder)) {
			return orderList.add(newOrder);
		}
		return false;
	}

	/**
	 * Deleting of existing order
	 */
	@Override
	public void deleteOrder(int id) {
		for (Order order : orderList) {
			if (order.getId() == id) {
				orderList.remove(order);
			}
		}

	}

	/**
	 * Checking if additional services are needed
	 */
	@Override
	public boolean extraService(Options service, boolean delivery,
			boolean taxy, int discount, int prepayment) {

		return false;
	}
}
