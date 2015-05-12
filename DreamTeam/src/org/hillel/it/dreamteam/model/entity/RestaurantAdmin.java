package org.hillel.it.dreamteam.model.entity;

import java.util.Calendar;
import java.util.*;
import java.util.Date;
import java.util.List;

public class RestaurantAdmin {
	Date date;
	Calendar calendar;
	List tables = new ArrayList();
	List ordersForDay = new ArrayList();
	Order order;

	public RestaurantAdmin(List tables, List ordersForDay) {

		this.tables = tables;
		this.ordersForDay = ordersForDay;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List getTables() {
		return tables;
	}

	public void setTables(List tables) {
		this.tables = tables;
	}

	public List getOrdersForDay() {
		return ordersForDay;
	}

	public void setOrdersForDay(List ordersForDay) {
		this.ordersForDay = ordersForDay;
	}

}
