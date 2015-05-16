package org.hillel.it.dreamteam.model.entity;

import java.util.*;

public class Order {
	private String orderId;
	private int tableNumber;
	private Client client;
	private Dishes dish;
	private Cart cart;
	private Services service;
	private List<String> dishes;

	void orderCancel() {

	}

	void tableAvailability() {

	}

	void timeAvailability() {

	}

	public Order(String id, List<String> dishes, int tableNumber) {
		super();
		this.setOrderId(id);
		this.setDishes(dishes);
		this.setTableNumber(tableNumber);
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
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

	public Dishes getDish() {
		return dish;
	}

	public void setDish(Dishes dish) {
		this.dish = dish;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Services getService() {
		return service;
	}

	public void setService(Services service) {
		this.service = service;
	}

	public List<String> getDishes() {
		return dishes;
	}

	public void setDishes(List<String> dishes) {
		this.dishes = dishes;
	}
}
