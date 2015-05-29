package org.hillel.it.dreamteam.model.entity;

public class CartItem extends BaseEntity {
	private Dish item;
	private int quantity;
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Dish getItem() {
		return item;
	}

	public void setItem(Dish item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//after adding the dish to cart, quantity increases
	public void incrementQuantity() {
		quantity++;
	}
	//calculating of all dish cost
	private float calculateTotal() {
		return item.getCost() * quantity;
	}
}
