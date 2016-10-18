import java.util.*;

public class CharCount {
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
        
        int i, hits = 0;
        char c;
        String str="";
        String comp;
        String s;
        
        System.out.println("Enter a string:");
        str = keyboard.nextLine();
        
        System.out.println("Enter a string:");
        s = keyboard.nextLine();
        
        for(i = 0; i< str.length(); i++) {
            c=str.charAt(i);
            
            comp=""+c;
            if(comp.equals(s)) {
                hits++;
            }
        }
        
        System.out.println("hits:" + hits);
    }
}
