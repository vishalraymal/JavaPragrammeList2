package com.programme;

import java.util.Scanner;

public class QuotientAndReminder {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number to validate its Quotient and Reminder :");
		int n= sc.nextInt();
		int q= n/10;
		int r=n%10;
		System.out.println("The quotient is: "+q);
		System.out.println("The reminder is: "+r);

	}
	

}
