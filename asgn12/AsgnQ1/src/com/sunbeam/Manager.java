package com.sunbeam;

import java.util.Scanner;

public class Manager implements Emp {

	private double basicSalary;
	private double dearsnceAllowance;

	public Manager() {
	}

	public Manager(double basicSalary, double dearsnceAllowance) {
		this.basicSalary = basicSalary;
		this.dearsnceAllowance = dearsnceAllowance;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getDearsnceAllowance() {
		return dearsnceAllowance;
	}

	public void setDearsnceAllowance(double dearsnceAllowance) {
		this.dearsnceAllowance = dearsnceAllowance;
	}

	@Override
	public String toString() {
		return "Manager [basicSalary=" + basicSalary + ", dearsnceAllowance=" + dearsnceAllowance + "]";
	}

	@Override
	public double getSal() {
		return this.basicSalary + this.dearsnceAllowance;

	}
	
	public void accept(Scanner sc) {
		System.out.println("enter basicSalary :");
		this.basicSalary=sc.nextDouble();
		System.out.println("enter dearsnceAllowance :");
		this.dearsnceAllowance=sc.nextDouble();

	}

	@Override
	public double calcIncentives() {
		return (0.2 * this.basicSalary);
	}
}
