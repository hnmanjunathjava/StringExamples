package com.strings;

import java.util.Scanner;

public class SwapWithoutTemp {

	private static void swapString(String one, String two) {
		one = one + two;
		two = one.substring(0, one.length() - two.length());
		one = one.substring(two.length());
		System.out.println("\nString After Swap : ");
		System.out.println("value of 1st string : " + one);
		System.out.println("value of 2nd string : " + two);
	}

	private static void swapNumberWithoutTemp(int one, int two) {
		one = one + two;
		two = one - two;
		one = one - two;
		System.out.println("\n numbers After Swap : ");
		System.out.println("value of 1st number : " + one);
		System.out.println("value of 2nd number : " + two);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String 1 :");
		String one = sc.next();
		System.out.println("Enter String 2 :");
		String two = sc.next();
		System.out.println("Enter 1st number: ");
		int numOne = sc.nextInt();
		System.out.println("Enter 2nd number :");
		int numTwo = sc.nextInt();
		swapString(one, two);
		swapNumberWithoutTemp(numOne, numTwo);
		sc.close();
	}
}
