package com.programme;

public class DisplayPrimeNumBetwenInt {
	public static void main(String[] args) {
		int start_no=10;
		int end_no=100;
		int count=0;
		System.out.print("Prime no. are : ");
		for(int i=start_no; i<=end_no; i++)  
		{
			count=0;
			for(int j=1; j<=i; j++)	
			{
				if(i%j==0)   
				{
					count++;  
				}
			}
			if(count==2)
			{
				System.out.print(" "+i);
			}
				
		}
	}

	

}
