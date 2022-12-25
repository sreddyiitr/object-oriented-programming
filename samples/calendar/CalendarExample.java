
package com.sunil.collections;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("India/Mumbai");
		Calendar calendar = Calendar.getInstance(timeZone);
		System.out.println("Current Time: " + calendar.getTime());
		System.out.println("Time Zone: " + calendar.getTimeZone().getDisplayName());
	}

}
