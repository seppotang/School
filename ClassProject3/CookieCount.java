import java.util.Scanner;

/**
 *
 * @author cwcis
 */


public class CookieCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int cookieCount;
        double cupsSugar;
        double cupsButter;
        double cupsFlour;
        
        System.out.println("How many cookies are desired?");
        cookieCount=keyboard.nextInt();
        
        cupsSugar = 1.5*(cookieCount/48.);
        cupsButter = 1*(cookieCount/48.);
        cupsFlour = 2.75*(cookieCount/48.);
        
        System.out.printf("%.2f cups of sugar needed.\n", cupsSugar);
        System.out.printf("%.2f cups of butter needed.\n", cupsButter);
        System.out.printf("%.2f cups of flour needed.\n", cupsFlour);
    }
    
}
