package com.programme;

import java.util.ArrayList;
import java.util.List;

public class JoinLists {
	public static void main(String[] args) {
		List<String> list1= new ArrayList<String>();
		list1.add("Vishal");
		
		List<String> list2= new ArrayList<String>();
		list2.add("Raymal");
		
		List<String> joinlist = new ArrayList<String>();
		joinlist.addAll(list1);
		joinlist.addAll(list2);
		
		System.out.println("Join of two lists are: "+ joinlist);
		
		
		
		
		
		
		
	}
}
