package com.sunbeam;

import java.util.Scanner;

public class Clerk implements Emp {
	private double salary;

	public Clerk() {
	}

	public Clerk(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Clerk [salary=" + salary + "]";
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void accept(Scanner sc) {
		System.out.println("enter salary :");
		this.salary = sc.nextDouble();
	}

	@Override
	public double getSal() {

		return this.salary;
	}

}
