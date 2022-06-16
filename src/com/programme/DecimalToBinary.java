package com.programme;

public class DecimalToBinary {
	public static void main(String[] args) {
		int decimal =19;
		long binary = decimalToBinary(decimal);
		System.out.println(decimal+" Its Binary is: "+ binary);
		
	}

	private static long decimalToBinary(int decimal) {
		long binary_no=0;
		int i=1;
		
		while(decimal>0)
		{
			int rem=decimal%2;  //19, 9
			// 1, 1, 
			binary_no= binary_no+(rem*i);  
			//1, 1+10, 
			
			decimal= decimal/2;
			//9, 4
			
			i=i*10;
		}
		
		
		
		return binary_no; 
	
	
	}

}
