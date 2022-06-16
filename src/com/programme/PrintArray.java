package com.programme;

import java.util.Arrays;

public class PrintArray {
	public static void main(String[] args) {
		int a[]={1,2,3,5};
		Object obj =Arrays.toString(a);
		System.out.println("Array is: "+ obj);
		
		int b[]={7,8,1,3};
		for(int i=0; i< b.length; i++)
		{
			int result= b[i];
			System.out.println(result);
		}
	}

}
