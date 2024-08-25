package classesAndObj3;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Scanner;

import classesAndObj1.WordPair;

public class ObjectsSortWordPairsLambda {

	public static void main(String[] args) {

		ArrayList<WordPair> wp = new ArrayList<WordPair>();

		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.print("Enter an English word (quit ends): ");
			String englishWord = input.nextLine();

			if (englishWord.equalsIgnoreCase("quit")) {
				break;
			}
			System.out.print("Enter a Finnish word: ");
			String finnishWord = input.nextLine();

			System.out.println();
			wp.add(new WordPair(englishWord, finnishWord));
		}
		Collections.sort(wp, (a, b) -> a.getEnglishWord().compareToIgnoreCase(b.getEnglishWord()));
		wp.forEach(arr -> System.out.println(arr.getEnglishWord() + " = " + arr.getFinnishWord()));

		Collections.sort(wp, (a, b) -> a.getFinnishWord().compareToIgnoreCase(b.getFinnishWord()));
		wp.forEach(arr -> System.out.println(arr.getFinnishWord() + " = " + arr.getEnglishWord()));

		input.close();
	}

}
/*First, create a copy of your ObjectsSortWordPairs program and name the copy as
ObjectsSortWordPairsLambda. Then, modify the copy so that you sort the list of WordPairs with
lambda expressions. */
