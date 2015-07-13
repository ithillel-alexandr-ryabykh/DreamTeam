package org.hillel.it.dreamteam.model.entity;

import java.util.*;
import java.text.*;

public class Day {

	/**
	 * Default time
	 */
	private final String FORMAT = "yyyy-MM-dd";

	private final Calendar day;

	/**
	 * Creation of new day instance for the current day
	 */
	public Day() {
		day = Calendar.getInstance();
	}

	/**
	 * Creation of new day instance from Calendar
	 * 
	 */
	public Day(Calendar day) {
		this.day = day;
	}

	/**
	 * Creating a new day instance from Date
	 * 
	 */
	public Day(Date date) {
		this();
		day.setTime(date);
	}

	 /**
	  * Creating a new day instance for any given day of the year, ignoring time
	  */
	 

	public Day(int year, int month, int dayOfMonth) {
		day = new GregorianCalendar(year, month - 1, dayOfMonth);
	}

	/**
	 * Getting a day in calendar
	 * @return a day
	 */
	public Calendar getCalendar() {
		return this.day;
	}

	/**
	 * Getting a time of date
	 * @return time
	 */
	public Date getDate() {
		return this.day.getTime();
	}

	/**
	 * Getting the day in month
	 * @return date
	 */
	public int getDayOfMonth() {
		return day.get(Calendar.DAY_OF_MONTH);
	}

	/**
	 * Getting the month
	 * @return month
	 */
	public int getMonth() {
		return day.get(Calendar.MONTH) + 1;
	}

	/**
	 * Getting a year
	 * @return year
	 */
	public int getYear() {
		return day.get(Calendar.YEAR);
	}

	/**
	 * Converting of the day format to string
	 * 
	 */
	public String format(String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(getDate());
	}

	/**
	 * Checking if it is today
	 * @return check is it true
	 */
	public boolean isToday() {
		return equals(new Day());
	}

}
