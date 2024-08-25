package classAndObj1;

import java.util.Scanner;

public class ObjectsTranslatorArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		WordPair[] wordPairArray = { new WordPair("bird", "lintu"), new WordPair("bar", "baari"),
				new WordPair("bus", "bussi"), new WordPair("car", "auto"), new WordPair("cat", "kissa"),
				new WordPair("dog", "koira") };

		System.out.print("Enter an English word: ");
		String engWord = input.nextLine();
		String finnishWord = "Unknown word";

		for (WordPair wp : wordPairArray) {
			if (wp.getEnglishWord().equalsIgnoreCase(engWord)) {
				finnishWord = wp.getFinnishWord();
			}
		}
		System.out.println(finnishWord);

		/*
		 * for (WordPair wp : wordPairArray) { System.out.println(wp.getEnglishWord() +
		 * ": " + wp.getFinnishhWord()); }
		 */

		input.close();
	}

}
/*Create a program called ObjectsTranslatorArray that inputs an English word from the user and
translates it to Finnish. The program is a variation of your ArrayWords program.
This time, the program can translate only the following words: "bird", "bar", "bus", "car", "cat",
"dog".
If the English word is unknown, the program should display "Unknown word".
• This time, use one array only. Reuse the WordPair class from a previous exercise and create an
array of WordPairs*/
