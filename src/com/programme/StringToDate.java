package com.programme;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class StringToDate {
	
	public static void main(String[] args) {
		String s = "2016-05-14";
		
		LocalDate date = LocalDate.parse(s, DateTimeFormatter.ISO_DATE);
		System.out.println(date);
 	}

}
