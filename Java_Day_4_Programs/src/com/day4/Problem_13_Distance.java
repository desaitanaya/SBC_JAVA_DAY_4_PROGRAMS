package com.day4;

import java.util.Scanner;

public class Problem_13_Distance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		
		int x, y;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND EUCLIDEAN DISTANCE");
		System.out.println();
		
		//Taking input from user
		System.out.println("Enter x : " );
		x = sc.nextInt();
		
		System.out.println("Enter y : " );
		y = sc.nextInt();
		
		//To calculate Euclidean distance
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println();
		System.out.println("Distance from (" + x + "," + y + ") to (0,0) is " +distance);
		
		
	}

}
