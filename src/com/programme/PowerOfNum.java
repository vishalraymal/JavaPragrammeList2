package com.programme;

import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num= scan.nextInt();
		System.out.print("Enter power of number : ");
		int power= scan.nextInt();
		int result=1;
		for(int i=1; i<= power; i++)
		{
			
			result= result*num;
		}
		System.out.println(result);
	}

}
