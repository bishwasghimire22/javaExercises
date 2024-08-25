/*Create a program called ArithmeticProgram that first inputs two integers and one decimal number from the user. 
Then the program should do three separate multiplications and show their results as shown in the example output.  
• The program should accept both comma and dot as decimal part separator.
• The program should not format numbers for printing. 

Enter an integer: 2
Enter another integer: 3
Enter a decimal number: 2,5

2 * 3 = 6
2 * 2.5 = 5.0
2.5 * 2.5 = 6.25*/
package first_java_programs;

import java.util.Scanner;

public class ArithmeticProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		int num1 = Integer.parseInt(input.nextLine());
		System.out.print("Enter another integer: ");
		int num2 = Integer.parseInt(input.nextLine());
		System.out.print("Enter a decimal number: ");
		double num3 = Double.parseDouble(input.nextLine().replace(',', '.'));

		System.out.println("\n" + num1 + " * " + num2 + " = " + (num1 * num2));
		System.out.println(num1 + " * " + num3 + " = " + (num1 * num3));
		System.out.println(num3 + " * " + num3 + " = " + (num3 * num3));

		System.out.println();

		input.close();

	}

}
