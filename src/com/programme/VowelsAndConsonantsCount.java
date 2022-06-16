package com.programme;

public class VowelsAndConsonantsCount {
	
	public static void main(String[] args) {
		String s="i am vishal raymal";
		int vowel_count=0;
		int consonant_count=0;
		for(int i=0; i < s.length(); i++)
		{
			char ch=s.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
			{
				vowel_count++;
			}
			else
			{
				consonant_count++;
			}
			
			
			
		}
		System.out.println("VOWEL COUNT : "+ vowel_count);
		System.out.println("CONSONANT COUNT : "+ consonant_count);

		
		
	}

}
