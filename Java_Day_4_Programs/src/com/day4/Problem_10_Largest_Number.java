package com.day4;

import java.util.Scanner;

public class Problem_10_Largest_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		System.out.println("PROGRAM TO FIND LARGEST AMONG THREE NUMBERS");
		System.out.println();
		
		int num1, num2, num3;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
		System.out.println("Enter the third number : ");
		num3 = sc.nextInt();
		
		System.out.println();
		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is Maximum");
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is Maximum");
		}
		else {
			System.out.println(num3 + " is Maximum");
		}
		
		
	}

}
