package com.programme;

public class CharacterCount {
	public static void main(String[] args) {
		String s= "hello word";
		int count=0;
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i) != ' ' )
			count++;
		}
		System.out.println("The total count:"+count);
		
		
		
		/* String string = "The best of both worlds";    
	        int count = 0;    
	            
	        //Counts each character except space    
	        for(int i = 0; i < string.length(); i++) {    
	            if(string.charAt(i) != ' ')    
	                count++;    
	        }    
	            
	        //Displays the total number of characters present in the given string    
	        System.out.println("Total number of characters in a string: " + count);  */  
		
	}

}
