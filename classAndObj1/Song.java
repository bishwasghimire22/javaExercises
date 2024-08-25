package classAndObj1;

public class Song {
	private String name;
	private String artist;
	private int year;

	public Song(String name, String artist, int year) {
		this.name = name;
		this.artist = artist;
		this.year = year;
	}

	public String getName() {
		return this.name;
	}

	public String getArtist() {
		return this.artist;
	}

	public int getYear() {
		return this.year;
	}

	public String toString() {
		return this.getName() + " (" + this.getArtist() + ", " + this.getYear() + ")";
	}

}
/*
 * First, create a new class called Song as described in the diagram below. Do
 * not add any other features to the Song class. Note: The Song class should not
 * contain any code for inputting data from the user or printing data. Song -
 * String name - String artist - int year + Song(String name, String artist, int
 * year) + String getName() + String getArtist() + int getYear() + String
 * toString() Then, create a main program called ObjectsSongProgram. In the
 * program, create three objects from the Song class and assign their references
 * to reference variables. See the example output for the song names, artists
 * and years. NB! There should be exactly three variables in the main program.
 * Not less, not more. This time, do not use an array or ArrayList. Finally, the
 * program should print a song list as shown in the example output. In this
 * exercise, use the toString method to get data from each Song object to be
 * printed.
 */