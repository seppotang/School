package programmingproject12;

/**
 *
 * @author Seppotang
 */
public class ShipDemo {
    public static void main(String[] args) {
        
        Ship base = new Ship("USS Base", 1967);
        base.print();
        Cruiseship cruise1=new Cruiseship("Concordia",2004,250);
        cruise1.print();
        Cargoship shipper = new Cargoship("USS Frieghter", 1988,500);
        shipper.print();
        Cruiseship cruise2=new Cruiseship("Roman Holiday");
        cruise2.print();
        shipper.setYear(2013);
        shipper.print();

    }
}
