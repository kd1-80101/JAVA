package com.sunbeam.library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LibraryMain {

	public static int menu(Scanner sc) {
		int choice;
		System.out.println("           MENU");
		System.out.println("1. Add new book in List");
		System.out.println("2. Display all books in forward order using random access");
		System.out.println("3. Search a book with given isbn ");
		System.out.println("4. Delete a book at given index.");
		System.out.println("5. Delete a book with given isbn.");
		System.out.println("6. Reverse the list.");
		System.out.println("Enter your choice");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice;
		ArrayList<BookShop> library = new ArrayList<BookShop>();
		BookShop book;
		int index = 0;
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				book = new BookShop();
				book.acceptData(sc);
				if (library.contains(book)) {
					int in = library.indexOf(book);
					book = library.get(in);
					book.setQuantity(1 + book.getQuantity());
				} else {
					library.add(book);
				}
			}
				break;
			case 2: {

				for (int i = 0; i < library.size(); i++) {
					book = library.get(i);
					System.out.println(book);
				}
			}
				break;
			case 3: {
				System.out.println("Please enter the bookoid to search : ");
				String str = sc.next();
				BookShop key = new BookShop();
				key.setIsbn(str);
				if (library.contains(key)) {
					index = library.indexOf(key);
					book = library.get(index);
					System.out.println(book);
				}
			}
				break;

			case 4:
				System.out.println("Enter the index to delete :");
				int in = sc.nextInt();
				if (in >= 0 && in < library.size()) {
					book = library.get(in);
					library.remove(in);
					System.out.println("BOOK REMOVED : " + book);
				} else
					System.out.println("Wrong index");
				break;

			case 5:
				System.out.println("enter the book id to remove");
				String str = sc.next();
				BookShop key1 = new BookShop();
				key1.setIsbn(str);
				if (library.contains(key1))
					index = library.indexOf(key1);
				library.remove(index);
				break;

			case 6:
				Collections.reverse(library);
				System.out.println("Reverse List " + library);
				break;

			default:
				break;
			}
		}

	}

}
