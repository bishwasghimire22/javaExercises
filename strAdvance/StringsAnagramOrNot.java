package strAdvance;

import java.util.Arrays;
import java.util.Scanner;

public class StringsAnagramOrNot {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first text: ");
		String txt1 = input.nextLine();

		System.out.print("Enter second text: ");
		String txt2 = input.nextLine();

		boolean checkResult = isAnagram(txt1, txt2);

		if (checkResult) {
			System.out.println("Anagram!");
		} else {
			System.out.println("No Anagram");
		}

		input.close();

	}

	private static boolean isAnagram(String txt1, String txt2) {
		if (!txt1.matches("[A-Za-z\\s,.;]*") || !txt2.matches("[A-Za-z\\s,.;]*")) {
			return false;
		}
		txt1 = txt1.replaceAll("[\\s,.;]", "").toLowerCase();
		txt2 = txt2.replaceAll("[\\s,.;]", "").toLowerCase();

		if (txt1.isEmpty() || txt2.isEmpty()) {
			return false;
		}

		char[] arr1 = txt1.toCharArray();
		char[] arr2 = txt2.toCharArray();

		Arrays.sort(arr1);
		Arrays.sort(arr2);

		return Arrays.equals(arr1, arr2);
	}

}
/*
 * Create a program called StringsAnagramOrNot that has a method called
 * isAnagram that determines whether two texts are anagrams of each other. The
 * method should take two strings as parameters and return true if the texts are
 * anagrams of each other. Otherwise, the method should return false. The main
 * method first inputs two strings from the user and then calls the method
 * isAnagram with the inputted strings. Finally, the main method prints either
 * "Anagram!" or "No anagram". Rules (in this exercise) • The method isAnagram
 * should allow only letters, whitespace, )commas, dots, and semicolons in a
 * string. If there are any other characters, then the string cannot contain an
 * anagram. • The method should ignore all whitespace, semicolons, commas and
 * dots when it determines if two texts are anagrams of each other. • If there
 * are no letters in the text, then the text cannot be an anagram. Hints • When
 * some validation fails in a method, you can terminate the method execution
 * immediately by executing a return statement. • The replace method might be
 * useful in removing those characters that should be ignored in anagram
 * checking. Some sorting might simplify your algorithm
 */
