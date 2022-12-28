
package com.sunil.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		Map<Integer, String> hashTable = new Hashtable<>();
		hashTable.put(10,"Ten");
		hashTable.put(20,"Twenty");
		hashTable.put(30,"Thirty");
		
		
		System.out.println("Hash Table: ");
		for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
			System.out.println(entry.getKey() + " : "+ entry.getValue());
		}
	}	
}
