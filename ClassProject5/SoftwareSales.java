import java.util.*;

public class SoftwareSales {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        double packageCost = 99.00;
        
        System.out.println("Welcome to CompuCorp. Please enter"
                + " the amount of widgets you would like to order.");
        System.out.printf("Each package retails at $" + "%.2f"
                + " dollars.%n", packageCost);
        
        int numPackages = keyboard.nextInt();
        
        double grossTotal = numPackages * packageCost;
        double adjustedTotal = 0;
        double discountRate = 0;
        
        if(numPackages >= 10 && numPackages <= 19) {
            discountRate = .8;
        } else if (numPackages >= 20 && numPackages <= 49) {
            discountRate = .7;
        } else if (numPackages >= 50 && numPackages <= 99) {
            discountRate = .6;
        } else if (numPackages >= 100) {
            discountRate = .5;
        }
        
        adjustedTotal = grossTotal * discountRate;
        double discountPercent = 100 - (discountRate * 100);
        double discountAmount = grossTotal - adjustedTotal;
        
        System.out.printf("Your subtotal is $" + "%.2f" + " dollars.%n"
            , grossTotal);
        System.out.printf("Because of volume discount you received a(n) "
                + "%.2f" + "%% discount.%n", discountPercent);
        System.out.printf("That amounts to $" + "%.2f" + " dollars reducation."
                + "%n", discountAmount);
        System.out.printf("Your adjusted total is $" + "%.2f"
            + " dollars.", adjustedTotal);
        
    }
}
