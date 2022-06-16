package com.programme;

import java.util.concurrent.TimeUnit;

public class MiliSeconds {
	public static void main(String[] args)
	{
		int milisec= 1000000;
		long seconds = TimeUnit.MILLISECONDS.toSeconds(milisec);
		long minute = TimeUnit.MILLISECONDS.toMinutes(milisec);
		System.out.println("Miliseconds :"+milisec);
		System.out.println("Seconds :"+seconds);
		System.out.println("Minutes :"+minute);

		

	}
}
