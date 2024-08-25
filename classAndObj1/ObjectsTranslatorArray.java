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
