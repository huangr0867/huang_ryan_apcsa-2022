//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases
		LetterRemover a = new LetterRemover();
		
		a.setRemover("I am Sam I am", 'a');
		out.println(a);
		
		a.setRemover("ssssssssxssssesssssesss", 's');	
		out.println(a);
		
		a.setRemover("qwertyqwertyqwerty", 'a');
		out.println(a);
		
		a.setRemover("abababababa", 'b');
		out.println(a);
		
		a.setRemover("abababababa", 'x');
		out.println(a);
		
	}
}