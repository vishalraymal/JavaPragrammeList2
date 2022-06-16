package com.programme;

public class PowerUsingRecursion {
	
	public static void main(String[] args) {
		int base=3;
		int powerRaised=4;
		int result =power(base, powerRaised);
		System.out.println("Power of "+ base + "^"+ powerRaised+" :"+ result);
	}

	private static int power(int base, int powerRaised) {
		if(powerRaised !=0)
		{
			return base*(power(base, powerRaised-1));
		}
		else
		{
			return 1;
		}
		
		
	}
	

}
