import java.util.*;
 
public class InternetServiceProvider {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Please enter the hours used.");
        int hoursUsed = keyboard.nextInt();
        double planA, planB, planC;
                
        if (hoursUsed > 10) {
            planA = (hoursUsed-10)*2 + 9.95;
        } else {
            planA = 9.95;
        }
        
        if (hoursUsed > 20) {
            planB = (hoursUsed-20)*1 + 13.95;
        } else {
            planB = 13.95;
        }
        
        planC = 19.95;
        
        System.out.println("For " + hoursUsed + "Hours used:");
        System.out.printf("%8s","Plan");
        System.out.printf("%8s\n","Charge");
        System.out.printf("%8s %8s\n","------","------");
        System.out.printf("%8s %8s%.2f\n", "A","$",planA);
        System.out.printf("%8s %8s%.2f\n", "B","$",planB);
        System.out.printf("%8s %8s%.2f\n", "C","$",planC);
    }
}
