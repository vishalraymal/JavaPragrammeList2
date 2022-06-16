package com.programme;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class InputStreamToString {
	public static void main(String[] args) throws IOException 
	{
		InputStream str= new  ByteArrayInputStream("Hello Vishal".getBytes());
		 StringBuilder sb = new StringBuilder();
	        String line;

	        BufferedReader br = new BufferedReader(new InputStreamReader(str));
	        while ((line = br.readLine()) != null) {
	            sb.append(line);
	        }
	        br.close();

	        System.out.println(sb);
	}

}
