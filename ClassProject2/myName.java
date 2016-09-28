public class myName {

    public static void main(String[] args){
        double myNum1 = 3.287e6;
        double myNum2 = -9.7865e12;
        double myNum3 = 7.65491e-3;
        
        System.out.printf("%.3e", myNum1);
        System.out.println("");
        System.out.printf("%.4e", myNum2);
        System.out.println("");
        System.out.printf("%.5e", myNum3);
        System.out.println("");
        
        System.out.printf("   *\n" + "  ***\n" + " *****\n" + 
                "*******\n" + " *****\n" + "  ***\n" + "   *\n");
        
        String name = "Michael";
        int age = 24;
        String favorite = "blue"; 
        /* Unable to use variable type Double as instructed */
        
        System.out.print("My name is " + name + ", my age is " + age + " and" +
                " my favorite color is " + favorite + ".");   
    }
}
