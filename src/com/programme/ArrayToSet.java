package com.programme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayToSet {
	public static void main(String[] args)
	{
		//Declare an array
		String[] arr = {"Vishal","Raymal","TCS","ZENSAR","TSYSTEMS"};
		Set<String> hs = new HashSet<>(Arrays.asList(arr));
		System.out.println("SET : "+ hs);
	}

}
