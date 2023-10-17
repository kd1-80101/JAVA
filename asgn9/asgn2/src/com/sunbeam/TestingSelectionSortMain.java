package com.sunbeam;

import java.util.Comparator;

class CompareArray implements Comparator<Double> {

	@Override
	public int compare(Double arg0, Double arg1) {
		int diff = Double.compare(arg1.doubleValue(), arg0.doubleValue());
		return diff;
	}

}

public class TestingSelectionSortMain {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Double[] arr = new Double[10];
		arr[0] = 20.11;
		arr[1] = 22.11;
		arr[2] = 41.11;
		arr[3] = 10.11;
		arr[4] = 29.11;
		arr[5] = 80.11;
		arr[6] = 62.11;
		arr[7] = 13.11;
		arr[8] = 18.11;
		arr[9] = 231.11;

		CompareArray compareArray = new CompareArray();
		selectionSort(arr, compareArray);
		System.out.println("After Sorting array (desc order): ");
		for (Double double1 : arr) {
			System.out.println(double1);
		}
	}

}
