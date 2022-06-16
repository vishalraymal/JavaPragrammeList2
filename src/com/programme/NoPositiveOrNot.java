package com.programme;

import java.util.Scanner;

public class NoPositiveOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int a = sc.nextInt();
		NoPositiveOrNot obj = new NoPositiveOrNot();
		obj.numPostiveOrNegative(a);

	}
	void numPostiveOrNegative(int a)
	{
		int n=a;
		if(n==0)
		{
			System.out.println("Number is Neither Postive nor negative");
			return;
		}
		if(n>0)
		{
			System.out.println("NUMBER IS +VE");
		}
		else
		{
			System.out.println("NUMBER IS -VE");
		}
	}

}
