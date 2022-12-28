package com.sunil.collections;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		
		// Since StringTokenizer implements Enumeration interface
		// we can call hasMoreElements() and nextElement() methods
		StringTokenizer st1 = new StringTokenizer("this is a test", " ");
		while (st1.hasMoreElements()) {
			System.out.println(st1.nextElement());
		}

		// hasMoreElements() and nextElement() methods are same as 
		// hasMoreTokens() and nextToken()
		StringTokenizer st2 = new StringTokenizer("this,is,a,another,test", ",");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}
}
