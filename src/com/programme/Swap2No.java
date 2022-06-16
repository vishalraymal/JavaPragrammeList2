package com.programme;

import java.util.Scanner;

public class Swap2No {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter 1st Number :");
		int a= sc.nextInt();
		System.out.print("Enter 2nd Number :");
		int b= sc.nextInt();
		System.out.println("Before swapping a: "+a+ " b: "+b);
		a=a+b;  
		b=a-b;  
		a=a-b; 
		System.out.println("After swapping a: "+a+ " b: "+b);

		
	}

}
