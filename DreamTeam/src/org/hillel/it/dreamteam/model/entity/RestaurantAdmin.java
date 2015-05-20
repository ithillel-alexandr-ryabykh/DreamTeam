package org.hillel.it.dreamteam.model.entity;

import java.util.*;

public class RestaurantAdmin extends BaseEntity {
	// List tables change to Map<id,available>+time & date
	// add division for dishes?
	private Date date;
	private Calendar calendar;
	private List<Integer> tables = new ArrayList<Integer>();
	private List<Integer> ordersForDay = new ArrayList<Integer>(); // history of
																	// orders
																	// for 1 day
	private Order order;

	public RestaurantAdmin(List<Integer> tables, List<Integer> ordersForDay) {

		this.tables = tables;
		this.ordersForDay = ordersForDay;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<Integer> getTables() {
		return tables;
	}

	public void setTables(List<Integer> tables) {
		this.tables = tables;
	}

	public List<Integer> getOrdersForDay() {
		return ordersForDay;
	}

	public void setOrdersForDay(List<Integer> ordersForDay) {
		this.ordersForDay = ordersForDay;
	}

}
