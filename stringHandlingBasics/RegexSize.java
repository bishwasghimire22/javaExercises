package stringHandlingBasics;

import java.util.Scanner;

public class RegexSize {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter size: ");
		String size = input.nextLine().toUpperCase();
		String regex = "XXS|XS|S|M|L|XL|XXL";
		
		if (size.matches(regex)) {
			System.out.println("size ok");

		} else {
			System.out.println("Invalid size");
		}

		input.close();

	}

}
/*
 * Create a program called RegexSize that first inputs size code (XXS, XS, S, M,
 * L, XL, XXL) from the user. The program should print either "Size ok" or
 * "Invalid size". Please validate the inputted data with a single regular
 * expression.
 */