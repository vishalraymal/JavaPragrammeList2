package com.programme;

public class CurrentWorkDir {
	public static void main(String[] args) {
		
		String cwdPath = System.getProperty("user.dir");
		System.out.println("Current Working Directory : "+ cwdPath);
	}

}
