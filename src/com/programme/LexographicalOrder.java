package com.programme;

public class LexographicalOrder {
	
	
	public static void main(String[] args) {
		String s[] ={"A", "ABC", "ABDFC", "ABCC"};
		//output-- A, ABC, ABCC, ABDFC
		
		for(int i=0; i < s.length; i++)
		{
			for(int j=i+1; j < s.length; j++)
			{
				if(s[i].compareTo(s[j]) > 0)
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
					
				}
				
			}
		}
		System.out.println("Lexographical order :");
		for(int i=0; i< s.length; i++)
		{
			System.out.print(s[i]+" ");
		}
		
		
		
	}

}
