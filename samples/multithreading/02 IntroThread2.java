public class IntroThread2 implements Runnable {

	public static void main(String[] args) {
		
		System.out.println("Main Thread id: " + Thread.currentThread().getId());
		System.out.println("Main Thread name: " + Thread.currentThread().getName());
		System.out.println("Main Thread State: " + Thread.currentThread().getState());
		System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
		
		
		// Create an object of Runnable type (Polymorphism)
		Runnable runnable = new IntroThread2();
		
		// Create a new thread by passing runnable object to Thread constructor
		Thread newThread = new Thread(runnable);
		
		System.out.println("New Thread id: " + newThread.getId());
		System.out.println("New Thread name: " + newThread.getName());
		System.out.println("New Thread State: " + newThread.getState());
		System.out.println("New Thread priority: " + newThread.getPriority());
	}

	@Override
	public void run() {
		
	}
}
