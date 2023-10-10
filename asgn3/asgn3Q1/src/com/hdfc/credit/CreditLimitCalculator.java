package com.hdfc.credit;

import java.util.Scanner;

public class CreditLimitCalculator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("____________________________");
		System.out.println("Enter the account number :");
		int accountNumber = scanner.nextInt();
		System.out.println("Enter the account balance at beginning :");
		int beginningBalance = scanner.nextInt();
		System.out.println("Enter the total of all items charged in this month :");
		int totalCharges = scanner.nextInt();
		System.out.println("Enter the total  of all credits applied in this month:");
		int totalCredits = scanner.nextInt();
		System.out.println("Enter the Credit Limit:");
		int creditLimit = scanner.nextInt();
		System.out.println("____________________________");

		int newBalance = beginningBalance + totalCharges - creditLimit;
		if (newBalance > creditLimit) {
			System.out.println("Your New Balance :" + newBalance);
			System.out.println("Credit Limit Exceeded");
		} else
			System.out.println("Your New Balance :" + newBalance);
		System.out.println("Credit Limit Not Exceeded");

	}

}
