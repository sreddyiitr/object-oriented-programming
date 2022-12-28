package com.sunil.collections;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesBasicExample {

	public static void main(String[] args) {
		
		Properties properties = new Properties();		
		properties.put("Telangana", "Hyderabad");
		properties.put("Meghalaya", "Shillong");
		properties.put("Karnataka", "Bangalore");

		Set keys  = properties.keySet();
		Iterator iterator = keys.iterator();
		String key = null;
		while(iterator.hasNext()) {
			key = (String) iterator.next();
			System.out.println("State: " + key + " Capital City: " + properties.getProperty(key));
		}
	}
}
