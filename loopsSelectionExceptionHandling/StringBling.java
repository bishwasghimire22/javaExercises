/* Create a program called StringBling that inputs strings from the user until the user decides to quit by entering the text "stop". 
 * The program should determine the longest entered string and print it enclosed in single quotes. 
 * The text "stop" should not be considered when determining the longest string. 
 * • If it is a tie between two or more longest strings, the program should print the string, which the user entered first. 
 * • If the user does not enter anything else but "stop", the program should not print anything else but "Nothing to be printed". 
 
		 * Example output:
		Enter first string: cat
		Enter next string: bear
		Enter next string: bird
		Enter next string: stop
		
		'bear'*/
package loopsSelectionExceptionHandling;

import java.util.Scanner;

public class StringBling {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first string: ");
		String str = input.nextLine();
		
		String longestStr = "";
		boolean stopEntered = false;

		while (!str.equalsIgnoreCase("stop")) {
			if (str.length() > longestStr.length()) {
				longestStr = str;
			}
			System.out.print("Enter next String: ");
			str = input.nextLine();
			stopEntered = true;

		}
		System.out.println();
		if (stopEntered) {
			if (!longestStr.isEmpty()) {
				System.out.println("'" + longestStr + "'");
			} else {
				System.out.println("Nothing to be printed");
			}
		} else {
			System.out.println("Nothing to be printed");
		}

		input.close();

	}

}
