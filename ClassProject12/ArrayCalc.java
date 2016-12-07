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
       System.out.printf("%16s: %7.1f\n","RowTotal",getRowTotal(sales,1));
       System.out.printf("%16s: %7.1f\n","ColumnTotal",getColumnTotal(sales,0));
       System.out.printf("%16s: %7.1f\n","RowHighestinRow",getHighestInRow(sales,2));
       System.out.printf("%16s: %7.1f\n","RowLowestinRow",getLowestInRow(sales,1));
       describe(sales);
       
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

private static double getRowTotal(double[][] sales, int rowNum) {
double sum = 0.0;

for(int col = 0; col < sales.length; col++) {
	sum += sales[rowNum][col];
}

return sum;
}

private static double getColumnTotal(double[][] sales, int colNum)
{
double sum = 0.0;

for(int row = 0; row < sales.length; row++) {
	sum += sales[row][colNum];
}

return sum;
}

private static double getHighestInRow(double[][] sales, int rowNum)
{
double highestAmt = 0.0;

for(int col = 0; col < sales.length; col++) {
	if(sales[rowNum][colNum] > highestAmt) {
		highestAmt = sales[rowNum][colNum];
	}
}
return highestAmt;
}

private static double getLowestInRow(double[][] sales, int rowNum) 
{
double lowestAmt = 10000;

for(int col = 0; col < sales.length; col++) {
	if(sales[rowNum][col] < lowestAmt) {
		lowestAmt = sales[rowNum][colNum];
	}
}
return lowestAmt;
}

private static void describe(double[][] sales) {

System.out.println("row: 0 has " );

}

    }
    
    
