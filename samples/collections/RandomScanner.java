package com.sunil.collections;

import java.util.Random;
import java.util.Scanner;

public class RandomScanner {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("To play, guess between 0 and 9 :");
		int inputNumber = scanner.nextInt();

		System.out.println("Do you think you will guess correctly? Enter Yes/No:");
		String answer = scanner.nextLine();
		
		// it will generate random number between 0 and 9
		int randomNumber = random.nextInt(10);
		 
		while(inputNumber != randomNumber) {
			System.out.println("Sorry, You lost. You guessed " + inputNumber + "Random Number: " +  randomNumber);
			System.out.println("To play, guess between 0 and 9 :");
			inputNumber = scanner.nextInt();
			System.out.println("Do you think you will guess correctly? Enter Yes/No:");
			answer = scanner.nextLine();
			randomNumber = random.nextInt(10);
		}
		
		System.out.println("You won! You guessed " + inputNumber + "Random Number: " +  randomNumber);
	}

}
