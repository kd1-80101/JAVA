package com.company.employee;

import java.util.Scanner;

class Box<T extends Employee> {
	private T obj;

	public Box() {
		this.obj = null;
	}

	public Box(T obj) {
		this.obj = obj;

	}

	public void set(T val) {
		this.obj = val;
	}

	public T get() {

		return obj;
	}

	public double getSalary() {
		this.obj.calculateTotalSalary();
		return this.obj.getTotalSalary();
	}

	public void acceptData(Scanner sc) {
		Scanner ss = sc;
		this.obj.accept(ss);

	}

}

public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.println("______________________________________________________");

		Box<Employee> e1 = new Box<Employee>();
		e1.set(new SalariedEmployee("1235", "prasann", "shekhar", 90000));
		System.out.println(e1.get());
		System.out.println(e1.getSalary());

		System.err.println("______________________________________________________");

		Box<Employee> e2 = new Box<Employee>();
		e2.set(new HourlyEmployee("12323", "prasann", "shekhar", 90.2, 90));
		System.out.println(e2.get());
		System.out.println(e2.getSalary());

		System.err.println("______________________________________________________");

		Box<Employee> e3 = new Box<Employee>();
		e3.set(new CommissionEmployee("6513", "prasann", "shekhar", 23.2, 321.90));
		System.out.println(e3.get());
		System.out.println(e3.getSalary());
		System.err.println("______________________________________________________");

		Box<Employee> e4 = new Box<Employee>();
		BasePluseCommissionEmployee s= new BasePluseCommissionEmployee();
		s.accept(sc);
		e4.set(s);
		System.out.println(e4.get());
		System.out.println(e4.getSalary());
		System.err.println("______________________________________________________");
		sc.close();
	}

}
