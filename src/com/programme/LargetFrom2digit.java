package com.programme;

import java.util.Scanner;

public class LargetFrom2digit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st digit number: ");
		int n1= sc.nextInt();
		System.out.print("Enter 2nd digit number: ");
		int n2= sc.nextInt();
		largetInt(n1, n2);
	}

	// Don't use any if --else loop
	static void largetInt(int n1, int n2) {
		int num1=n1;
		int num2=n2;
		boolean secondlarge = true;
		while (num1 > num2) {
			System.out.println("The largest number is :" + num1);
			secondlarge = false;
			break;
		}
		while(secondlarge)
		{
			System.out.println("The largest number is :" + num2);
			break;
		}
	}
}
