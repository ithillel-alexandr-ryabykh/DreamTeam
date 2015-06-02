package org.hillel.it.dreamteam.persistence.repository;

import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public interface OrderRepository {

	//checking the order by Id
	void showOrderById(Order order, int id);
	
	//checking and adding a new order
	boolean addOrder(Order order,String id);
	
	//changing an existing order
	void changeOrder(Order newOrder);

	//deleting an existing order
	void deleteOrder(Order order);

	//checking and added needed additional services
	boolean extraService(Options service, boolean delivery, boolean taxy,
			int discount, int prepayment);

}
