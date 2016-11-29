package programmingproject3;

/**
 *
 * @author Seppotang
 */


public class BushelBasket {
    
    //Initialize variable (amount)
    public int amount;
    
    public BushelBasket(int amount) {
        if(amount < 0) {
            this.amount = 0;
        } else if(amount > 125) {
            this.amount = 125;
        } else {
            this.amount = amount;
        }
    }
    
    public BushelBasket() {
        amount = 0;
    }
    
    public void print() {
        System.out.println("The bushel basket has " + amount + 
                " apples in it.");        
    }
    
    public void pick(int increment) {
        if((amount += increment) <= 125) { 
            //Checks if true and returns at same time.
        }
        
        else {
            //If amount is larger than 125, set to 125.
            amount = 125;
        }
    }
    
    public void eat(int decrement) {
        if((amount -= decrement) >= 0) { //Checks if true and returns value.
        }
        
        else{
            amount = 0;
        }
    }
    
    //Boolean tests
    
    public boolean isEmpty() {
        if(amount > 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public boolean isFull() {
        if(amount == 125) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int getApples() {
        return amount;
    }
    
    public int roomLeftInBasket() {
        return (125 - amount);
    }
    
    public void spill() {
        amount = 0;
    }
    
}
