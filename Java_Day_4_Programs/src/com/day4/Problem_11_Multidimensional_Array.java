package com.day4;

import java.util.Scanner;

public class Problem_11_Multidimensional_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();  //Method

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		int row, col;
		Scanner sc =new Scanner(System.in);
		
		//Taking input from the user
		System.out.println("Enter the row : ");
		row=sc.nextInt();
		
		System.out.println("Enter the column : ");
		col=sc.nextInt();
		
		int[][] a = new int[row][col];   //array initialization
		
		System.out.println();
		System.out.println("Enter the array elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
			
		}
		
		//Displaying the array elements
		System.out.println();
		System.out.println("Array elements :");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.println(a[i][j]);
			}
			
		}
		
		
	}

}
