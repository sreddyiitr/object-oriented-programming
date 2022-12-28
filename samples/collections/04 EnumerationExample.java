package com.sunil.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class EnumerationExample {

	public static void main(String[] args) {
		
		// Enumeration<?> enumeration = null;  // Generics
		Enumeration enumeration = null;  

		Vector<Integer> vector = new Vector<>();
		vector.add(10); 
		vector.add(20); 
		vector.add(30);
		enumeration = vector.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());	
		}

		Hashtable<Integer, String> map = new Hashtable<>();
		map.put(1,"one"); map.put(2,"two"); map.put(3,"three");
		enumeration = map.elements();
		while(enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement()); 	// Prints values in Hash table
		}

	}
}
