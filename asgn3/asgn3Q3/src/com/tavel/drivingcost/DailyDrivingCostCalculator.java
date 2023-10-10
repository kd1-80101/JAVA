package com.tavel.drivingcost;

import java.util.Scanner;

public class DailyDrivingCostCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of miles driven everyday :");
		int totalMilesDriven = sc.nextInt();

		System.out.println("Enter the cost of gasoline per gallon:");
		double costOfGasolinePerGallon = sc.nextDouble();

		System.out.print("Enter average miles per gallon: ");
		double averageMilesPerGallon = sc.nextDouble();

		System.out.print("Enter parking fees per day: $");
		double parkingFeesPerDay = sc.nextDouble();

		System.out.print("Enter tolls per day: $");
		double tollsPerDay = sc.nextDouble();

		double gasolineCost = (totalMilesDriven / averageMilesPerGallon) * costOfGasolinePerGallon;
		double dailyCost = gasolineCost + parkingFeesPerDay + tollsPerDay;

		System.out.println("\nYour daily driving cost to work is: $" + dailyCost);

	}
}
