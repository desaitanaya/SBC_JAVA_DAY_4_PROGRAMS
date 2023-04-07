package com.day4;

import java.util.Scanner;

public class Problem_14_Quadratic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("PROGRAM TO FIND THE ROOTS OF THE EQUATION a*x*x+b*x+c");
		double a, b, c, root1, root2, delta;
		
		System.out.println();
		System.out.println("Enter a :");
		a=sc.nextDouble();
		
		System.out.println("Enter b :");
		b=sc.nextDouble();
		
		System.out.println("Enter c :");
		c=sc.nextDouble();
		
		System.out.println();
		
		delta = (b*b) - (4*a*c);
		
		if (delta > 0) {
			root1 = ((-b + Math.sqrt(delta)) / (2*a));
			root2 = ((-b + Math.sqrt(delta)) / (2*a));
			
			System.out.println("The Roots of the Quadratic Equation are : ");
			System.out.println("Root1 : " +root1);
			System.out.println("Root2 : " +root2);
		}
		else if (delta == 0) {
			root1 = root2 = -b / (2*a);
			System.out.println("The Roots of the Quadratic Equation are : ");
			System.out.println("Root1 = Root2 = " +root1);
		}
		else {
			System.out.println("Roots are not real");
		}

	}

}
