package com.programme;

import javax.xml.crypto.dsig.Transform;

public class StringContains {
	public static void main(String[] args) 
	{
		String s ="I am pavan raymal";
		
		String word="raymal";
		s= s.toUpperCase();
		word= word.toUpperCase();
		String[] str= s.split(" ");
		boolean isPresent=false;
		for(int i=0; i < str.length; i++)
		{
			String temp= str[i];
			if(temp.equalsIgnoreCase(word)) 
			{
				isPresent=true;
				break;
			}
			
		}
		if(isPresent)
		{
			System.out.println(word+ " is present");
		}
		else
		{
			System.out.println(word+ " is not present");
		}
		

	}

}
