package org.hillel.it.dreamteam.model.entity;

import java.util.List;

public class Dish extends BaseEntity {
	/**
	 * @availability shows if the current dish is present or not
	 */
	private List<Dish> dishes;
	private int id;
	private String name;
	private float cost;
	private boolean availability;

	void dishAvailability() {

	}

	void changeDishName() {

	}

	void changeDishCost() {

	}

	public Dish(int id, String name, float cost,
			boolean availability) {
		super();
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

	public static void setCost(float cost) {
		
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

}
