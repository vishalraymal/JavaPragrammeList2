package com.programme;

public class LargetOfThreeDigit {
	public static void main(String[] args) {
		int a=400;
		int b=200;
		int c=201;
		if(a>b && a>c)
		{
			System.out.println("Largest number is :"+a);
		}
		else if(c>a)
		{
			System.out.println("Largest Number is :"+c);
		}
	}

}
