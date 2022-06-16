package com.programme;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class StringFromTextFil {
	public static void main(String[] args) throws IOException {
		String path = System.getProperty("user.dir")+"/src/test.txt";
		Charset encCode = Charset.defaultCharset();
	
		List<String> str = Files.readAllLines(Paths.get(path), encCode);
		
		
		System.out.println(str);
		
	}

}
