//(c) A+ Computer Science

import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
	
		int max = 0;
		boolean greatestFactor = false;
		
		int gcd = 0;
		if (a > b && a > c) {
			max = a;
		}
		else if (b > a && b > c) {
			max = b;
		}
		else {
			max = c;
		}
					
		for (int i = 1; i < max; i++) {
			if (a%i == 0 && b%i == 0 && c%i == 0) {
				gcd = i;
			}
		}
					
		if (gcd == 1) {
			greatestFactor = true;
		}
			else {
				greatestFactor = false;
		}

		if (greatestFactor == true) {
			return 1;
		}
		else {
			return 0;
		}
	}
	

	public String toString()
	{
		String output = "";

		boolean pythag = false;
		boolean evenOdd = false;

		
		for (int a = 0; a < number; a++) {
			for (int b=0; b < number; b++) {
				for (int c = 0; c < number; c++) {	
					if ((a*a) + (b*b) == c*c) {
						pythag = true;
					}
					else {
						pythag = false;
					}
					
					if ((a%2 == 1) && (b%2 == 0) && (c%2 == 1)) {
						evenOdd = true;
					}
					else if ((a%2 == 0) && (b%2 == 1) && (c%2 == 1)) {
						evenOdd = true;
					}
					else {
						evenOdd = false;
					}
					
					if (pythag == true && evenOdd == true && greatestCommonFactor(a, b, c) == 1 && a != b && a != c && b != c && a < b && b  < c) {
						output = a + " " + b + " " + c;
						System.out.println(output);
					}
				}
			}
		}
		return "\n";
	}
}