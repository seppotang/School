package javaapplication2;

/**
 *
 * @author cwcis
 */


public class ArrayCalc {

    public static void main(String[] args) {
        new ArrayCalc();
    }
    
    public ArrayCalc() {
    
        double[][] sales = 
        {
            {100.3,250.1,120.2,300.2},
            {220.1,210.3,100.2},
            {145.1,400.3,210.6,200.4,50.2}               
        };
        
        System.out.printf("%16s: %7.1f\n","Total", getTotal(sales));
       System.out.printf("%16s: %7.1f\n","Average",getAverage(sales));
       /*
       System.out.printf("%16s: %7.1f\n","RowTotal",getRowTotal(sales,1));
       System.out.printf("%16s: %7.1f\n","ColumnTotal",getColumnTotal(sales,0));
       System.out.printf("%16s: %7.1f\n","RowHighestinRow",getHighestInRow(sales,2));
       System.out.printf("%16s: %7.1f\n","RowLowestinRow",getLowestInRow(sales,1));
       describe(sales);
       */
       
    }
    
    
        
        
public static double getTotal(double[][] sales){

double sum = 0.0;

for(int row = 0; row < sales.length; row++) {
    for(int col = 0; col < sales[row].length; col++) {
        sum += sales[row][col];
    }
}

return sum;
}
        
private static double getAverage(double[][] sales) {

    double sum = 0.0;
for(int row = 0; row < sales.length; row++) {
    for(int col = 0; col < sales[row].length; col++) {
        sum += sales[row][col];
    }
}

double average = sum / 12;

return average;
}

private static double getRowTotal(double[] arrayName, int arrayIndex) {
double getRowTotalAmt = 0.0;
return getRowTotalAmt;
}

private static double getColumnTotal(double[] arrayName, int arrayIndex)
{
double getColumnTotalAmt = 0.0;
return getColumnTotalAmt;
}

private static double getHighestInRow(double[] arrayName, int arrayIndex)
{
double getHighestInRowAmt = 0.0;
return getHighestInRowAmt;
}

private static double getLowestInRow(double[] arrayName, int arrayIndex) 
{
double getLowestInRowAmt = 0.0;
return getLowestInRowAmt;
}

private static void describe(double[] arrayName) {


}

    }
    
    
