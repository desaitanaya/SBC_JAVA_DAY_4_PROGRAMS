package com.day4;

import java.util.Scanner;

public class Problem_1_Flip_Coin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();

	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("FLIP COIN PROGRAM");
		System.out.println();
		
		System.out.println("Enter the number of times to flip a coin : ");
		int coinflip = sc.nextInt();
		int tails = 0, heads = 0;

		for (int i = 0; i < coinflip; i++) {
			if (Math.random() < 0.5) {
				tails++;
			} else {
				heads++;
			}
		}
		
		System.out.println();
		System.out.println("Count of tails : " + tails);
		double countTails = (tails / (double) coinflip) * 100;
		System.out.println("Percentage of tails : " + countTails);
		System.out.println();

		System.out.println("Count of heads : " + heads);
		double countHeads = (heads / (double) coinflip) * 100;
		System.out.println("Percentage of heads : " + countHeads);
	}

}
