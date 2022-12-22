public class BlockedState {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new DemoRunnable());
        Thread t2 = new Thread(new DemoRunnable());
        
        t1.start();
        t2.start();
        
        // give enough time to thread scheduler to start t1 and t2
        Thread.sleep(1000);
        
        // Since method called from run() method is a synchronized method and it has infinite loop 
        // logic, t2 never gets a chance to execute synchronized method. t1 has lock until infinite loop
        // is executed.
        System.out.println(t2.getState());
        System.exit(0);
    }
}

class DemoRunnable implements Runnable {
    @Override
    public void run() {
        commonResource();
    }
    
    public static synchronized void commonResource() {
        while(true) {
            // Infinite loop to mimic heavy processing
            // 't1' won't leave this method
            // when 't2' try to enter this
        }
    }
}
