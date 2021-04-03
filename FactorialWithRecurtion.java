package com.tut;

/**
 *
 * @author Shamsul
 * @since Apr 03, 2021
 *
 */

public class FactorialWithRecurtion {
	public static int fact(int n) {
		if (n == 1)
			return 1;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int num = 5;
		int factorial = fact(num);
		System.out.println("Factorial:-" + factorial);
	}

}