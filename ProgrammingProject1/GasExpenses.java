import java.util.Scanner;

public class GasExpenses {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("How many miles do you drive per week?");
		double milesPerWeek = keyboard.nextDouble();
		
		System.out.println("How many miles per gallon does your auto get?");
		double mpg = keyboard.nextDouble();
		
		System.out.println("What is the current cost of gas?");
		double gasCost = keyboard.nextDouble();
		
		double milesPerYear = milesPerWeek * 52.;
		
		double gallonsPerWeek = milesPerWeek / mpg;
		double gallonsPerYear = gallonsPerWeek * 52;
		double gasCostPerWeek = gallonsPerWeek * gasCost;
		double gasCostPerYear = gasCostPerWeek * 52;
		
		System.out.println("At " + milesPerWeek + " per week, you travel " 
			+ milesPerYear + " miles per year.");
			
		System.out.println("Gallons per week: " + gallonsPerWeek + " gallons.");
		System.out.println("Gallons per year: " + gallonsPerYear + " gallons.");
		
		System.out.println("With gas at $" + gasCost + " per gallon, you will spend:");
		System.out.println("Gas expense per week: $" + gasCostPerWeek);
		System.out.println("Gas expense per year: $" + gasCostPerYear);
		
		System.out.println(" If gas goes up by one dollar per gallon to $"
			+ (gasCost + 1) + "per gallon, you will spend:");
			
		gasCost += 1.;
		
		System.out.println("Gas expense per week: $" + gasCostPerWeek);
		System.out.println("Gas expense per year: $" + gasCostPerYear);
	}
}
