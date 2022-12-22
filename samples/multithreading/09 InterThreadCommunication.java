package com.sunil.sample.multithreading;

/* Java program to demonstrate inter-thread communication
*  (wait(), join() and notify())
*/

public class InterThreadCommunication
{
	public static void main(String[] args) throws InterruptedException
	{
		final ProducerConsumer producerConsumer = new ProducerConsumer();

		// Create a thread object that calls pc.produce()
		Thread t1 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					producerConsumer.produce();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});

		// Create another thread object that calls
		// pc.consume()
		Thread t2 = new Thread(new Runnable()
		{
			@Override
			public void run()
			{
				try
				{
					producerConsumer.consume();
				}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
		});

		// Start both threads
		t1.start();
		t2.start();

		// We code these join() statements to ensure that both thread execute before executing
		// next line to print "All threads finished"
		t1.join();
		t2.join();
		System.out.println("All threads finished");
	}

	// PC (Produce Consumer) class with produce() and
	// consume() methods.
	public static class ProducerConsumer
	{
		// Prints a string and waits for consume()
		public void produce()throws InterruptedException
		{
			// synchronized block ensures only one thread
			// running at a time.
			synchronized(this)
			{
				System.out.println("producer thread running");

				// releases the lock on shared resource
				wait();

				// and waits till some other method invokes notify().
				System.out.println("Resumed");
			}
		}

		// Sleeps for some time and waits for a key press. After key
		// is pressed, it notifies produce().
		public void consume()throws InterruptedException
		{
			// this makes the produce thread to run first.
			Thread.sleep(1000);

			// synchronized block ensures only one thread
			// running at a time.
			synchronized(this)
			{
				System.out.println("Waiting for return key.");
				System.out.println("Return key pressed");

				// notifies the produce thread that it
				// can wake up.
				notify();

				// Sleep
				Thread.sleep(2000);
			}
		}
	}
}
