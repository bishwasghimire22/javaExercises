package classAndObj1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ObjectsCertificationProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Coach[] arr = new Coach[4];
		DecimalFormat oneDeci = new DecimalFormat("0.0 %");

		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter coach name: ");
			String name = input.nextLine();
			
			System.out.print("Enter " + name + "'s score: ");
			int score = Integer.parseInt(input.nextLine());

			arr[i] = new Coach(name, score);
		}
		System.out.print("\nEnter the minimum passsing score: ");
		int passingScore = Integer.parseInt(input.nextLine());
		
		int passingCount = 0;
		System.out.println("\nPassing scores");
		
		for (Coach c : arr) {
			if (c.getScore() >= passingScore) {
				System.out.println(c.getName() + " (" + c.getScore() + " points)");
				passingCount++;
			}
		}
		double passingRate = (double) passingCount / arr.length;
		System.out.println("The passing rate is " + oneDeci.format(passingRate));

		input.close();
	}

}
/*
 * First, create a new class called Coach. The features of the class should be
 * exactly as shown in the diagram below. Coach - String name - int score +
 * Coach(String name, int points) + String getName() + int getScore() Then,
 * create a main program called ObjectsCertificationProgram. In the program,
 * Create an array of four Coaches. Input names and scores of four coaches from
 * the user. Create a Coach object for each coach and assign its reference to
 * the array. Input the minimum passing score. List all those coaches (name,
 * score) who have passed the test. Finally, show the certification test passing
 * rate.
 */
