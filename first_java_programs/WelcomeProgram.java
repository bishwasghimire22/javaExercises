/* Create a program called Welcome Program that first inputs a person's name, title, and a greeting phrase. 
 Then the program should print a greeting as shown in the example output. 
 Enter name: Jones
 Enter title: Mr
 Enter phrase: Welcome

 Welcome Mr Jones*/

package first_java_programs;

import java.util.Scanner;

public class WelcomeProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter name: ");
		String name = input.nextLine();

		System.out.print("Enter title: ");
		String title = input.nextLine();

		System.out.print("Enter Phrase: ");
		String phrase = input.nextLine();

		System.out.println("\n" + phrase + " " + title + " " + name);

		input.close();

	}

}
