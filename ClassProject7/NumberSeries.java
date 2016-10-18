public class NumberSeries {

    public static void main(String[] args) {
        
        //Initialize variables
        int i;
        double mySum = 0;
        
        //Loops, prints each fraction and adds to double mySum
        for(i=1; i<=30; i++) {
            mySum += (i / (31. - i));
            System.out.print(i + "/" + (31-i));
            
            //Add plus signs for demonstration of code between all numbers
            if(i<30){
            System.out.print(" + ");
            }
            
            //Too many lines, split presentation
            if (i==15){ 
                System.out.println();
            }
        }
        System.out.printf("\n**********");
        System.out.printf("\n Total is %.2f\n",mySum); // Print mysum as decimal
    }
    
}
