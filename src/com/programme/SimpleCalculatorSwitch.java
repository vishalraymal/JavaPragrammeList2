package com.programme;

import java.util.Scanner;

public class SimpleCalculatorSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter 1st NUM :");
		int n1= scan.nextInt();
		System.out.println("Enter 2nd NUM :");
		int n2= scan.nextInt();
		System.out.println();
		System.out.println("Enter operation symbol as '+' '-' '/' '*' for particular operation)");
		char ch =scan.next().charAt(0);
		int result=1;
		switch(ch)
		{
		case '+': result=n1+n2;
				  System.out.println("Addition of two number is: "+result);
				  break;
		case '-': result=n1-n2;
				  System.out.println("Addition of two number is: "+result);
				  break;
		case '/': result=n1/n2;
				  System.out.println("Addition of two number is: "+result);
				  break;
		case '*': result=n1*n2;
				  System.out.println("Addition of two number is: "+result);
				  break;
		default : System.out.println("Invalid char entry...");
				  break;

		
		}
		
		
		


	}
	
}
