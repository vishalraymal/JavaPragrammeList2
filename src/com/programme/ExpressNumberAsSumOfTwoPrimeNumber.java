package com.programme;

import java.util.Scanner;

public class ExpressNumberAsSumOfTwoPrimeNumber {
	public static void main(String[] args) {
		isPrime(10);
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter a Number : ");
		boolean status=false;
		int n= scan.nextInt();
		for(int i=2; i<=n/2; i++)
		{
			if(isPrime(i))
		{
			if(isPrime(n-i))
			{
				System.out.println(" "+i+" "+(n-i));
				status=true;
			}
		}
		}
		if(status=false)
		{
			System.out.println("Given number can not be expressed as sum of two prime numbers..");
		}
		
		
	}

	
	static boolean isPrime(int n)
	{
		boolean prime=true;
		for(int i=2; i<=n/2; i++ )
		{
			if(n%i==0)
			{
				prime=false;
				break;
			}
		}
		
		return prime;
		
	}
}


