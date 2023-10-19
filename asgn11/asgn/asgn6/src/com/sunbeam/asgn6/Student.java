package com.sunbeam.asgn6;

import java.util.Objects;
import java.util.Scanner;

public class Student {
	private String firstName;
	private int rollno;
	private String lastName;
	private int age;

	public Student() {
		this("-", "-", 0, 0);// TODO Auto-generated constructor stub
	}

	public Student(String firstName, String lastName, int rollno, int age) {

		this.firstName = firstName;
		this.rollno = rollno;
		this.lastName = lastName;
		this.age = age;
	}

	public void acceptData(Scanner sc) {
		System.out.println("please enter Student details");
		System.out.println("Enter First Name");
		this.firstName = sc.next();
		System.out.println("Enter Last Name");
		this.lastName = sc.next();
		System.out.println("Enter Age");
		this.age = sc.nextInt();
		System.out.println("Enter roll no");
		this.rollno = sc.nextInt();

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getRollno() {
		return rollno;
	}

	

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", rollno=" + rollno + ", lastName=" + lastName + ", age=" + age
				+ "]\n";
	}

	

}

/*
 *
 * @Override public boolean equals(Object obj) { if (this == obj) return true;
 * if (obj == null) return false; if (obj instanceof Person) { Person other =
 * (Person) obj; if (this.firstName.equals(other.firstName) &&
 * this.lastName.equals(other.lastName)) return true; } return false; }
 * 
 * @Override public int hashCode() { int hash =
 * Objects.hash(this.firstName,this.lastName); return hash; }
 */
