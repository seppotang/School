import java.util.Scanner;

public class SalaryCalc {
    public static void main(String[] args) {
        
        //Initialize Variables
        double mySum = 0, daySalary = 0, totalPay;
        int pennyCount = 1;
        int periodLength;
        int i;
        
        //Implement keyboard to collect user data
        Scanner keyboard = new Scanner(System.in);
        
        //Control User input for only positive integers
        do {
            System.out.println("How many days shall I calculate?");
        while(!keyboard.hasNextInt()){
            System.out.println("That's not a number!");
            System.out.println("How many days shall I calculate?");
            keyboard.next();
        }
        periodLength = keyboard.nextInt();
            if(periodLength <= 0) {
                System.out.println("Please enter a positive number.");
            }
        } while(periodLength <= 0);
        
        System.out.printf("%14s", "Day");
        System.out.printf("%14s","Salary(USD)");
        System.out.printf("%14s\n","Total(USD)");
        System.out.printf("%14s %14s %14s\n","---------","---------",
                "---------");
        
        //Loop through each day for user request
        for(i = 0; i < periodLength; i++){
            
            daySalary = pennyCount / 100.; // Calculate the day's salary
            mySum += daySalary; // Total up the current sum with salary
            System.out.printf("%14s %14.2f %14.2f\n", i+1 ,daySalary,mySum); 
            
            //Increment pennyCount
            pennyCount *= 2;           
        }
        
        
    }
}
