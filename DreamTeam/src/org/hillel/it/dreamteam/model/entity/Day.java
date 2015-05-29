package org.hillel.it.dreamteam.model.entity;

import java.util.*;
import java.text.*;

public class Day {

	// default time
	private final String FORMAT = "yyyy-MM-dd";

	private final Calendar day;

	// creation of new day instance for the current day
	public Day() {
		day = Calendar.getInstance();
	}

	// creation of new day instance from Calendar
	public Day(Calendar day) {
		this.day = day;
	}

	// creating a new day instance from Date
	public Day(Date date) {
		this();
		day.setTime(date);
	}

	// * creating a new day instance for any given day of the year, ignoring
	// time,

	public Day(int year, int month, int dayOfMonth) {
		day = new GregorianCalendar(year, month - 1, dayOfMonth);
	}

	// getting a day in calendar
	public Calendar getCalendar() {
		return this.day;
	}

	// getting a time of date
	public Date getDate() {
		return this.day.getTime();
	}

	// getting the day in month
	public int getDayOfMonth() {
		return day.get(Calendar.DAY_OF_MONTH);
	}

	// getting the month
	public int getMonth() {
		return day.get(Calendar.MONTH) + 1;
	}

	// getting a year
	public int getYear() {
		return day.get(Calendar.YEAR);
	}

	// converting of the day format to string
	public String format(String format) {
		DateFormat df = new SimpleDateFormat(format);
		return df.format(getDate());
	}

	// checking if it is today
	public boolean isToday() {
		return equals(new Day());
	}
/*
	// checks if another day is the same as this one
	public boolean equals(Day day) {
		if (day == null) {
			return false;
		}
		Calendar test = day.getCalendar();
		return this.day.get(Calendar.ERA) == test.get(Calendar.ERA)
				&& this.day.get(Calendar.YEAR) == test.get(Calendar.YEAR)
				&& this.day.get(Calendar.DAY_OF_YEAR) == test
						.get(Calendar.DAY_OF_YEAR);
	}

	@Override
	public String toString() {
		return format(FORMAT);
	}
	*/
}
