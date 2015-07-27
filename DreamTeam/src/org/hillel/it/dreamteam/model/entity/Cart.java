package org.hillel.it.dreamteam.model.entity;

import java.util.*;

public class Cart extends BaseEntity {

	private Client client;

	private Map<Integer, CartItem> itemMap = Collections
			.synchronizedMap(new HashMap<Integer, CartItem>());

	private List<CartItem> itemList = new ArrayList<CartItem>();

	/**
	 * Function of dishes adding to the Cart
	 * 
	 */
	public void addDish(Dish dishes) {
		CartItem cartItem = (CartItem) itemMap.get(dishes.getId());
		if (cartItem == null) {
			cartItem = new CartItem();
			cartItem.setItem(dishes);
			cartItem.setQuantity(0);
			itemMap.put((int) dishes.getId(), cartItem);
			itemList.add(cartItem);
		}
		cartItem.incrementQuantity();
	}

	/**
	 * dishes removing by Id
	 * 
	 * @param itemId
	 *            is unique number of dish
	 * @return Showing list to prove that dish was deleted
	 */
	public boolean removeDishById(int itemId) {
		CartItem cartItem = (CartItem) itemMap.remove(itemId);
		return itemList.remove(cartItem);

	}

	public Iterator<CartItem> getCartItems() {
		return itemList.iterator();
	}

	public List<CartItem> getCartItemList() {
		return itemList;
	}

	public int getNumberOfItems() {
		return itemList.size();
	}

	public Iterator<CartItem> getAllCartItems() {
		return itemList.iterator();
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public List<CartItem> getItemList() {
		return itemList;
	}

}