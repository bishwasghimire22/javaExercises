package stringHandlingBasics;

import java.util.Scanner;

public class StringUsername {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.print("Enter surname: ");
		String surname = input.nextLine();

		String userName = createUsername(name, surname);
		if (userName == null) {
			System.out.println("Not enough letters to create a username!");
		} else {
			System.out.println(userName);
		}

		input.close();

	}

	private static String createUsername(String name, String surname) {
		if (surname.length() < 3 || name.length() < 2) {
			return null;
		}
		String userName = surname.substring(surname.length() - 3) + name.substring(0, 2);
		return userName.toLowerCase();
	}

}
/*
 * Create a program called StringUsername that has a method called
 * createUsername that creates a new username based on the user's given name and
 * surname. The method should take the given name and surname as parameters and
 * return either a new username or null if a new username cannot be created. The
 * main method should first input given name and surname from the user and then
 * call the method createUsename with the inputted data. Finally, the main
 * method either should print the username or
 * "Not enough letters to create a username!" A username should be written in
 * small letters only and it should include the last three letters from the
 * surname and the first two letters from the given name. No username should be
 * created if there are not enough letters available in the inputted given name
 * or surname..
 */
