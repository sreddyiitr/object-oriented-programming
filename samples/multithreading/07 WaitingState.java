package com.sunil.sample.multithreading;

public class WaitingState implements Runnable {
    public static Thread t1;

    public static void main(String[] args) {
        t1 = new Thread(new WaitingState());
        t1.start();
    }

    public void run() {
    	// Thread t1 starts a new thread t2
        Thread t2 = new Thread(new DemoRunnable());
        t2.start();

        try {
        	/*
        	 * When we invoke the join() method on a thread, 
        	 * the calling thread goes into a waiting state. 
        	 * It remains in a waiting state until the referenced thread terminates.
        	 */
            t2.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}

class DemoRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
        
        System.out.println(WaitingState.t1.getState());
    }
}
