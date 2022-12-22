public class IntroThread {

	public static void main(String[] args) {
		
		System.out.println("Main Thread id: " + Thread.currentThread().getId());
		System.out.println("Main Thread name: " + Thread.currentThread().getName());
		System.out.println("Main Thread State: " + Thread.currentThread().getState());
		System.out.println("Main Thread priority: " + Thread.currentThread().getPriority());
		System.out.println("Main Thread group: " + Thread.currentThread().getThreadGroup());
		System.out.println("Is Main Thread Alive?: " + Thread.currentThread().isAlive());
		System.out.println("Is Main Thread Interrupted?: " + Thread.currentThread().isInterrupted());
		
		System.out.println("\n************************************");
		System.out.println("* Change Thread name and priority  *");
		System.out.println("************************************\n");
		// Set Thread name to GreatThread
		Thread.currentThread().setName("GreatThread");
		// Set Thread priority to maximum priority 
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		
		System.out.println("After changing, Thread name: " + Thread.currentThread().getName());
		System.out.println("After changing, Thread priority: " + Thread.currentThread().getPriority());

		System.out.println("\n************************************");
		System.out.println("* Interrrupt the thread              *");
		System.out.println("************************************\n");
		
		Thread.currentThread().interrupt();
		System.out.println("Is Main Thread Interrupted?: " + Thread.currentThread().isInterrupted());
	}


}
