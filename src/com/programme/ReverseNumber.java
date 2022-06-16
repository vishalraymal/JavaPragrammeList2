package com.programme;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = scan.nextInt();
		int temp=num;
		int rev_num=0;
		while(temp>0)
		{
			int rem= temp%10;
			rev_num=rev_num*10+rem;
			temp=temp/10;			
		}
		System.out.println("Orginal Number: "+num);

		System.out.println("Reverse Number: "+rev_num);
	}
	
	
	

}
