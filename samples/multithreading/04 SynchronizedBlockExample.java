package com.sunil.sample.multithreading;

public class CashCounter {
	double availableBalance = 25000;

	void withdraw(String name, double withdrawalAmount) {
		if ((availableBalance >= withdrawalAmount) && (withdrawalAmount > 0)) {
			System.out.println(name + " : " + withdrawalAmount + "  Withdrawal Success");
			availableBalance -= withdrawalAmount;
		} else {
			System.out.println(name + " : " + withdrawalAmount + " : Withdrawal Amount Not Available");
		}
	}

	public static void main(String[] args) {
		CashCounter cashCounter = new CashCounter();

		// Create an object of Runnable type (Polymorphism)
		Runnable runnable1 = new CashCounterThread(cashCounter, "Sana", 20000);
		Runnable runnable2 = new CashCounterThread(cashCounter, "Sana Friend", 20000);

		// Create a new thread by passing runnable object to Thread constructor
		Thread newThread1 = new Thread(runnable1);
		Thread newThread2 = new Thread(runnable2);

		newThread1.start();
		newThread2.start();
	}
}

class CashCounterThread implements Runnable {
	CashCounter cashCounter;
	String name;
	double withdrawalAmount;

	CashCounterThread(CashCounter cashCounter, String name, double withdrawalAmount) {
		this.cashCounter = cashCounter;
		this.name = name;
		this.withdrawalAmount = withdrawalAmount;
	}

	public void run() {
    // Try commenting out line 44 and 46. Compare the output. 
		synchronized (cashCounter) { // synchronized block
			cashCounter.withdraw(name, withdrawalAmount);
		}
	}
}
