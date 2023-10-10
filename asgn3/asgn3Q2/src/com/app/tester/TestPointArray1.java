package com.app.tester;

import java.util.Scanner;

import com.app.geometry.Point2D;

public class TestPointArray1 {
	public static Scanner sc = new Scanner(System.in);

	public static int menu() {
		int choice;
		System.out.println("__________________________________________");
		System.out.println("1.Display deatils of specific point    ");
		System.out.println("2.Display x, y co-ordinates of all points ");
		System.out.println("3.Calculate distance between points");
		System.out.println("4.Exit");
		System.out.println("Select your choice");
		choice = sc.nextInt();
		System.out.println("__________________________________________");

		return choice;
	}

	public static void main(String[] args) {
		int choice;
		System.out.print("Enter the number of points to plot: ");
		int numPoints = sc.nextInt();
		sc.nextLine();

		Point2D[] points = new Point2D[numPoints];
		for(int i=0;i<numPoints;i++)
		{
			System.out.println("Enter x and y coordinates at point "+(i+1)+" : ");
			double x=sc.nextDouble();
			double y=sc.nextDouble();
			points[i]=new Point2D(x, y);
		}
		

		do {
			choice = menu();
			switch (choice) {
			case 1:
				System.out.print("Enter the index of the point: ");
				int index = sc.nextInt();
				if (index >= 0 && index < numPoints) {
					System.out.println("Details of Point " + index + ": " + points[index].getDetails());
				} else {
					System.out.println("Invalid index. Please retry!");
				}

				break;
			case 2:

				System.out.println("Coordinates of all points:");
				for (int i = 0; i < numPoints; i++) {
					System.out.println("Point " + i + ": " + points[i].getDetails());
				}
				break;
			case 3:
				System.out.print("Enter the indices of the start and end points: ");
				int startIndex = sc.nextInt();
				int endIndex = sc.nextInt();
				if (startIndex >= 0 && startIndex < numPoints && endIndex >= 0 && endIndex < numPoints) {
					if (!points[startIndex].isEqual(points[endIndex])) {
						double distance = points[startIndex].calculateDistance(points[endIndex]);
						System.out.println("Distance between Point " + startIndex + " and Point " + endIndex + ": " + distance);
					} else {
						System.out.println("Points are located at the same position.");
					}
				} else {
					System.out.println("Invalid indices. Please retry!");
				}
				break;
				
			case 4:
				
				break;
			}

		} while (choice != 4);

	}
}
