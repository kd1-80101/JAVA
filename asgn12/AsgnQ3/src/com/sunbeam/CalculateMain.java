package com.sunbeam;

import java.util.Scanner;

public class CalculateMain {

	static void calculate(double num1, double num2, Arithmetic op) {
		double result = op.calc(num1, num2);
		System.out.println("Result: " + result);
	}

	public static void main(String[] args) {
		{
			Scanner sc = new Scanner(System.in);
			int choice;
			double a, b;
			System.out.println("Enter the Nos :");
			System.out.print("Enter 1st number :");
			a = sc.nextDouble();
			System.out.print("Enter 2nd number :");
			b = sc.nextDouble();
			do {
				System.out.println(" menu ");
				System.out.println("0.Exit");
				System.out.println("1.Addition");
				System.out.println("2.Subtraction");
				System.out.println("3.Multiplication");
				System.out.println("4.Divide");
				System.out.println("Enter your choice");
				choice = sc.nextInt();
				switch (choice) {
				case 1:
					calculate(a, b, (x, y) -> x + y);
					break;

				case 2:
					calculate(a, b, (x, y) -> x - y);

					break;

				case 3:
					calculate(a, b, (x, y) -> x * y);

					break;

				case 4:
					if (b != 0)
						calculate(a, b, (x, y) -> x / y);

					break;

				}
			} while (choice != 0);
			System.out.println("");
		}
	}
}
