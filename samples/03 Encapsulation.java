package com.sunil.sample;

public class Point {

    // Define variables as private and have others call set and get methods to change/get values.... Encapsulation
	  private int x;
	  private int y;

	  public Point(int x, int y) {
		setX(x);
		setY(y);
	  }
	  
	  public Point(int x) {
		  setX(x);
	  }
	  
	  public Point() {
		  super();
	  }
	  
	  public int getX() { 	return x;	}
	  public int getY() { 	return y;	}
	  public void setX(int x) { 	this.x = x;	}
	  public void setY(int y) { 	this.y = y;	}

	  public static void main(String[] args) {
	    Point point1 = new Point(2);
	    System.out.println("The value of x: "+ point1.getX());
	    System.out.println("The value of y: "+ point1.getY());
	    
	    Point point2 = new Point(3,4);
	    System.out.println("The value of x: "+ point2.getX());
	    System.out.println("The value of y: "+ point2.getY());
	  }
	}
