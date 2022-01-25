//(c) A+ Computer Science
//www.apluscompsci.com

//Name - 
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		double disc = Discount.getDiscountedBill(amt);
		out.printf("Bill after discount :: %.2f\n", disc);
		
		out.print("Enter the original bill amount :: ");
		double amt2 = keyboard.nextDouble();
		double disc2 = Discount.getDiscountedBill(amt2);
		out.printf("Bill after discount :: %.2f\n", disc2);
		
		out.print("Enter the original bill amount :: ");
		double amt3 = keyboard.nextDouble();
		double disc3 = Discount.getDiscountedBill(amt3);
		out.printf("Bill after discount :: %.2f\n", disc3);
		
		out.print("Enter the original bill amount :: ");
		double amt4 = keyboard.nextDouble();
		double disc4 = Discount.getDiscountedBill(amt4);
		out.printf("Bill after discount :: %.2f\n", disc4);
		
		out.print("Enter the original bill amount :: ");
		double amt5 = keyboard.nextDouble();
		double disc5 = Discount.getDiscountedBill(amt5);
		out.printf("Bill after discount :: %.2f\n", disc5);
		
		
		
		

	}
}