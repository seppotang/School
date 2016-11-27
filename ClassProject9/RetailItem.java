package javaapplication4;

/**
 *
 * @author Seppotang
 */
import java.util.*;

public class RetailItem {
	
	   public static void main(String[] args) {}
        
    
		private String Description; //Item description
		private int unitsOnHand; //Number of items
		private double price; //price of items
		
		
		
		public double sellItem(int decrement) {
                    unitsOnHand -= decrement;
                    return -(price * decrement);
                }
		
		public void print(String name){
			System.out.printf("%6s %-16s %5s %5s\n",name,
                                Description,unitsOnHand,price);
		}
		
		public void setDesc(String description){
			Description = description;
		}
		
		public void reStock(int increment) {
			unitsOnHand += increment;
                }
		

}
