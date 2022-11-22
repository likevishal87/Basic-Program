package com.bridgelabz.Assignment;

import java.util.Scanner;

//Write a program to check two strings are equal or not. 
public class EqualCheck {

	public static void main(java.lang.String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String a = scanner.nextLine();
		String b = scanner.nextLine();

		if (a.equalsIgnoreCase(b)) {
			System.out.println("Both strings are equal.");
		} else {
			System.out.println("Both strings are not equal.");
		}

	}

}
