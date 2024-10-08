package stringHandlingBasics;

import java.util.Scanner;

public class RegexPlateNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter plate number: ");
		String plateNum = input.nextLine();

		String regex = "^[A-Z]{3}-\\d{3}$";

		if (plateNum.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid plate number");
		}

		input.close();


	}

}
/* Create a program called RegexPlateNumber that first inputs a car plate number from the user. 
 * The plate number should contain three uppercase English letters, a hyphen, and three digits (in this order). 
 * If the plate number is in the above-mentioned format, the program should print "OK". 
 * Otherwise, the program should print "Invalid plate number".
 * Please validate the plate number with a single regular expression.*/
