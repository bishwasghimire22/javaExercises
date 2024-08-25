package stringHandlingBasics;

import java.util.Scanner;

public class StringPasswordStrength {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter username: ");
		String uName = input.nextLine();

		System.out.print("Enter password: ");
		String pwd = input.nextLine();

		boolean check = checkStrength(uName, pwd);

		if (check) {
			System.out.println("OK");
		} else {
			System.out.println("NOT OK");
		}

		input.close();

	}

	private static boolean checkStrength(String uName, String pwd) {
		if ( pwd.length() < 9) {
			return false;
		} 
		if(pwd.toLowerCase().contains(uName.toLowerCase())) {
			return false;
		}
		return true;

	}

}
/*
 * Create a program called StringPasswordStrength that has a method called
 * checkStrength that checks whether a password meets the requirements. The
 * method should take a username and password as parameters and return true if
 * the password passes the validation. Otherwise, it should return false. The
 * main method first inputs a user name and password from the user and then
 * calls the method checkStrength with the inputted data. Finally, the main
 * method should print "OK" if the password strength is ok. Otherwise, it should
 * print "NOT OK" The password validation rules are the following: 
 * • A password should be at least nine characters long.
   • A password should not include the username.
 */
