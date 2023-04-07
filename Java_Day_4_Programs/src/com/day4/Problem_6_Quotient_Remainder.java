package com.day4;

import java.util.Scanner;

public class Problem_6_Quotient_Remainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int dividend, divisor, quotient, remainder;
		
		System.out.println("Enter the Dividend : ");
		dividend = sc.nextInt();
		
		System.out.println("Enter the Divisor : ");
		divisor = sc.nextInt();
		
		System.out.println();
		
		quotient = dividend / divisor;
		System.out.println("Quotient : " +quotient);
		
		remainder = dividend % divisor;
		System.out.println("Remainder : " +remainder);
	}

}
