public class Part2 {
    public static void main(String[] args) {
        
        int poss1, poss2, poss3, poss4, total, n1, n2, n3, n4, count;
        
        poss1 = 6;
        poss2 = 7;
        poss3 = 3;
        poss4 = 2;
        count = 0;
        
        System.out.printf("Touchdowns are 6 points, Touchdowns with\n"
                + "extra point are 7 points, Field goals are 3 points"
                + ",\nSafetys are 2 points. To make 18 points,"
                + "\nthis is how many combinations of each are available.\n\n");
        
        System.out.printf("%14s", "TD(6)");
        System.out.printf("%15s","TD+Ex(7)");
        System.out.printf("%15s","FG(3)");
        System.out.printf("%15s\n","Safety(2)");
        
        System.out.printf("%14s", "------");
        System.out.printf("%15s","------");
        System.out.printf("%15s","------");
        System.out.printf("%15s\n","------");
        
        
        
        for(n1 = 0; n1 <= 18; n1++) {
            for(n2=0; n2 <= 18; n2++) {
                for(n3=0; n3<=18; n3++) {
                    for(n4=0; n4<=18; n4++) {
                        total = n1*poss1 + n2*poss2 + n3*poss3 + n4*poss4;
                        if(total == 18) {
                            System.out.printf("%14d %14d %14d "
                                    + "%14d\n", n1,n2,n3,n4);
                            count++;
                        }
                    }
                }
            }
        }
        
        System.out.println("Number of combinations: " + count);
    }
}
