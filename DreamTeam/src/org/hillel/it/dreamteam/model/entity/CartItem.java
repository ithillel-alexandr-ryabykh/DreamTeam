package org.hillel.it.dreamteam.model.entity;

public class CartItem extends BaseEntity {
	/**
	 * @item to set the dish item
	 * @quantity to set the quantity of items
	 * @comments to write necessary points according to the dish
	 * @discount is calculated if total dish cost is more than 5000 $
	 */
	private Dish item;
	private int quantity;
	private String comments;
	private int discount; 

	/**
	 * Checking of total dish cost for discount
	 * @param cartItem shows quantity of dishes in a Cart
	 */
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

	/**
	 * After adding the dish to cart, quantity increases
	 */
	public void incrementQuantity() {
		quantity++;
	}

	/**
	 * Calculating of all dish cost
	 * @return total cost
	 */
	private float calculateTotal() {
		return item.getCost() * quantity;
	}
}
