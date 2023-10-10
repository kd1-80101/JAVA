package com.apple.employee;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("John", "Doe", 5000);
		Employee employee2 = new Employee();
		employee2.acceptData();

		System.out.println("Yearly Salary for Employee 1: " + employee1.getYearlySalary());
		System.out.println("Yearly Salary for Employee 2: " + employee2.getYearlySalary());

		employee1.applyRaise(10);
		employee2.applyRaise(10);

		System.out.println("Yearly Salary for Employee 1 after raise: " + employee1.getYearlySalary());
		System.out.println("Yearly Salary for Employee 2 after raise: " + employee2.getYearlySalary());
	}

}
