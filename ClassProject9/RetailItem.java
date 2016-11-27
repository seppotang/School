package javaapplication4;

/**
 *
 * @author Seppotang
 */
import java.util.*;

public class RetailItem {
	
        //Initialize Variables
	private String description; //Item description
	private int unitsOnHand; //Number of items
	private double price; //price of items
        public int leftover;

 
	public RetailItem(String description, int unitsOnHand, double price){
		this.price = price;
		this.unitsOnHand = unitsOnHand;
		this.description = description;
	}
		
		
		public double sellItem(int decrement) {
                    if(unitsOnHand >= decrement) {
                        unitsOnHand -= decrement;
                        return (price * decrement);
                    } else {
                        leftover = unitsOnHand;
                        unitsOnHand = 0;
                        return (price * leftover);
                    }   
                }
                        
                
		
		public void print(String name){
			System.out.printf("%6s %-16s %5s %5s\n",name,
                                description,unitsOnHand,price);
		}
		
		public void setDesc(String description){
			description = description;
		}
		
		public void reStock(int increment) {
			unitsOnHand += increment;
                }
		

}
