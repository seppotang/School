/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programmingproject12;

/**
 *
 * @author Seppotang
 */
public class Ship {
    
    //Initialize Variables
    public String Name;
    public int Year;
    
    public Ship(String Name, int Year){
		this.Name = Name;
		this.Year = Year;
		}
    
    public Ship() {
        this.Name = "";
        this.Year = 0;
    }
    
    public Ship(String Name) {
        this.Name = "";
        this.Year = 2005;
    }
    
    public void print()
        {
            System.out.println("ship: " + Name + " was built in "+ Year +
                ".");
        }
    
    public void setYear(int Year) {
        this.Year = Year;
    }
}
