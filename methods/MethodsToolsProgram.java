package methods;

import java.util.Scanner;

public class MethodsToolsProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int num1 = Integer.parseInt(input.nextLine());

		System.out.print("Enter second integer: ");
		int num2 = Integer.parseInt(input.nextLine());

		System.out.print("Enter third integer: ");
		int num3 = Integer.parseInt(input.nextLine());

		int result = MethodsTools.minimum(num1, num2, num3);

		System.out.println("\nThe minimum value is " + result);

		input.close();

	}

}
/*Create a class called MethodsTools for storing generic methods. That is, the MethodsTools class is a
method library class, and it should not contain the main method. Copy your already existing code of
the minimum method from the MethodsMinimum class to the MethodsTools class and do the
minor modification to make the method accessible from outside of the MethodsTools class.
Then create a program called MethodsToolsProgram that uses the method minimum of the
MethodsTools class. The main method should input three integers from the user and call the
minimum method of the MethodsTools class to determine the minimum of the inputted values.
Finally, the main method should print the minimum value.*/
