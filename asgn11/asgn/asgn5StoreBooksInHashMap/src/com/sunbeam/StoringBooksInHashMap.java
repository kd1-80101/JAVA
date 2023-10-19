package com.sunbeam;

import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class StoringBooksInHashMap {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		BookShop book;
		Map<String, BookShop> map = new HashMap<>();

		while (choice != 0) {
			System.out.println("Please select from following");
			System.out.println("0.Exit");
			System.out.println("1.Add book");
			System.out.println("2.Find book");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				book = new BookShop();
				book.acceptData(sc);
				map.put(book.getIsbn(), book);
				break;
			case 2:
				System.out.println("Enter the Book id to search");
				String isbn = sc.next();
				BookShop f = map.get(isbn);
				if (f != null)
					System.out.println("The Book You are Searching is found :" + f);
				else
					System.out.println("The Book You are Searching is not found :");
				break;
			
			}
		}
	}

}
