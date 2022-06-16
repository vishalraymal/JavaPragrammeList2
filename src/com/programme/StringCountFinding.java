package com.programme;

public class StringCountFinding {
	public static void main(String[] args) {
		String s= "Mera Bharat Mahan";
		
	    char ch;
		int count=0;
		for(int i=0; i < s.length(); i++)
		{
			count++;
			if(s.charAt(i) !=' '){
				ch = s.charAt(i);
				System.out.println("Char of index : "+i +"  "+ch);
			}
		}
		System.out.println("Total String length is: "+count);


	}
	
	

}
