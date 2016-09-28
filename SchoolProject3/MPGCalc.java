public class MPGCalc {
    public static void main(String[] args) {
        int numMilesDriven;
        String milesDriven;
        String gasUsed;
        int numGasUsed;
        int mpg;
        
        milesDriven = JOptionPane.showInputDialog("How many miles have you"
                + " driven?");
        
        numMilesDriven = Integer.parseInt(milesDriven);
        
        gasUsed = JOptionPane.showInputDialog("How much gas have you used "
                + "in gallons?");
        numGasUsed = Integer.parseInt(gasUsed);
        
        mpg = numMilesDriven / numGasUsed;
        
        JOptionPane.showMessageDialog(null, "Your MPG is " + mpg + ".");
        
    }
}
