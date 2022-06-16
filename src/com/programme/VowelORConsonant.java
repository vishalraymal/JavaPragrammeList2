package com.programme;

public class VowelORConsonant {
	public static void main(String[] args) {
		char ch='A';
	/*	if(ch =='a' || ch=='e' || ch== 'i' || ch=='o' || ch=='u')
		{
			System.out.println("Enter character is vowel");
		}
		else
		{
			System.out.println("Enter character is consonant");
		} */
		switch(ch)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Enter character is vowel");
			break;
		default:
			System.out.println("Enter charater is consonant");
		
		
		}
		
		
	}

}
