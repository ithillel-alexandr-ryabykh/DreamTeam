package org.hillel.it.dreamteam.application.service;

import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public interface OrderService {
	/**
	 * Checking the order by Id
	 * 
	 * @param id
	 *            unique order id
	 * @return existing order with corresponding id
	 */
	Order showOrderById(int id);

	/**
	 * Checking and adding a new order
	 * 
	 * @param order
	 *            new instance order
	 * @param id
	 *            new unique id that it will get
	 * @return if it was added or not
	 */
	boolean addOrder(Order order, int id);

	/**
	 * Changing of existing order
	 * 
	 * @param existingOrder
	 *            current instance order
	 * @param newOrder
	 *            new instance order
	 * @return if it was changed or not
	 */
	boolean changeOrder(Order existingOrder, Order newOrder);

	/**
	 * Deleting an existing order
	 * 
	 * @param id
	 *            current id or existing order
	 */
	void deleteOrder(int id);

	/**
	 * Checking and added needed additional services
	 * 
	 */
	boolean extraService(Options service, boolean delivery, boolean taxy,
			int discount, int prepayment);

}
