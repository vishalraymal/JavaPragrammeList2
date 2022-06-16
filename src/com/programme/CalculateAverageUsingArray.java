package com.programme;

public class CalculateAverageUsingArray {
	public static void main(String[] args) {
		int a[] ={1,2,3,4,5,6};
		double avg=0, temp=0;
		for(int i=0; i<a.length; i++)
		{
			temp = temp+a[i];
			System.out.println(temp);
			
		}
		System.out.println("total is :"+temp);
		avg= temp/a.length;
		System.out.println("Average is: "+ avg);
		
		
	}

}
