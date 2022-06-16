package com.programme;

public class LargestFromArray {
	public static void main(String[] args) 
	{
		int a[]={3,5,7,656,-110,99,110};
		int max=a[0];
		for(int i=1; i< a.length; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			
		}
		System.out.println("Maximun value from array :"+max);
		
		int num[][]= {{1,2,3},{2,5,6}};
		int max_num =num[0][0];
		for(int i=0; i<=1; i++)
		{
			for(int j=0 ; j<=2; j++)
			{							 // 1 2 3	
				if(num[i][j] > max_num)  // 2 5 6
				{
					max_num=num[i][j];
				}
				
				
			}
		}
		System.out.println("Maximum number is : "+ max_num);
		
	}
}
