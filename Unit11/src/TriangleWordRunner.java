//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner test = new Scanner(System.in);
	   	String choice = "Y";
	   	while (choice.equals("Y")||choice.equals("y")){
				out.print("\n" + "Enter the word to display :: ");
				String word = test.next();		
				
	 			TriangleWord.printTriangle(word);
	 			
				out.print("\n" + "Do you want to enter more sample input? ");
				choice = test.next();			
			}
	}
}