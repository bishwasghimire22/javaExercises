/*Create a program called PersonProgram that first inputs age, given name, and profession from the user. 
Then the program should print the inputted data as shown in the example output.
Enter age: 27
Enter given name: Wendy
Enter profession: dentist

Wendy is a dentist who is 27 years of age.*/
package first_java_programs;

import java.util.Scanner;

public class PersonProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter age: ");
		int age = Integer.parseInt(input.nextLine());

		System.out.print("Enter given name: ");
		String name = input.nextLine();

		System.out.print("Enter proffesion: ");
		String proff = input.nextLine();

		System.out.println("\n" + name + " is a " + proff + " who is " + age + " years of age.");

		input.close();

	}

}
