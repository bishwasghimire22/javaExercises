package loopsSelectionExceptionHandling;

import java.util.Random;
import java.util.Scanner;

public class RandomProgram {
	static Random rand = new Random();

	public static void main(String[] args) {
		int num = rand.nextInt(100);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number (0-99): ");
		int userInput = Integer.parseInt(input.nextLine());

		while (userInput != num) {
			if (userInput < num) {
				System.out.println("The correct answer is larger!");
			} else if (userInput > num) {
				System.out.println("The correct answer is smaller!");
			}
			System.out.println();
			System.out.print("Guess again: ");
			userInput = Integer.parseInt(input.nextLine());
		}
		System.out.println("Correct!");

		input.close();

	}

}

/*
 * Create a program called RandomProgram that asks the user to guess an integer
 * between 0 and 99. If the user guesses too low, your program should print
 * "The correct number is larger!". If the guess is too high, the program should
 * print "The correct number is smaller!". The program should continue to prompt
 * for new guesses until the user enters the correct number. When the user
 * guesses the correct number, the program should print "Correct!" and end.
 */