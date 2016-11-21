public class RetailItemDemo {
	public static void main(String[] args) {
		
		//Item1
		RetailItem Item1=new RetailItem("Jackex",12,59.95);
        
		Item1.setDesc("Jacket");
        
		System.out.println("Amount:$"+Item1.sellItem(2) );
        System.out.println("Amount:$"+Item1.sellItem(20) );
        
		//Item2
		RetailItem Item2=new RetailItem("Designer Jeans",40,34.95);
		
		//Item3
		RetailItem Item3=new RetailItem("Shirt",20,24.95);
        Item3.reStock(5);

		System.out.printf("%6s %-16s %5s %5s\n","Name","Description","Units","Price");
        Item1.print("Item1");
        Item2.print("Item2");
        Item3.print("Item3");
		
	}
}
