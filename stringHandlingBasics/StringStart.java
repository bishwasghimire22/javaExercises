package stringHandlingBasics;

import java.util.Scanner;

public class StringStart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		
		System.out.println();
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		System.out.println(str.length() + " characters");
		
		input.close();

	}

}
/*Create a program called StringStart that first inputs a string from the user.
 *  Then the program should print the following: 
 the string in all small letters, 
 the string in all capital letters, and 
 the length of the string.*/
