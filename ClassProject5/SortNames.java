import java.util.*;

public class SortNames {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("This program is going to ask you to"
                + " input 3 names.");
        System.out.println("Please input the first name:");
        String firstName = keyboard.next();
        System.out.println("Please input the second name:");
        String secondName = keyboard.next();
        System.out.println("Please input the third name:");
        String thirdName = keyboard.next();
        
        List<String> nameList=new ArrayList();
        nameList.add(firstName);
        nameList.add(secondName);
        nameList.add(thirdName);
        
        Collections.sort(nameList);

        nameList.forEach(System.out::println);
        
        System.out.println("These values should be organized alphabetically.");
    }
}
