package com.day4;

import java.util.Scanner;

public class Problem_4_Harmonic_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double harmonic=1;
		int num;
		System.out.println("HARMONIC NUMBER PROGRAM");
		System.out.println();
		
		System.out.println("Enter a number to print nth harmonic number : ");
		num = sc.nextInt();
		
		for(int i=2;i<=num;i++) {
			harmonic = harmonic + (double)1/i;
		}
		System.out.println();
		System.out.println(+num + "th harmonic value : " +harmonic);
		
	}

}
