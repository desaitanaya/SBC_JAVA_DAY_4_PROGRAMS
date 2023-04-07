package com.day4;

import java.util.Scanner;

public class Problem_8_Even_Odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("EVEN ODD NUMBER PROGRAM");
		System.out.println();
		
		int num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		System.out.println();
		if(num%2==0) {
			System.out.println(+num + " is an even number");
		}
		else {
			System.out.println(+num + " is a odd number");
		}
		
	}

}
