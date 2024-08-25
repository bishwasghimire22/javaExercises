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
