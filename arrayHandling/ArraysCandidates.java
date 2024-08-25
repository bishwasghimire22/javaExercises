package arrayHandling;

import java.util.Scanner;

public class ArraysCandidates {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of candidates: ");
		int num = Integer.parseInt(input.nextLine());

		String[] candidate = new String[num];
		int[] vote = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.print("Enter name: ");
			candidate[i] = input.nextLine();
			System.out.print("Enter " + candidate[i] + "'s votes: ");
			vote[i] = Integer.parseInt(input.nextLine());
		}

		int maxVotes = vote[0];
		for (int i = 0; i < num; i++) {
			if (vote[i] > maxVotes) {
				maxVotes = vote[i];

			}
		}

		int maxVotesCount = 0;
		for (int i = 0; i < num; i++) {
			if (vote[i] == maxVotes) {
				maxVotesCount++;

			}
		}
		System.out.println();

		if (maxVotesCount > 1) {
			System.out.println("It is a tie!");
			for (int i = 0; i < num; i++) {
				if (vote[i] == maxVotes) {
					System.out.println(candidate[i] + " (" + maxVotes + " votes)");

				}
			}
		} else {
			for (int i = 0; i < num; i++) {
				if (vote[i] == maxVotes) {
					System.out.println(candidate[i] + " is the winner with " + maxVotes + " votes!");

				}
			}

		}
		input.close();

	}

}
/*
 * Create a program called ArraysCandidates. First, the program inputs the
 * number of candidates. You can suppose that there is always at least one
 * candidate. Then, the program should input name and the number of votes for
 * each candidate. Finally, the program should determine the winner and display
 * the winner's name and votes. If the election is a tie, then the program
 * should print the names and votes of the candidates who share the highest
 * votes.
 */
