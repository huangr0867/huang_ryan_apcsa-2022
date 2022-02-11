//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayOddToEven
{
	public static int go(int[] ray)
	{	
		int firstOdd = -1;
		int firstEven = -1;
		
		for (int i = 0; i < ray.length; i++) {
			if (ray[i] % 2 != 0) {
				firstOdd = i;
				break;
			}
		}
		
		if (firstOdd > -1) {
			for (int j = firstOdd; j < ray.length; j++) {
				if (ray[j] % 2 == 0) {
					firstEven = j;
					break;
				}
			}
		}
		
		if (firstEven == -1) {
			return firstEven;
		}
		else {
			return firstEven - firstOdd;
		}
	}
}