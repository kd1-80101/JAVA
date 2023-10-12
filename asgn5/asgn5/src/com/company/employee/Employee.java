package com.company.employee;

import java.util.Objects;
import java.util.Scanner;

abstract public class Employee {
	private String socialSecurityNumber;
	private String firstName;
	private String lastName;
	

	public Employee(String socialSecurityNumber, String firstName, String lastName) {
		this.socialSecurityNumber = socialSecurityNumber;
		this.firstName = firstName;
		this.lastName = lastName;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() == obj.getClass())
			return true;
		
		return false;
	}

	public void accept(Scanner sc) {
		System.out.println("_____________________________________________");
		System.out.print("ENTER THE EMPLOYEE SOCIAL SECURITY NUMBER :");
		this.socialSecurityNumber = sc.next();
		System.out.print("ENTER THE FIRST NAME :");
		this.firstName = sc.next();
		System.out.print("ENTER THE LAST NAME :");
		this.lastName = sc.next();
		System.out.println("_____________________________________________");
	}

	public void display() {
		System.out.println("___________________________________________________________");
		System.out.println("EMPLOYEE SOCIAL SECURITY NUMBER : " + this.socialSecurityNumber);
		System.out.println("EMPLOYEE NAME : " + this.firstName +" "+this.lastName);
		System.out.println("___________________________________________________________");
	}

	@Override
	public String toString() {
		return "\nsocialSecurityNumber=" + socialSecurityNumber + "\nfirstName=" + firstName + "\nlastName="
				+ lastName;
	}

	
	
	
	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
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

	abstract void calculateTotalSalary();
}
