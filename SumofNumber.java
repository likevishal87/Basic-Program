package com.bridgelabz.Assignment;

//To find the sum of command-line arguments and count the invalid integers entered.
public class SumofNumber {

	public static void main(String[] args) {

		int x = Integer.parseInt(args[0]); // first arguments
		int y = Integer.parseInt(args[1]); // second arguments
		int sum = x + y;
		System.out.println("The sum of x and y is: " + sum);
	}
}
