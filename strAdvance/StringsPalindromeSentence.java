package strAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class StringsPalindromeSentence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String txt = input.nextLine();

		boolean check = isPalindrome(txt);

		if (check) {
			System.out.println("Palindrome!");
		} else {
			System.out.println("No palindrome");
		}

		input.close();

	}

	private static boolean isPalindrome(String txt) {
		if (!txt.matches("[A-Za-z\\s,.;?!'\"-]*")) {
			return false;
		}
		txt = txt.replaceFirst("[\\s,.;?!'\"-]", "").toLowerCase();

		if (txt.isEmpty()) {
			return false;
		}
		char[] arr = txt.toCharArray();
		char[] arr2 = new char[arr.length];

		for (int i = arr.length - 1; i >= 0; i--) {
			arr2[i] = arr[i];
		}

		return Arrays.equals(arr, arr2);

	}

}
/*
 * Create a program called StringsPalindromeSentence that has a method called
 * isPalindrome that determines whether a string contains a palindrome. The
 * method should take a string as parameter and return true if the string
 * contains a palindrome. Otherwise, the method should return false. The main
 * method first inputs a string from the user and then calls the method
 * isPalindrome with the inputted string. Finally, the main method prints either
 * "Palindrome!" or "No palindrome". Rules (in this exercise) • The method
 * isPalindrome should allow only letters, whitespace, commas, dots,
 * semi-colons, question marks, exclamation marks, hyphens, single quotes and
 * double quotes in a palindrome. If there are any other characters, then the
 * text cannot be a palindrome. • NB! The method should ignore all whitespace,
 * commas, dots, semi-colons, question marks, exclamation marks, hyphens, single
 * quotes and double quotes when it checks the text. • If there are no letters
 * in the text, then the text cannot be a palindrome.
 */