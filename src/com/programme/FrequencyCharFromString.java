package com.programme;

public class FrequencyCharFromString {
	public static void main(String[] args) {
		String s="i am vishal raymal";
		char ch='a';
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(ch==s.charAt(i))
			{
				count++;
			}
			
		}
		System.out.println("Frequency of charachter "+ch+" is :"+count);
	}

}
