package arrayHandling;

import java.util.Scanner;

public class ArraysFinnish {

	public static void main(String[] args) {
		String[] englishWord = { "bus", "car", "cat", "house", "moon", "sun", "thanks", "train", "teacher" };
		String[] finnishWord = { "bussi", "auto", "kisaa", "talo", "kuu", "aurinko", "kiitos", "juna", "opettaja" };

		Scanner input = new Scanner(System.in);
		System.out.print("Enter an English word: ");
		String txt = input.nextLine();
		boolean wordFound = false;

		System.out.println();
		for (int i = 0; i < englishWord.length; i++) {
			if (txt.equalsIgnoreCase(englishWord[i])) {
				System.out.println(finnishWord[i]);
				wordFound = true;
			}
		}
		if (!wordFound) {
			System.out.println("Unknown word");

		}

		input.close();

	}

}
/*
 * Create a program called ArraysFinnish that inputs an English word from the
 * user and translates it to Finnish. This time, the program can translate only
 * the following words: "bus", "car", "cat", "house", "moon", "sun", "thanks",
 * "train", "teacher" If the English word is unknown, the program should display
 * "Unknown word". Use two arrays in the program.
 */
