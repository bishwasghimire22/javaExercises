package classObj2;

import java.util.ArrayList;
import java.util.Scanner;

import classAndObj1.WordPair;

public class ObjectsTranslatorArrayList {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		ArrayList<WordPair> wordpair = new ArrayList<WordPair>();

		System.out.println("=== Creating an English-Finnish dictionary (ok ends) ===");
		while (true) {
			System.out.print("Enter an English word: ");
			String englishWord = input.nextLine();

			if (englishWord.equalsIgnoreCase("Ok")) {
				break;
			}
			System.out.print("Enter an Finnish word: ");
			String finnishWord = input.nextLine();
			System.out.println();

			wordpair.add(new WordPair(englishWord, finnishWord));

		}

		System.out.println("\n===English-Finnish translation service (quit ends) ===");

		while (true) {
			System.out.print("Enter an English word: ");
			String usrInput = input.nextLine();

			if (usrInput.equalsIgnoreCase("Quit")) {
				System.out.println("Bye !");
				break;
			}

			String wordFound = "Unknown word";

			for (WordPair wp : wordpair) {

				if (usrInput.equalsIgnoreCase(wp.getEnglishWord())) {
					wordFound = wp.getFinnishWord();
					break;
				}

			}
			System.out.println(wordFound);
			System.out.println();

		}

		input.close();
	}

}
/*
 * Create a program called ObjectsTranslatorArrayList that first inputs pairs of
 * English and Finnish words from the user until he/she enters "ok" as the
 * English word. Then the program should input English words from the user until
 * the user decides to quit by entering "quit". For each entered word, the
 * program prints the corresponding Finnish word. If the word is unknown, the
 * program should display "Unknown word". NB! Reuse the WordPair class from a
 * previous exercise and use the ArrayList class to create a list of WordPairs.
 */
