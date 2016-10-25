import java.util.*;

public class Part1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        int sales1, sales2, sales3;
        int i;
        
        do {
        System.out.println("Enter today's sales for store 1:");
        while(!keyboard.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Enter today's sales for store 1:");
            keyboard.next();
        }
        sales1 = keyboard.nextInt();
            if(sales1 < 0) {
                System.out.println("Please enter a positive value.");
            }
        } while(sales1 < 0);
        
        do {
        System.out.println("Enter today's sales for store 2:");
        while(!keyboard.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Enter today's sales for store 2:");
            keyboard.next();
        }
        sales2 = keyboard.nextInt();
            if(sales2 < 0) {
                System.out.println("Please enter a positive value.");
            }
        } while(sales2 < 0);
        
        do {
        System.out.println("Enter today's sales for store 3:");
        while(!keyboard.hasNextInt()) {
            System.out.println("That's not a number!");
            System.out.println("Enter today's sales for store 3:");
            keyboard.next();
        }
        sales3 = keyboard.nextInt();
            if(sales3 < 0) {
                System.out.println("Please enter a positive value.");
            }
        } while(sales3 < 0);
        
        System.out.println("SALES BAR CHART");
        
        System.out.print("Store 1: ");
        for(i=1; i <= sales1; i++) {
            
            if(i % 10 == 0) {
                System.out.print("x");
            } else {
                System.out.print("*");
            }
        }
        
        System.out.println("");
        
        System.out.print("Store 2: ");
        for(i=1; i <= sales2; i++) {
            
            if(i % 10 == 0) {
                System.out.print("x");
            } else {
                System.out.print("*");
            }
        }
        
        System.out.println("");
        
        System.out.print("Store 3: ");
        for(i=1; i <= sales3; i++) {
            
            if(i % 10 == 0) {
                System.out.print("x");
            } else {
                System.out.print("*");
            }
        }
        
    }
    
}
