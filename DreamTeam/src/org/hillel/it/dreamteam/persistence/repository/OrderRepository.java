package org.hillel.it.dreamteam.persistence.repository;

import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;

public interface OrderRepository {
	boolean addOrder(Order order);

	Order changeOrder(Order newOrder);

	Order deleteOrder(Order order);

	boolean extraService(Options service, boolean orderType, boolean taxy,
			int discount, int prepayment);

}
