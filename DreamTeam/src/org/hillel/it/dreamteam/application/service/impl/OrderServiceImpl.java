package org.hillel.it.dreamteam.application.service.impl;
import org.hillel.it.dreamteam.model.entity.Order;
import org.hillel.it.dreamteam.model.entity.Options;
import org.hillel.it.dreamteam.persistence.inmemory.InMemoryOrderRepository;
import org.hillel.it.dreamteam.persistence.repository.OrderRepository;
import org.hillel.it.dreamteam.application.service.OrderService;;

public class OrderServiceImpl implements OrderService {
	OrderRepository repository = new InMemoryOrderRepository();

	@Override
	public Order showOrderById(int id) {
		return repository.showOrderById(id);
	}

	@Override
	public boolean addOrder(Order order, int id) {
		return repository.addOrder(order, id);
	}

	@Override
	public boolean changeOrder(Order existingOrder, Order newOrder) {
		return repository.changeOrder(existingOrder, newOrder);
	}

	@Override
	public void deleteOrder(int id) {
		repository.deleteOrder(id);
	}

	@Override
	public boolean extraService(Options service, boolean delivery,
			boolean taxy, int discount, int prepayment) {
		return repository.extraService(service, delivery, taxy, discount, prepayment);
	}

}
