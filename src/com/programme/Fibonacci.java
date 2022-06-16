package com.programme;


// 0 1 1 2 3 5 8 13
public class Fibonacci {
	public static void main(String[] args) {
		int a=0; int b=1; int c=0;
		System.out.print("Fibonnaci : "+c);
		for(int i=0 ; i <=10; i++)
		{
			c=a+b;  //0 1  1
			System.out.print(" "+c);
			b=a;
			a=c;
		}
		
		
		
	}

}
