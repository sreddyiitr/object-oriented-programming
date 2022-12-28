package com.sunil.collections;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String args[]) {

		Map<Integer, String> hashTable = new Hashtable<>();
		Map<Integer, String> hashMap = new HashMap<>(); 

		hashTable.put(1, "one");
		hashTable.put(2, "two");
		hashTable.put(3, "three");

		hashMap.put(4, "four");
		hashMap.put(5, "five");
		hashMap.put(6, "six");
		hashMap.put(7, null);

		System.out.println("Hash Table: ");
		for (Entry<Integer, String> entry : hashTable.entrySet())
            System.out.println(entry.getKey() + " "
                               + entry.getValue());
		
		System.out.println("Print Hash Map Using keySet() : ");
		for (Integer key : hashMap.keySet()) {
	        System.out.println(key + ":" + hashMap.get(key));
	    }
		
		System.out.println("Print Hash Map Using iterrator() : ");
		Iterator<Integer> iterator = hashMap.keySet().iterator();
	    while (iterator.hasNext()) {
	    	Integer key = iterator.next();
	        System.out.println(key + ":" + hashMap.get(key));
	    }
		
	}
}
