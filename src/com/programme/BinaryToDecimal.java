package com.programme;

public class BinaryToDecimal {
	
	public static void main(String[] args) {
		int bNum= 10111;
		int decimal = binaryDecimalCoversion(bNum); 
		System.out.println(bNum+ " decimal number is: "+ decimal);
		
		
		
	}

	private static int binaryDecimalCoversion(int bNum) {
		int decimalNo=0, i=0;
		while(bNum>0)
		{
			long rem= bNum%10;  // 1,1,1,0, 1
			decimalNo= (int) (decimalNo+rem*Math.pow(2, i));  //2x2x2x2=
			// 0+1*1=1, 1+1*2=3, 3+1*4 =7, 16+7=23		
			bNum=bNum/10;
			i++;
		}
	
		
		
		return decimalNo;
		
		
		
	}

}
