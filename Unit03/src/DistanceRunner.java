//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner a = new Scanner(System.in);
        Distance run = new Distance();
        
        System.out.println("Enter X1 :: ");
        int x1 = a.nextInt();
        
        System.out.println("Enter Y1 :: ");
        int y1 = a.nextInt();
        
        System.out.println("Enter X2 :: ");
        int x2 = a.nextInt();
        
        System.out.println("Enter Y2 :: ");
        int y2 = a.nextInt();    
        
        run.setCoordinates(x1,y1,x2,y2);
        run.calcDistance();
        run.print();
	}
}