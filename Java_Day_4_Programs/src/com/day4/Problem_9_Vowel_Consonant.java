package com.day4;

import java.util.Scanner;

public class Problem_9_Vowel_Consonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		char c;
		System.out.println("PROGRAM TO CHECK IF A CHARACTER IS A VOWEL OR CONSONANT");
		System.out.println("Enter a character : ");
		Scanner sc = new Scanner(System.in);
		c=sc.nextLine().charAt(0);
		System.out.println();
		
		switch (c) {
			case 'a' :
			case 'e' :
	    	case 'i' :
	    	case 'o' :
	    	case 'u' :
	    	case 'A' :
	    	case 'E' :
	    	case 'I' :
	    	case 'O' :
	    	case 'U' :
	    		System.out.println(c + " is a vowel ");
			    break;
			
	    	default:
	    		System.out.println(c + " is a consonant");
		}
	}

}
