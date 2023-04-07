package com.day4;

import java.util.Scanner;

public class Problem_12_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int size;
		
		//Taking inputs from the user
		System.out.println("Enter the size of array : ");
		size= sc.nextInt();
		
		int[] arr = new int[size];
		System.out.println();
		System.out.println("Enter the array elements : ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		
		System.out.println();
		for(int i=0; i<size-2; i++) {
			for(int j=i+1; j<size-1; j++) {
				for(int k=j+1; k<size; k++) {
					if(arr[i] + arr[j] + arr[k] == 0) {
						count = count + 1;
						System.out.println("The Triplet is : " +arr[i] + " " +arr[j] + " " +arr[k]);

					}
				}
			}
		}
		System.out.println();
		System.out.println("The count of triplet is : " +count);
		
	}

}
