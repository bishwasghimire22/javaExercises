package arrayHandling;

import java.util.Scanner;

public class ArraysLetters {

	public static void main(String[] args) {
		String[] charArray = { "A", "A", "B", "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C" };
		Scanner input = new Scanner(System.in);

		System.out.print("Enter letter: ");
		String txt = input.nextLine();

		int count = 0;

		for (int i = 0; i < charArray.length; i++) {
			if (txt.equalsIgnoreCase(charArray[i])) {
				count++;
			}
		}
		// DecimalFormat oneDeci = new DecimalFormat("0.0 %");
		double percent = (double) count / charArray.length * 100;

		// System.out.println(oneDeci.format(percent));
		System.out.printf("%.1f %%", percent);

		input.close();

	}

}
/*
 * Create a program called ArraysLetters that first inputs a grade letter from
 * user. Then the program should compute and show the percentage of the grade
 * letter found in an array that contains the following values: "A", "A", "B",
 * "A", "C", "B", "C", "F", "B", "B", "B", "A", "C", "C", "C"
 */
