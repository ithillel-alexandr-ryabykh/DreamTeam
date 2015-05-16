package org.hillel.it.dreamteam.model.entity;

public class CartItem {
	private Dishes item;
	private int quantity;
	private String comments;

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Dishes getItem() {
		return item;
	}

	public void setItem(Dishes item) {
		this.item = item;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void incrementQuantity() {
		quantity++;
	}

	private float calculateTotal() {
		return item.getDishCost() * quantity;
	}
}
