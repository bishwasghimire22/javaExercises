package classObj2;

import java.util.ArrayList;

import classAndObj1.Song;

public class ObjectsSongArrayList {

	public static void main(String[] args) {
		ArrayList<Song> song = new ArrayList<Song>();
		song.add(new Song("Easy on me", "Adele", 2021));
		song.add(new Song("Shivers", "Ed Sheeran", 2021));
		song.add(new Song("Holy Ghost Fire", "Larkin Poe", 2020));

		System.out.println("=== List of songs ===");
		for (Song sg : song) {
			System.out.println(sg.getArtist() + ": " + sg.getName() + " (" + sg.getYear() + ")");
		}

	}

}
