package org.hillel.it.dreamteam.model.entity;

import java.util.*;

//+registration,login,Order creation,payment;

public class Order extends BaseEntity {
	private int id;
	private int tableNumber;
	private Options options;
	private Client client;
	private Dish dish;
	private Cart cart;
	private List<String> dishes;

	void orderCancel() {

	}

	void tableAvailability() {

	}

	void timeAvailability() {

	}

	public Order(int id, List<String> dishes, int tableNumber) {
		super();
		this.setOrderId(id);
		this.setDishes(dishes);
		this.setTableNumber(tableNumber);
	}

	public int getOrderId() {
		return id;
	}

	public void setOrderId(int orderId) {
		this.id = orderId;
	}

	public int getTableNumber() {
		return tableNumber;
	}

	public void setTableNumber(int tableNumber) {
		this.tableNumber = tableNumber;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Dish getDish() {
		return dish;
	}

	public void setDish(Dish dish) {
		this.dish = dish;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Options getService() {
		return options;
	}

	public void setService(Options options) {
		this.options = options;
	}

	public List<String> getDishes() {
		return dishes;
	}

	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}

	public void add(Order order) {

	}
}
