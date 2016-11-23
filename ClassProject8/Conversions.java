import java.util.Scanner; 

public class Conversions {
    
//Initialize constructors before main
public static void showKilometers(double meters) //Convert to Kilos
{ 
double kilometers = meters * 0.001; 
System.out.println(meters +" meters is " + kilometers + " kilometers."); 
} 

public static void showInches(double meters) //Convert to Inches
{ 
double inches = meters * 39.37; 
System.out.println(meters +" meters is " + inches + " inches."); 
} 

public static void showFeet(double meters) //Convert to feet
{ 
double feet = meters * 3.281; 
System.out.println(meters +" meters is " + feet + " feet."); 
} 

public static void quitProgram() 
{ 
System.out.println("Goodbye!"); 
System.out.println(0); 
} 
public static void showMenu() 
{ 
System.out.println(" 1. Convert to kilometers "); 
System.out.println(" 2. Convert to inches "); 
System.out.println(" 3. Convert to feet "); 
System.out.println(" 4. Quit the program "); 
System.out.println(" "); 
} 

//Define main function
public static void main (String [] args) 
{ 

double meters; 
int choice; 



Scanner keyboard = new Scanner (System.in); 

System.out.println("Enter a distance in meters: "); 
meters = keyboard.nextDouble(); 
showMenu(); 
choice = keyboard.nextInt(); 
switch(choice) { 
    case 1: 
        showKilometers(meters); 
        break; 
    case 2:
        showInches(meters); 
        break; 
    case 3:
        showFeet(meters); 
        break; 
    case 4: 
    quitProgram(); 
        } 
    } 
} 
