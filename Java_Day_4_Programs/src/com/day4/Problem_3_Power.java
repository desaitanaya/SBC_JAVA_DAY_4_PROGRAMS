package com.day4;

import java.util.Scanner;

public class Problem_3_Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("TABLE OF POWERS OF 2 PROGRAM");
		System.out.println();
		
		int num, power=0;
		System.out.println("Enter a number ");
		num = sc.nextInt();
		System.out.println();
		
		System.out.println("Table of Powers of 2 : ");
		System.out.println("------------------------------");
		for(int i=0;i<num;i++) {
			power=(int) Math.pow(2,i); 
			System.out.println("Result of 2 raise to " + +i + " is : " +power);
		}
	}

}
