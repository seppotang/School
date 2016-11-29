package programmingproject3;

/**
 *
 * @author Seppotang
 */


public class AppleOrchard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Rick...");
       BushelBasket rick = new BushelBasket(0);
      rick.print();
      rick.pick(11);
      rick.pick(22);
      rick.print();
      rick.eat(4);
      rick.print();
      rick.spill();
     rick.print();
       System.out.println("Newt...");
     BushelBasket newt = new BushelBasket(100);
     newt.print();
     System.out.println(newt.isEmpty());
     System.out.println(newt.isFull());   
     System.out.println(newt.getApples());
     System.out.println(newt.roomLeftInBasket());
       System.out.println("Michelle...");
     BushelBasket michele = new BushelBasket(0); 
     System.out.println(michele.isEmpty());
     System.out.println(michele.isFull()); 
     michele.pick(25);
     System.out.println(michele.isEmpty());
     System.out.println(michele.isFull()); 
     michele.pick(100);
     System.out.println(michele.isEmpty());
     System.out.println(michele.isFull()); 
       System.out.println("Herman...");
     BushelBasket herman = new BushelBasket(-5); 
     herman.print();
       System.out.println("Jon...");
     BushelBasket jon = new BushelBasket(300); 
     jon.print();
          System.out.println("Ron...");
        BushelBasket ron = new BushelBasket(20);
      ron.print();
      ron.eat(50);
      ron.print();
      ron.eat(10);
      ron.pick(1000);
      ron.print();
           System.out.println("Gary...");
      BushelBasket gary = new BushelBasket();
      gary.print();
    }
}
