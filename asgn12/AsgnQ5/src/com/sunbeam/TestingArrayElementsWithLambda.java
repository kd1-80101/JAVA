package com.sunbeam;

import java.util.Scanner;

public class TestingArrayElementsWithLambda {
	public static <T> int countIf(T[] arr, T key, Check<T> c) {
		int count = 0;
		for (T t : arr) {
			if (c.compare(key, t))
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Double[] arr = { 11.1, 22.2, 33.3, 44.4, 55.5, 66.6, 77.7, 88.8, 99.9, 22.2, 33.3, 44.4, 55.5, 66.6, 77.7, 88.8,
				22.2, 33.3, 44.4, 55.5, 66.6, 77.7, 88.8 };
		System.out.print("Enter the key to check how many times key is repeated : ");
		Double key = new Scanner(System.in).nextDouble();

		int cnt = countIf(arr, key, (x, y) -> x.equals(y));
		System.out.println("Key : " + key + " is repeated :" + cnt + " many times. ");
		//Enter the key to check how many times key is repeated : 66.6
//		Key : 66.6 is repeated :3 many times. 
	}

}
