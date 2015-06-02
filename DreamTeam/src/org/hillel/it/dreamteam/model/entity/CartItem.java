package org.hillel.it.dreamteam.model.entity;

public class CartItem extends BaseEntity {
	private Dish item;
	private int quantity;
	private String comments;
	private int discount;// if total dish cost is more than X $

	// checking of total dish cost for discount
	void dishCost(CartItem cartItem) {
		if (item.getCost() * quantity > 5000) {
			discount = (int) (0.3 * item.getCost() * quantity);
		}
	}

	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

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

	// after adding the dish to cart, quantity increases
	public void incrementQuantity() {
		quantity++;
	}

	// calculating of all dish cost
	private float calculateTotal() {
		return item.getCost() * quantity;
	}
}
