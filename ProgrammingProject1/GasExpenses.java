import java.util.Scanner;

public class GasExpenses {
	
	public static void main(String[] args) {
		
		/* Simple Gas Calculation app
		 * @version 1.0
		 * @author Michael Graves <mjgraves91@gmail.com>
		 * 10.06.16
		 */
		
		//Implement input for user
		Scanner keyboard = new Scanner(System.in);
		
                //Initialize variables
                double milesPerWeek;
                double mpg;
                double gasCost;
		//Ask for user's miles of commute per week
		
		//Check user input for non-int and less than or equal to zero int
		do {
		System.out.println("How many miles do you drive per week?");
		while (!keyboard.hasNextInt()) {
			System.out.println("That's not a number!");
                        System.out.println("How many miles do you drive "
                                + "per week?");
			keyboard.next();
		}
		milesPerWeek = keyboard.nextDouble();
                    if(milesPerWeek<=0) {
                        System.out.println("Please enter a positive number.");
                    }
		} while (milesPerWeek <= 0);
		System.out.println("Thank you! Got " + milesPerWeek + 
                        " miles per week.");
		
		//Ask for user's MPG
		//Check user input for non-int and less than or equal to zero int
		do {
		System.out.println("How many miles per gallon does your auto get?");
		while (!keyboard.hasNextDouble()) {
			System.out.println("That's not a number!");
			                 System.out.println("How many mpg does "
                                                 + "your auto get?");
                        keyboard.next();
		}
		mpg = keyboard.nextDouble();
                    if(mpg<=0) {
                        System.out.println("Please enter a positive number.");
                    }
		} while (mpg <= 0);
		System.out.println("Thank you! Got " + mpg + " miles per gallon.");
		
		
		//Ask for current cost of gas (USD)		
		//Check user input for non-int and less than or equal to zero int
		do {
		System.out.println("What is the current cost of gas?");
		while (!keyboard.hasNextDouble()) {
			System.out.println("That's not a number.");
                        System.out.println("What is the current cost of gas?");
			keyboard.next();
		}
		gasCost = keyboard.nextDouble();
                    if(gasCost <= 0) {
                        System.out.println("Please enter a positive number.");
                    }
		} while (gasCost <= 0);
		System.out.println("Thank you! Got " + gasCost + 
                        " dollars per gallon.");
		
		//Calculate amount of miles user drives based on per week amount
		double milesPerYear = milesPerWeek * 52.;
		
		//Calculate gallons used per week and year
		double gallonsPerWeek = milesPerWeek / mpg;
		double gallonsPerYear = milesPerYear / mpg;
		
		//Calculate cost of gas over week and year time periods
		double gasCostPerWeek = gallonsPerWeek * gasCost;
		double gasCostPerYear = gallonsPerYear * gasCost;
				
		//Inform user of conversion from miles per week to miles per year
		System.out.println("At " + milesPerWeek + " per week, you travel "  
			+ milesPerYear + " miles per year.");
		
		//Inform user of amount of gallons of gas used per week and year
		System.out.printf("Gallons per week: " + "%.1f" + 
                        " gallons.%n", gallonsPerWeek);
		System.out.printf("Gallons per year: " + "%.1f" + 
                        " gallons.%n", gallonsPerYear);
		
		//Inform user of how much they spend on gas per week and year
		System.out.println("With gas at $" + gasCost + 
                        " per gallon, you will spend:");
		System.out.printf("Gas expense per week: $" + 
                        "%.2f%n", gasCostPerWeek);
		System.out.printf("Gas expense per year: $" + 
                        "%.2f%n", gasCostPerYear);
		
		//Increment Gas Cost
		gasCost += 1.;
		
		//Inform user of possible cost increase if gas is incremented by $1
		System.out.println("If gas goes up by one dollar per gallon to $"
			+ gasCost + " per gallon, you will spend:");
		
		//Update gasCost values
		gasCostPerWeek = gallonsPerWeek * gasCost;
		gasCostPerYear = gasCostPerYear * gasCost;
		
		System.out.printf("Gas expense per week: $%.2f%n", gasCostPerWeek);
		System.out.printf("Gas expense per year: $%.2f%n", gasCostPerYear);
		
	} // End main
} // End class GasExpenses

