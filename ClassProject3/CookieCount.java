package javaapplication1;

import static java.time.Clock.system;
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
        int cupsButter;
        double cupsFlour;
        
        System.out.println("How many cookies are desired?");
        cookieCount=keyboard.nextInt();
        
        cupsSugar = 1.5*(cookieCount/48);
        cupsButter = 1*(cookieCount/48);
        cupsFlour = 2.75*(cookieCount/48);
        
        System.out.println(cupsSugar + " cups of sugar needed.");
        System.out.println(cupsButter + " cups of butter needed.");
        System.out.println(cupsFlour + " cups of flour needed.");
    }
    
}
