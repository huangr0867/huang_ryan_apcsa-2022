//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	ArrayList<Integer> totals = new ArrayList<Integer>();
    	int total = 0;
    	for (int i = 0; i < m.length; i++) {
    		for (int j = 0; j < m[i].length; j++) {
    			total += m[i][j];
    		}
    		totals.add(total);
    		total = 0;
    	}
		return totals;
    }
}
