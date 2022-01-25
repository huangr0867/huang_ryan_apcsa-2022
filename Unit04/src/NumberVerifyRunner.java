//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		System.out.println("5 is odd :: " + NumberVerify.isOdd(5));
		System.out.println("5 is even :: " + NumberVerify.isEven(5));
		
		//add in more test cases
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a whole number :: ");
		int a = keyboard.nextInt();
		System.out.println(a + " is odd :: " + NumberVerify.isOdd(a));
		System.out.println(a + " is even :: " + NumberVerify.isEven(a));
		
		System.out.print("Enter a whole number :: ");
		int a2 = keyboard.nextInt();
		System.out.println(a2 + " is odd :: " + NumberVerify.isOdd(a2));
		System.out.println(a2 + " is even :: " + NumberVerify.isEven(a2));
		
		System.out.print("Enter a whole number :: ");
		int a3 = keyboard.nextInt();
		System.out.println(a3 + " is odd :: " + NumberVerify.isOdd(a3));
		System.out.println(a3 + " is even :: " + NumberVerify.isEven(a3));
		
		System.out.print("Enter a whole number :: ");
		int a4 = keyboard.nextInt();
		System.out.println(a4 + " is odd :: " + NumberVerify.isOdd(a4));
		System.out.println(a4 + " is even :: " + NumberVerify.isEven(a4));
		
		System.out.print("Enter a whole number :: ");
		int a5 = keyboard.nextInt();
		System.out.println(a5 + " is odd :: " + NumberVerify.isOdd(a5));
		System.out.println(a5 + " is even :: " + NumberVerify.isEven(a5));
	}
}