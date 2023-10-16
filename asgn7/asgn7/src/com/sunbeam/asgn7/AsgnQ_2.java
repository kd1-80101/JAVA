package com.sunbeam.asgn7;

public class AsgnQ_2 {
	public static void main(String[] args) {
		String inputString = "abcde  fghij  klmno  pqrst  uvwxyz";

		inputString = inputString.trim();

		String[] words = inputString.split("\\s+");

		int wordCount = words.length;

		System.out.println("Input String: " + inputString);
		System.out.println("Number of words: " + wordCount);
	}
}
