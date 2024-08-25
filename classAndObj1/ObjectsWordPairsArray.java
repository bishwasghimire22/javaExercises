package classAndObj1;

public class ObjectsWordPairsArray {

	public static void main(String[] args) {
		WordPair[] wordpairArray = new WordPair[3];
		wordpairArray[0] = new WordPair("school", "koulu");
		wordpairArray[1] = new WordPair("student", "opiskelija");
		wordpairArray[2] = new WordPair("textbook", "oppikirja");
		
		for(WordPair wp: wordpairArray) {
			System.out.println(wp.getEnglishWord() + " = " + wp.getFinnishWord());
		}

	}

}
/*
 * Create a program called ObjectsWordPairsArray. This exercise is a variation
 * of the Objects Word Pair Program exercise. Please reuse the WordPair class
 * from the previous exercise and create an array of three WordPairs. Then
 * create three WordPair objects and save their references to the array. See the
 * example output for the English and Finnish words. You can either use an array
 * initializer or create the WordPair objects separately. Finally, the program
 * should iterate the array and print the words held by the WordPair objects as
 * shown in the example output.
 */
