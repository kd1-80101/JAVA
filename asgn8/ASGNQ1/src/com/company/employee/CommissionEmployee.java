package com.company.employee;

import java.util.Scanner;

public class CommissionEmployee extends Employee {

	private double grossSale;
	private double commissionRate;
	private double totalSalary;


	public CommissionEmployee() {
		this("-","-","-",0.0,0.0);
	}


	public CommissionEmployee(String socialSecurityNumber, String firstName, String lastName, double grossSale,
			double commissionRate) {
		super(socialSecurityNumber, firstName, lastName);
		this.grossSale = grossSale;
		this.commissionRate = commissionRate;
	}

	@Override
	public void accept(Scanner sc) {
		super.accept(sc);
		System.out.println("ENTER THE GROSS SALES :");
		this.grossSale=sc.nextDouble();
		System.out.println("ENTER THE COMMISION RATE :");
		this.commissionRate=sc.nextDouble();
	}
	@Override
	public void display() {
	super.display();
	System.out.println("EMPLOYEE SALARY : "+this.totalSalary);
	}
	

	@Override
	public String toString() {
		return "\nCommissionEmployee ["+ super.toString()+"\ngrossSale=" + grossSale + "\ncommissionRate=" + commissionRate + "\ntotalSalary="
				+ totalSalary+"\n]\n";
	}


	@Override
	void calculateTotalSalary() {
		this.totalSalary= (this.commissionRate * this.grossSale);

	}


	public double getGrossSale() {
		return grossSale;
	}


	public void setGrossSale(double grossSale) {
		this.grossSale = grossSale;
	}


	public double getCommissionRate() {
		return commissionRate;
	}


	public void setCommissionRate(double commissionRate) {
		this.commissionRate = commissionRate;
	}


	public double getTotalSalary() {
		return totalSalary;
	}


	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}
	

}
