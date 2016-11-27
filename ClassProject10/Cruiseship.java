package programmingproject12;

/**
 *
 * @author Seppotang
 */
public class Cruiseship extends Ship {
    
    public int MaxPass;
    
    public Cruiseship() {
        MaxPass = 200;
    }
    
    public Cruiseship(String Name, int Year,int MaxPass) {
        this.Name = Name;
        this.MaxPass = MaxPass;
        this.Year = Year;
    }
    
    public Cruiseship(String Name) {
        this.Name = Name;
        this.Year = 2005;
        this.MaxPass = 200;
    }
    
    public void print()
        {
            System.out.println("ship: " + Name + " constructed in "+ Year +
                ", can carry " + MaxPass + " passengers.");
        }
    
}
