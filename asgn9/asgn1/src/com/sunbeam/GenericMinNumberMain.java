package com.sunbeam;

public class GenericMinNumberMain {

	static <T extends Number> T findMin(T[] arr) {
		T min = arr[0];
		for (T ele : arr) {
			if (min.doubleValue() > ele.doubleValue()) {
				min = ele;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		System.out.println("THE MIN NUMBER FROM arr1 :" + min1);
		
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println("THE MIN NUMBER FROM arr2 :" + min2);
	}

}
