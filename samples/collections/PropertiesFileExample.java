package com.sunil.collections;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class PropertiesFileExample {

	public static void main(String[] args) {
		
		Properties properties = new Properties();
		FileReader fileReader;
		
		try {
			fileReader = new FileReader("sample-properties");
			properties.load(fileReader);
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("File IO Exception");
			e.printStackTrace();
		}
		
		Set keys  = properties.keySet();
		Iterator iterator = keys.iterator();
		String key = null;
		while(iterator.hasNext()) {
			key = (String) iterator.next();
			System.out.println("State: " + key + " Capital City: " + properties.getProperty(key));
		}
	}
}
