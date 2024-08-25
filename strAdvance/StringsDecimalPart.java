package strAdvance;

import java.util.Scanner;

public class StringsDecimalPart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a decimal number: ");
		String decimal = input.nextLine().replace(',', '.');

		int decimalIndex = decimal.indexOf('.');
		int afterDecimalCount;

		if (decimalIndex == -1 || (decimalIndex == decimal.length() - 1) || decimalIndex == 0
				|| decimalIndex != decimal.lastIndexOf('.')) {
			System.out.println("Please enter a proper decimal number");
		} else {
			afterDecimalCount = decimal.substring(decimalIndex + 1).length();
			System.out.println(afterDecimalCount + " decimal place(s)");
		}

		input.close();

	}

}
/*
 * Create a program called StringsDecimalPart that first inputs a decimal number
 * from the user. Then the program determines how many digits there are after
 * the decimal point in the decimal number. Finally, the program prints the
 * result. If the inputted value is not a "proper decimal number", the program
 * should print "Please enter a proper decimal number". Rules (in this exercise)
 * • A "proper decimal number" includes at least one digit in the integer part,
 * a comma or dot as the decimal separator, and at least one digit in the
 * fractional part. Hints • Most of the algorithm involves string handling. That
 * is, you have to save the inputted string. • The normal conversion from String
 * to double can be used to validate the input. But, you need to do some extra
 * checking to make sure that the input is a "proper decimal number". • The
 * indexOf method is very useful here.
 */
