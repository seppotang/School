import java.util.*;

public class RetailItem {
	
	//Variable initialization
		private String Description; //Item description
		private int unitsOnHand; //Number of items
		private double price; //price of items
		
		public RetailItem(String description, int unitsOnHand, double price) {
			this.description = Description;
			this.unitsOnHand = unitsOnHand;
			this.price = price;
		}
		
		public void sellItem(int decrement) {
			unitsOnHand-= decrement;
			return price;
		}
		
		public void print(String name){
			System.out.printf("%6s %-16s %5s %5s\n",name,Description,unitsOnHand,price);
		}
		
		public void setDesc(String description){
			Description = description;
		}
		
		public void reStock(int increment) {
			unitsOnHand += increment;
		}
}
