/* Create a program called ValidateAnswer that asks the user to answer a simple mathematical question. 
 * The question is the following: "What is 2 + 3?". 
 * The program should keep prompting for an answer as shown in the example output until the user enters the correct answer.
 */
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class ValidateAnswer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int correctAns = 5;
		int userAnswer = 0;
		System.out.print("What is 2 + 3? ");

		while (userAnswer != correctAns) {
			String answer = input.nextLine();
			try {
				userAnswer = Integer.parseInt(answer);
				if (userAnswer == correctAns) {
					System.out.println("Correct!");
				} else {
					System.out.print("Incorrect! Try again: ");
				}

			} catch (NumberFormatException nfe) {
				System.out.print("'" + answer + "'" +" is not a number! Try again: ");
			}
		}

		input.close();

	}

}
