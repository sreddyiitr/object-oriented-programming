package com.sunil.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

	public static void main(String[] args) {
		/*****************
		 *  ArrayList
		 *****************/
		List<Integer> list = new ArrayList<>();
		list.add(10); list.add(20); list.add(30);
		list.remove(2);
		System.out.println("Is list empty?:" + 
				list.isEmpty());
		for(Integer number: list) {
			System.out.println(number);
		}
		list.clear();
		System.out.println("After clear(), Is list empty?:" + 
				list.isEmpty());
		
		/*****************
		 *  Vector
		 *****************/
		List<Integer> vector = new Vector<>();
		vector.add(10); vector.add(20); vector.add(30);
		vector.remove(1);
		System.out.println("Is vector empty?:" + 
		vector.isEmpty());
		for(int index = 0; index< vector.size(); index++) {
			System.out.println(vector.get(index));
		}
		vector.clear();
		System.out.println("After clear(), Is vector empty?:" + 
				vector.isEmpty());
		
		/*****************
		 *  Stack
		 *****************/
		Stack<Integer> stack = new Stack<>();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.pop();
		System.out.println("Peek Stack" + stack.peek());
		Iterator<Integer> iterator = stack.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		stack.clear();
		System.out.println("After clear(), Is stack empty?:" + 
				stack.isEmpty());
		
		/*****************
		 *  Queue
		 *****************/
		Queue<Integer> queue = new LinkedList<>();
		queue.add(10);
		queue.add(20);
		queue.add(30);
		queue.poll();
		System.out.println("Peek Queue" + queue.peek());
		Iterator<Integer> iterator1 = queue.iterator();
		while(iterator1.hasNext()) {
			System.out.println(iterator1.next());
		}
		queue.clear();
		System.out.println("After clear(), Is queue empty?:" + 
				queue.isEmpty());
		
		/*****************
		 *  HashSet
		 *****************/
		Set<Integer> set = new HashSet<>();
		set.add(10);  set.add(20); set.add(30); set.add(10);
		System.out.println("Set size:" + set.size());
		set.remove(20); //Pass actual element not index
		Iterator<Integer> iterator2 = set.iterator();
		// Set method doesn't have get(index) method
		while(iterator2.hasNext()) {
			System.out.println(iterator2.next());
		} 
		set.clear();
		System.out.println("After clear(), Is set empty?:" + 
				set.isEmpty());
	}
}
