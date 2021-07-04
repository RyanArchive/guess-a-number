// Guessing a number

import java.util.Random;
import java.util.Scanner;
import java.util.* ;

public class GuessingGame {
	public static void main(String[] args) {
		Random random = new Random();
		int number = random.nextInt(50);
		Scanner sc = new Scanner(System.in);
		int tries = 0, guess = 0;
		boolean again = true;

		System.out.println("Guess a number from 1 to 50: ");

		do {
			try {
				guess = sc.nextInt();
				tries++;

				if (guess == number) {
					System.out.println("Correct!");
					System.out.println("You got it in " + tries + " attempt(s)!");
					again = false;
				} else if (guess < number && guess > 0) {
					System.out.println("Too low. Try again.");
				} else if (guess > number && guess < 51) {
					System.out.println("Too high. Try again.");
				} else {
					System.out.println("Out of range.");
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Out of range.");
			} catch (InputMismatchException e) {
				System.out.println("Invalid input.");
				again = false;
			}
		} while (again == true);
	}
}