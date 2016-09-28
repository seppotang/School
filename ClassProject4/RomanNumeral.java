import java.util.Scanner;

public class RomanNumeral {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int myNumber;
        
        System.out.println("Please enter an integer between 1 and 10.");
        
        myNumber = keyboard.nextInt();
        
        if (myNumber == 1){
            System.out.println("I");
        } else if (myNumber == 2) {
            System.out.println("II");
        } else if (myNumber == 3) {
            System.out.println("III");
        } else if (myNumber == 4) {
            System.out.println("IV");
        } else if (myNumber == 5) {
            System.out.println("V");
        } else if (myNumber == 6) {
            System.out.println("VI");
        } else if (myNumber == 7) {
            System.out.println("VII");
        } else if (myNumber == 8) {
            System.out.println("VIII");
        } else if (myNumber == 9) {
            System.out.println("IX");
        } else if (myNumber == 10) {
            System.out.println("X");
        } else {
            System.out.println("That was not an integer between 1 and 10.");
        }
    }
}
