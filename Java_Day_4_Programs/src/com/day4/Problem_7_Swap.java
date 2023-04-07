package com.day4;

import java.util.Scanner;

public class Problem_7_Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("SWAP TWO NUMBERS PROGRAM");
		System.out.println();
		
		int num1, num2, temp=0;
		
		System.out.println("Enter the first number : ");
		num1 = sc.nextInt();
		
		System.out.println("Enter the second number : ");
		num2 = sc.nextInt();
		
		temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println();
		System.out.println("After Swapping");
		System.out.println("First number : " +num1);
		System.out.println("Second number : " +num2);
		
		
		
	}

}
