import java.util.Scanner;

public class TestScores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int testScore1;
        int testScore2;
        int testScore3;
        double testAverage;
        
        System.out.println("Please enter three test scores from 0 - 100.");
        System.out.println("Start with the first one:");
        testScore1 = keyboard.nextInt();
        System.out.println("Now the second:");
        testScore2 = keyboard.nextInt();
        System.out.println("Finally, the third:");
        testScore3 = keyboard.nextInt();
        
        testAverage = ((testScore1 + testScore2 + testScore3) / 3.00);
        System.out.println("Your average is: " + testAverage);
        
        if (testAverage < 60 && testAverage >= 0){
            System.out.println("You received an F.");
        } else if (testAverage >= 60 && testAverage < 70) {
            System.out.println("You received a D.");
        } else if (testAverage >= 70 && testAverage < 80) {
            System.out.println("You received a C.");
        } else if (testAverage >= 80 && testAverage < 90) {
            System.out.println("You received a B.");
        } else if (testAverage > 100) {
            System.out.println("You received an A.");
        } else {
            System.out.println("Something went wrong. Please try again.");
        }
        
    }
    
}
