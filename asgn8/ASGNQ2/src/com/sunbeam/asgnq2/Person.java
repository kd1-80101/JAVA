package com.sunbeam.asgnq2;

import java.util.Scanner;

public class Person implements Displayable {

	private String firstName;
	private String lastName;

	
	public Person() {
		this("","");
	}

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public void accept(Scanner sc) {
		System.out.println("_____________________________________________");

		System.out.print("ENTER THE FIRST NAME :");
		this.firstName = sc.next();
		System.out.print("ENTER THE LAST NAME :");
		this.lastName = sc.next();
		System.out.println("_____________________________________________");
	}

	@Override
	public void DisplayData() {
		System.out.println("___________________________________________________________");
		System.out.println("PERSON NAME : " + this.firstName + " " + this.lastName);
		System.out.println("___________________________________________________________");
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + "]";
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

}
