package com.programme;

import java.util.Arrays;

public class ConcatenateArray {
	public static void main(String[] args) {
		int[] a={1,2,3};
		int[] b={2,3,4};
		
		int sum = a.length+b.length;
		int[] result = new int[sum];
		int pos=0;
		for(int i=0; i<a.length; i++)  //0, 1 2 3//break
		{
			result[pos]=a[i];  // r[2]=a[2], r=1  2  3,
			pos++;    //1 2  3
		}
		for(int j=0; j<b.length; j++)
		{
			result[pos]=b[j];
			pos++;
		}
		System.out.println(Arrays.toString(result));
		
	}

}
