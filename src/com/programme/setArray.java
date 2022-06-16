package com.programme;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class setArray {
	public static void main(String[] args) {
		Set<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("b");
		hs.add("c");
		hs.add("Vishal");
		hs.add("Raymal");
		hs.add("E-Clarke");
		
		//set size
		int setSize=  hs.size();
		
		//create an array
		String[] array = new String[setSize];
		
		//covert set to array
		hs.toArray(array);
		
		System.out.println("Arrays are : " + Arrays.toString(array));
		
		
	}

}
