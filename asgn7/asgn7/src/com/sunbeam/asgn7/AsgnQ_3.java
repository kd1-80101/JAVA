package com.sunbeam.asgn7;

public class AsgnQ_3 {

	public static void main(String[] args) {
		String inputString = "abcde  fghij  klmno  pqrst  uvwxyz";

		inputString = inputString.trim();

		int wordCount = 0;
		int length = inputString.length();

		if (length > 0) {
			wordCount = 1; 

			for (int i = 0; i < length; i++) {
				char currentChar = inputString.charAt(i);
			if (currentChar == ' ' && i < length - 1 && inputString.charAt(i + 1) != ' ') {
					wordCount++;
				}
			}
		}

		System.out.println("Input String: " + inputString);
		System.out.println("Number of words: " + wordCount);
	}
}
