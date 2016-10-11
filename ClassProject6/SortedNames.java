import java.util.*;
import java.util.Arrays;
    
public class SortedNames {
   public static void main(String[] args) {
      
    Scanner keyboard = new Scanner(System.in);
       
    String name1, name2, name3;
    double score1, score2, score3;
      
    System.out.println("This app will prompt you to enter three"
               + "runners and their scores.");
    
    //User inputs runner and scores
    System.out.println("Please enter the first runner:");
    name1 = keyboard.next();
        System.out.println("Please enter his/her score:");
        score1 = keyboard.nextDouble();
        
    System.out.println("Please enter the second runner:");
    name2 = keyboard.next();
        System.out.println("Please enter his/her score:");
        score2 = keyboard.nextDouble();
        
    System.out.println("Please enter the third runner:");
    name3 = keyboard.next();
        System.out.println("Please enter his/her score:");
        score3 = keyboard.nextDouble();
        
        
    //PRINT OUT HEADER
    System.out.printf("%8s","Runner");
    System.out.printf("%8s\n","Time");
    System.out.printf("%8s %8s\n","------","------");
        
        
    //SORT VALUES
    if (score1 < score2 && score1 < score3) {
        System.out.printf("%8s %8.2f\n", name1,score1);
        if (score2 < score3) {
            System.out.printf("%8s %8.2f\n", name2,score2);
            System.out.printf("%8s %8.2f\n", name3,score3);
        } else {
            System.out.printf("%8s %8.2f\n", name3,score3);
            System.out.printf("%8s %8.2f\n", name2,score2);
        }
    };
    
    if (score2 < score1 && score2 < score3) {
        System.out.printf("%8s %8.2f\n", name2,score2);
        if (score1 < score3) {
            System.out.printf("%8s %8.2f\n", name1,score1);
            System.out.printf("%8s %8.2f\n", name3,score3);
        } else {
            System.out.printf("%8s %8.2f\n", name3,score3);
            System.out.printf("%8s %8.2f\n", name1,score1);
        }
    };
    
    if (score3 < score1 && score3 < score2) {
        System.out.printf("%8s %8.2f\n", name3,score3);
        if (score2 < score1) {
            System.out.printf("%8s %8.2f\n", name2,score2);
            System.out.printf("%8s %8.2f\n", name1,score1);
        } else {
            System.out.printf("%8s %8.2f\n", name1,score1);
            System.out.printf("%8s %8.2f\n", name2,score2);
        }
    };
    
    
    
        
   }
}
