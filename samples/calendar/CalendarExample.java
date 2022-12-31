package com.sunil.collections;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class CalendarExample {

	public static void main(String[] args) {
		TimeZone timeZone = TimeZone.getTimeZone("India/Mumbai");
		Calendar indiacalendar = Calendar.getInstance(timeZone);
		Calendar ukCalendar = Calendar.getInstance(Locale.UK);
		Calendar defaultCalendar = Calendar.getInstance();
		
		System.out.println("Current India Time: " + indiacalendar.getTime());
		System.out.println("India Time Zone: " + indiacalendar.getTimeZone().getDisplayName());
		
		System.out.println("Current UK Time: " + indiacalendar.getTime());
		System.out.println("UK Time Zone: " + indiacalendar.getTimeZone().getDisplayName());
		
		System.out.println("Current Default Time: " + indiacalendar.getTime());
		System.out.println("Default Time Zone: " + indiacalendar.getTimeZone().getDisplayName());
		
		// TODO Add code from slides
		
		System.out.println("Current Calendar Year: " + indiacalendar.get(Calendar.YEAR));
		System.out.println("Current Calendar Day: " + indiacalendar.get(Calendar.DATE));
		System.out.println("Current MINUTE: " + indiacalendar.get(Calendar.MINUTE));
		System.out.println("Current SECOND: " + indiacalendar.get(Calendar.SECOND));
		
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
