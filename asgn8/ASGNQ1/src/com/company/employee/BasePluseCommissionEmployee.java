package com.company.employee;

import java.util.Scanner;

public class BasePluseCommissionEmployee extends CommissionEmployee {

	private double baseSalary;
private double totalSalary;

	public BasePluseCommissionEmployee() {
		this("-","-","-",0.0,0.0,0.0);
	}

	public BasePluseCommissionEmployee(String socialSecurityNumber, String firstName, String lastName, double grossSale,
			double commissionRate, double baseSalary) {
		super(socialSecurityNumber, firstName, lastName, grossSale, commissionRate);
		this.baseSalary= baseSalary;
	}


	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("ENTER THE BASIC SALARY : ");
		this.baseSalary=sc.nextDouble();	}

	@Override
	public void display() {
		super.display();
		System.out.println("EMPLOYEE SALARY : "+ this.totalSalary);
	}

	@Override
	void calculateTotalSalary() {
		super.calculateTotalSalary();
		this.totalSalary= super.getTotalSalary() + this.baseSalary;
	}

	@Override
	public String toString() {
		return "\nBasePluseCommissionEmployee ["+super.toString()+"baseSalary=" + baseSalary + "\ntotalSalary=" + totalSalary + "\n]\n";
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	public void incrementSalary() {
		System.out.println("ENTER THE PERCENTAGE OF INCREMENT :");
		double percent=new Scanner(System.in).nextDouble();
		this.totalSalary=(this.totalSalary*(percent/100));
		System.out.println("EMPLOYEE INCREMENTED SALARY :"+this.totalSalary);
	}
	
}
