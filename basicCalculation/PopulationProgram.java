/*Create a program called PopulationProgram that first inputs the number of inhabitants of three areas from the user. 
 * Then the program should calculate the percentage of population in each area. 
 * The program should show the percentages with one decimal place as shown in the example output.
  	Enter the population of the area A: 12139
	Enter the population of the area B: 18764
	Enter the population of the area C: 4313

	A: 34,5 %
	B: 53,3 %
	C: 12,2 %*/
package basicCalculation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PopulationProgram {

	public static void main(String[] args) {
		DecimalFormat onedeci = new DecimalFormat("0.0");
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the population of the area A: ");
		int popA = Integer.parseInt(input.nextLine());
		System.out.print("Enter the population of the area B: ");
		int popB = Integer.parseInt(input.nextLine());
		System.out.print("Enter the population of the area C: ");
		int popC = Integer.parseInt(input.nextLine());

		int totalPopulation = popA + popB + popC;

		double percA = (double) popA / totalPopulation * 100;
		double percB = (double) popB / totalPopulation * 100;
		double percC = (double) popC / totalPopulation * 100;

		System.out.println("\nA: " + onedeci.format(percA) + " %" + "\nB: " + onedeci.format(percB) + " %" + "\nC: "
				+ onedeci.format(percC) + " %");

		input.close();

	}

}
