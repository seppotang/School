import java.util.*;

public class Conversions {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int distanceM, distanceKM, distanceINCH, distanceFT;
		
		do {
		System.out.println("Please enter a distance in meters.");
		while(!keyboard.nextHasInt()){
			System.out.println("That's not a number!");
			System.out.println("Please enter a distance in meters.");
			keyboard.next();
		}
		distanceM = keyboard.nextInt();
			if(distanceM <= 0) {
				System.out.println("Please enter a positive number.");
			}
		} while(distanceM <= 0);
	}
}

public void showKilometers(distanceM) {
	distanceKM = distanceM * .001;
	System.out.println(distanceKM);
}

public void showInches(distanceM) {
	distanceINCH = distanceM * 39.27;
	System.out.println(distanceINCH);
}

public void showFeet(distanceM) {
	distanceFT = distanceM * 3.281;
	System.out.println(distanceFT);
}

public void menu() {
	System.out.println("1. Convert Kilometers");
	System.out.println("2. Convert Inches");
	System.out.println("3. Convert Feet");
	System.out.println("Please choose an option.");
	
	int selection = keyboard.nextInt();
	
	switch(selection) {
		case 1:
			showFeet(distanceM);
			break;
		case 2:
			showInches(distanceM);
			break;
		case 3:
			showFeet(distanceM);
			break;
		default:
			printf("Not an option. Please choose again.");
	}
		
	}
