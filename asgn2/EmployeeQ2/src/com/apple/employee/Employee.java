package com.apple.employee;

import java.util.Scanner;

public class Employee {
	String firstName;
	String lastName;
	double monthlySalary;

	Scanner sc = new Scanner(System.in);

	public Employee() {
		this("", "", 1);
	}

	public Employee(String firstName, String lastName, double monthlySalary) {

		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary > 0)
			this.monthlySalary = monthlySalary;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getmonthlySalary() {
		return monthlySalary;
	}

	public void setmonthlySalary(double salary) {
		if (salary > 0)
			this.monthlySalary = salary;
	}

	public double getYearlySalary() {

		return this.monthlySalary * 12;
	}

	public void applyRaise(double percentage) {
		if (percentage > 0) {
			double raiseAmount = monthlySalary * (percentage / 100);
			this.monthlySalary += raiseAmount;
		}
	}

	void acceptData() {
		double sal = 0;
		System.out.println("ENTER EMPLOYEE DETAILS");
		System.out.print("ENTER EMPLOYEE FIRST NAME     :");
		this.firstName = sc.next();
		System.out.print("ENTER EMPLOYEE LAST NAME      :");
		this.lastName = sc.next();
		System.out.print("ENTER EMPLOYEE MONTHLY SALARY :");
		sal = sc.nextDouble();
		if (sal > 0)
			this.monthlySalary = sal;

	}

	void displayData() {

		System.out.println("    EMPLOYEE DETAILS    ");
		System.out.println("EMPLOYEE FIRST NAME    :" + this.firstName);
		System.out.println("EMPLOYEE LAST NAME     :" + this.lastName);
		System.out.println("EMPLOYEE YEARLY SALARY :" + this.getYearlySalary());

	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.acceptData();
		e.displayData();
		e.applyRaise(10);
		System.out.println("__________________________________");
		System.out.println("AFTER RAISE");
		e.displayData();
	}

}
