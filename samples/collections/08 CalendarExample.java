package com.sunil.collections;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("Asia/Calcutta");
		Calendar indiacalendar = Calendar.getInstance(timeZone);
		Calendar ukCalendar = Calendar.getInstance(Locale.UK);
		Calendar defaultCalendar = Calendar.getInstance();
		
		// DO NOT USE getTime() method since it doesn't print the correct time
		System.out.println("Current India Time: " + indiacalendar.getTime());
		System.out.println("India Time Zone: " + indiacalendar.getTimeZone().getDisplayName());
		
		System.out.println("Current UK Time: " + ukCalendar.getTime());
		System.out.println("UK Time Zone: " + ukCalendar.getTimeZone().getDisplayName());
		
		System.out.println("Current Default Time: " + defaultCalendar.getTime());
		System.out.println("Default Time Zone: " + defaultCalendar.getTimeZone().getDisplayName());
		
		// Calendar.get() gives the correct time based on the time zone
		System.out.println("Current India Calendar Year: " + indiacalendar.get(Calendar.YEAR));
		System.out.println("Current India Calendar Day: " + indiacalendar.get(Calendar.DATE));
		System.out.println("Current India HOUR: " + indiacalendar.get(Calendar.HOUR));
		System.out.println("Current India MINUTE: " + indiacalendar.get(Calendar.MINUTE));
		System.out.println("Current India SECOND: " + indiacalendar.get(Calendar.SECOND));
		
		ukCalendar.set(Calendar.MONTH, 11);
		System.out.println("After changing UK Current MONTH to 11 : " + ukCalendar.get(Calendar.MONTH));
		
		// Use following add methods of calendar object to add/subtract days/weeks/months/years

		defaultCalendar.add(Calendar.DATE, -15); // add is a static method
		System.out.println("15 days ago: " + defaultCalendar.getTime());
		defaultCalendar.add(Calendar.MONTH, 4);
		System.out.println("4 months later: " + defaultCalendar.getTime());
		defaultCalendar.add(Calendar.YEAR, 2);
		System.out.println("2 years later: " + defaultCalendar.getTime());
		

	}

}
