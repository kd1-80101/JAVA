package com.sunbeam;

public interface Emp {
	double getSal();

	default double calcIncentives() {

		return 0.0;
	}

	static double calcTotalIncome(Emp arr[]) {
		double total = 0.0;
		for (Emp e : arr) {
			double sum = e.getSal() + e.calcIncentives();
			total += sum;
		}
		return total;
	}
}
