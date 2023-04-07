package com.day4;

import java.util.Scanner;

public class Problem_5_Prime_Factors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("PRIME FACTOR PROGRAM");
		System.out.println();
		
		int num;
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		System.out.println();
		System.out.println("Prime factors of " +num + " are : ");
		for(int i=2; i<=num; i++) {
			while(num%i==0) {
				System.out.println(i);
				num=num/i;
			}
		}
	}

}
