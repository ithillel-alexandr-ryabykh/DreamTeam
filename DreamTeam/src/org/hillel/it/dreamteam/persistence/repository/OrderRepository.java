package org.hillel.it.dreamteam.persistence.repository;

import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Services;

public interface OrderRepository {
	Order addOrder(Order order);

	Order changeOrder(Order order, Order newOrder);

	int extraService(Services service, boolean orderType, boolean taxy);

	int discount(Services service, int discount);

	int prepayment(Services service, int prepayment);
}
