package com.sunbeam;

import java.util.Scanner;

public class Labor implements Emp {
	private int hours;
	private double rate;

	public Labor() {
	}

	public Labor(int hours, double rate) {
		super();
		this.hours = hours;
		this.rate = rate;
	}

	public int getHours() {
		return hours;
	}

	public void setHours(int hours) {
		this.hours = hours;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public void accept(Scanner sc) {
		System.out.println("enter hours :");
		this.hours = sc.nextInt();
		System.out.println("enter rate :");
		this.rate = sc.nextInt();

	}

	@Override
	public double getSal() {
		return this.rate * this.rate;
	}

	@Override
	public double calcIncentives() {
		if (this.hours > 300) {
			return 0.05 * this.getSal();
		} else
			return this.getSal();
	}

}
