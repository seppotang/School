import java.util.Scanner;

public class cookieCount {

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
        
        System.out.println(cupsSugar);
        System.out.println(cupsButter);
        System.out.println(cupsFlour);
        
        
        
        
    }
    
}