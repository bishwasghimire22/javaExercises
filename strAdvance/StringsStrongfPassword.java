package strAdvance;

import java.util.Scanner;

public class StringsStrongfPassword {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter password: ");
		String pwd = input.nextLine();

		boolean checkPassword = checkStrength(pwd);

		if (checkPassword) {
			System.out.println("OK");
		} else {
			System.out.println("Not strong enough!");
		}

		input.close();

	}

	private static boolean checkStrength(String pwd) {
		boolean hasUpperCase = false;
		boolean hasLowerCase = false;
		boolean hasDigits = false;
		boolean hasOtherChar = false;

		if (pwd.length() < 8) {
			return false;
		}

		for (char ch : pwd.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				hasUpperCase = true;
			} else if (Character.isLowerCase(ch)) {
				hasLowerCase = true;
			} else if (Character.isDigit(ch)) {
				hasDigits = true;
			} else {
				hasOtherChar = true;
			}

		}
		int catagoriesCount = 0;
		if (hasDigits)
			catagoriesCount++;
		if (hasUpperCase)
			catagoriesCount++;
		if (hasLowerCase)
			catagoriesCount++;
		if (hasOtherChar)
			catagoriesCount++;

		return catagoriesCount >= 3;
	}

}
/*
 * Create a program called StringsStrongfPassword that has a method called
 * checkStrength that checks the strength of a password. The method should take
 * a password as parameter and return true if the password is strong enough.
 * Otherwise, it should return false. The main method first inputs a password
 * from the user. Then it calls the method checkStrength with the inputted
 * password. Finally, the main method prints "OK" if the password is strong
 * enough. Otherwise it prints "Not strong enough!" A password is considered to
 * be strong enough if it has at least 8 characters and it includes characters
 * from at least three different categories. The four categories of characters
 * are the following: uppercase letters, lowercase letters, digits, and other
 * characters.
 */
