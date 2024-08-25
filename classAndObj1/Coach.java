package classAndObj1;

public class Coach {
	private String name;
	private int score;

	public Coach(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return this.name;
	}

	public int getScore() {
		return this.score;
	}

}
/*
 * First, create a new class called Coach. The features of the class should be
 * exactly as shown in the diagram below. Coach - String name - int score +
 * Coach(String name, int points) + String getName() + int getScore() Then,
 * create a main program called ObjectsCertificationProgram. In the program,
 * Create an array of four Coaches. Input names and scores of four coaches from
 * the user. Create a Coach object for each coach and assign its reference to
 * the array. Input the minimum passing score. List all those coaches (name,
 * score) who have passed the test. Finally, show the certification test passing
 * rate.
 */
