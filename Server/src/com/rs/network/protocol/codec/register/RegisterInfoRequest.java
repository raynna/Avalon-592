package com.rs.network.protocol.codec.register;

import java.util.GregorianCalendar;

/**
 * @author _jordan <jordan.abraham1997@gmail.com>
 *
 * Created on May 3, 2018.
 */
public class RegisterInfoRequest {

	private final int day;

	private final int month;

	private final int year;

	private final GregorianCalendar calendar;

	private final int country;

	/**
	 * Constructs a new class instance.
	 * @param day
	 * @param month
	 * @param year
	 * @param calendar
	 * @param country
	 */
	public RegisterInfoRequest(int day, int month, int year, GregorianCalendar calendar, int country) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.calendar = calendar;
		this.country = country;
	}

	/**
	 * @return the day
	 */
	public int getDay() {
		return day;
	}

	/**
	 * @return the month
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}

	/**
	 * @return the calendar
	 */
	public GregorianCalendar getCalendar() {
		return calendar;
	}

	/**
	 * @return the country
	 */
	public int getCountry() {
		return country;
	}

}
