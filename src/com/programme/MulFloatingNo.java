package com.programme;

import java.util.Scanner;

public class MulFloatingNo {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Eneter first floating number :");
	    float a= sc.nextFloat();
		System.out.print("Eneter second floating number :");
		float b= sc.nextFloat();
		float result = (a*b);
		System.out.println("Result of two floating number is : "+result);
		
		
	}

}
