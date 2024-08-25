package stringHandlingBasics;

import java.util.Scanner;

public class RegexStudentNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter student number: ");
		String stdNum = input.nextLine();

		String regex = "^(2)[0-9]{7}$";

		if (stdNum.matches(regex)) {
			System.out.println("OK");
		} else {
			System.out.println("Invalid student number");
		}

		input.close();

	}

}
/*
 * Create a program called RegexStudentNumber that first inputs a student number
 * from the user. If the inputted data starts with '2' and contains exactly 8
 * digits, the program should print "OK". Otherwise, the program should print
 * "Invalid student number". Please validate the username with a single regular
 * expression.
 */