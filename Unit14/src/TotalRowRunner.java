//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		int[][] ex1 = {{1,2,3},{5,5,5,5}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(ex1));	
		int[][] ex2 = {{1,2,3},{5},{1},{2,2}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(ex2));
		int[][] ex3 = {{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}};
		System.out.println("Row totals are :: " + TotalRow.getRowTotals(ex3));			
	}
}



