package com.day4;

import java.util.Scanner;

public class Problem_2_Leap_Year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("LEAP YEAR PROGRAM");
		System.out.println();
		
		int year;
		System.out.println("Enter a year :");
		year=sc.nextInt();
		
		if(year<10000) {
			if(year%4==0 && year%100!=0 || year%400==0) {
				System.out.println();
				System.out.println(+year + " is a Leap Year");
			}
			else {
				System.out.println();
				System.out.println(+year + " is not a Leap Year");
			}
		}
		else {
			System.out.println("Not a valid Year");
		}
		
	}

}
