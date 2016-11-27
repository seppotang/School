package programmingproject12;

/**
 *
 * @author Seppotang
 */
public class Cargoship extends Ship{
    int Capacity;
    
    public Cargoship(String Name, int Year, int Capacity) {
        this.Name = Name;
        this.Year = Year;
        this.Capacity = Capacity;
    }
    
    public void print()
        {
            System.out.println("ship: " + Name + ", constructed in "+ Year +
                ", can carry 500 " + Capacity + " tons.");
        }
}
