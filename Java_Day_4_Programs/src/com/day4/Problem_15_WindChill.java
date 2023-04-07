package com.day4;

import java.util.Scanner;

public class Problem_15_WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		displayMethod();
	}

	private static void displayMethod() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("WIND CHILL PROGRAM");
		System.out.println();
		
		//Initializing
		double temp, wind_speed ,wind_chill=0;
		
		//Taking input from user
		System.out.println("Enter the temperature in Fahrenheit : ");
		temp = sc.nextDouble();
		
		System.out.println("Enter the wind speed in miles per hour : ");
		wind_speed = sc.nextDouble();
		
		System.out.println();
		//Calculating Wind chill
		if( temp <= 50.0 ) {
			if(wind_speed > 3.0 && wind_speed <= 120.0) {
			wind_chill = (double) (35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(wind_speed, 0.16));
			System.out.println("Windchill is : " +wind_chill);
		}
		}
		else {
			System.out.println("Invalid Input. Temperature should be less than 50 or Wind speed should be in between 3 and 120 miles per hour");
		}
		
		
	}

}
