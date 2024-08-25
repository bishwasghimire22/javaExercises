package classAndObj1;

public class WordPair {
	private String englishWord;
	private String finnishWord;

	public WordPair(String englishWord, String finnishWord) {
		this.englishWord = englishWord;
		this.finnishWord = finnishWord;
	}

	public String getEnglishWord() {
		return this.englishWord;
	}

	public String getFinnishWord() {
		return this.finnishWord;
	}

}
/*
 * First, create a new class called WordPair. The features of the WordPair class
 * should be exactly as shown in the diagram below. NB! The class should have no
 * other fields or methods than shown in the diagram. The WordPair class should
 * not contain any code for inputting data from the user or printing data.
 * WordPair - String englishWord - String finnishWord + WordPair(String
 * englishWord, String finnishWord) + String getEnglishWord() + String
 * getFinnishWord() Then, create a main program called ObjectsWordPairsProgram.
 * In the program, create three objects from the WordPair class and assign their
 * references to reference variables. See the example output for the English and
 * Finnish words. Finally, the program should print the words held by the
 * WordPair objects as shown in the example output. Use the get methods to get
 * the English and Finnish words from the WordPair objects.
 */
