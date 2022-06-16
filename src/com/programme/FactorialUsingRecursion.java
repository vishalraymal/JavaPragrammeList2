package com.programme;

public class FactorialUsingRecursion {

	public static void main(String[] args) {
		int n = 5;
		int fact = recursionResult(n);
		System.out.println("Factorial is : " + fact);

	}

	static int recursionResult(int n) {
		int result = 1;
		if (n > 0) {
			result = (n * recursionResult(n - 1)); // 5x4x3x2x1
			return result;
		}
		return result;
	}
}
