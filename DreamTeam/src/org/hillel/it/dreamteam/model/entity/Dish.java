package org.hillel.it.dreamteam.model.entity;

import java.util.List;

public class Dish extends BaseEntity {
	// связать блюдо+цена+ид либо Map
	private List<Dish> dishes;
	private int id;
	private String name;
	private float cost;
	private boolean availability;
	private byte[] picture;

	void dishAvailability() {

	}

	void changeDishName() {

	}

	void changeDishCost() {

	}

	public Dish(List<Dish> dishes, int id, String name, float cost,
			boolean availability) {
		super();
		this.dishes = dishes;
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	public List<Dish> getDishes() {
		return dishes;
	}

	public void setDishes(List<Dish> dishes) {
		this.dishes = dishes;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

}
