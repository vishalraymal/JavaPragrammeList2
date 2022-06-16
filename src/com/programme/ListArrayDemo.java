package com.programme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayDemo {

	public static void main(String[] args) 
	{
		// Arraylist to list
		ArrayList list= new ArrayList<>();
		list.add("vishal");
		list.add("Raymal");
		list.add("Happy");
		list.add("Person");
		
		// Print list
		System.out.println("List is: "+list);
		
		//create new array of string type
		String[] arr = new String[list.size()];
		
		// Convert array list into string
	    list.toArray(arr);
		System.out.print("Array is :");
		for(String item : arr)
		{
			System.out.print(item+", ");
		}
		System.out.println();
		//create an array
		String[] myArr= {"Bhushan", "Raymal" , "Happy", "Man"};
		
		//print an array
		System.out.println("Array :"+ Arrays.toString(myArr));
		
		//convert array into list
		List myList = new ArrayList<>(Arrays.asList(myArr));
		
		//print converted array
		System.out.print("List are "+myList);
		

	}

}
