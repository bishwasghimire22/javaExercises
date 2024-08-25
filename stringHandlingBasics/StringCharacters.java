package stringHandlingBasics;

import java.util.Scanner;

public class StringCharacters {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		int letterCount = 0;
		int digitCount = 0;
		int otherCharCount = 0;

		char[] arr = str.toCharArray();

		for (char ch : arr) {
			if (Character.isDigit(ch)) {
				digitCount++;
			} else if (Character.isLetter(ch)) {
				letterCount++;
			} else {
				otherCharCount++;
			}
		}

		/*
		 * for (int i = 0; i < str.length(); i++) { if
		 * (Character.isDigit(str.charAt(i))) { digitCount++; } else if
		 * (Character.isLetter(str.charAt(i))) { letterCount++; } else {
		 * otherCharCount++; } }
		 */
		System.out.println();
		System.out.println(letterCount + " letter(s)");
		System.out.println(digitCount + " digit(s)");
		System.out.println(otherCharCount + " other character(s)");

		input.close();

	}

}
