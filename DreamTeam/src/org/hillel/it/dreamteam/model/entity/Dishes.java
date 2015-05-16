package org.hillel.it.dreamteam.model.entity;

import java.util.List;

public class Dishes {
	//связать блюдо+цена+ид либо Map
	private List<Dishes> dishes;
	private int dishId;
	private String dishName;
	private float dishCost;
	private boolean dishAvailability;
	private byte[] picture;

	void dishAvailability() {

	}

	void changeDishName() {

	}

	void changeDishCost() {

	}

	public Dishes(List<Dishes> dishes, String dishName, float dishCost,
			boolean dishAvailability) {
		super();
		this.dishes = dishes;
		this.dishName = dishName;
		this.dishCost = dishCost;
		this.dishAvailability = dishAvailability;
	}

	public int getDishId() {
		return dishId;
	}

	public void setDishId(int dishId) {
		this.dishId = dishId;
	}

	public void setDishCost(float dishCost) {
		this.dishCost = dishCost;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public float getDishCost() {
		return dishCost;
	}

	public void setDishCost(int dishCost) {
		this.dishCost = dishCost;
	}

	public boolean isDishAvailability() {
		return dishAvailability;
	}

	public List<Dishes> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dishes> dishes) {
		this.dishes = dishes;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public void setDishAvailability(boolean dishAvailability) {
		this.dishAvailability = dishAvailability;
	}

}
