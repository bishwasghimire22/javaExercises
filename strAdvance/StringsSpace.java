package strAdvance;

import java.util.Scanner;

public class StringsSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();

		String result = removeExtraSpace(str);

		System.out.println("\"" + result + "\"");

		input.close();

	}

	private static String removeExtraSpace(String str) {
		String trimmed = str.trim();
		String result = trimmed.replaceAll("\\s+", " ");

		return result;
	}

}
/*Create a program called StringsSpace that has a method called removeExtraSpace.
The method removes all extra whitespace from a string.
The method should take a string as  parameter, process the string content and return a new string.
The main method first inputs a string from the user and then calls the method removeExtraSpace with the inputted string. 
Finally, the main method prints the result enclosed in double quotes.
In this exercise, "extra whitespace" means leading/trailing whitespace and more than one whitespace character between two non-whitespace characters. 
*/