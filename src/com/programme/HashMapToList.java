package com.programme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapToList{
	public static void main(String[] args) {
		Map<Integer, String> hm=  new HashMap<>();
		hm.put(1, "Vishal");
		hm.put(2, "Raymal");
		hm.put(3, "TSystems");
		hm.put(4, "TCS");
		hm.put(5, "Zensar");
		
		List<Integer> keyList = new ArrayList(hm.keySet());
		List<String> keyValue = new ArrayList(hm.values());
		
		System.out.println("KEY LIST : "+ keyList);
		System.out.println("KEY VALUE : "+ keyValue);
		
		
		
		
		
		
	}

}
