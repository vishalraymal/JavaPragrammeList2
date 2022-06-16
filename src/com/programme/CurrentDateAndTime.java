package com.programme;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;


public class CurrentDateAndTime {
	public static void main(String[] args) {
		
		LocalDateTime current = LocalDateTime.now();

		System.out.println("Current time :"+ current);
		
		DateTimeFormatter formatter = DateTimeFormatter.BASIC_ISO_DATE;
		System.out.println("Current date format a: "+ current.format(formatter));
	
	}

}
