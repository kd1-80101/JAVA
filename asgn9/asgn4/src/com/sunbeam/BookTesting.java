package com.sunbeam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class CompareBooks implements Comparator<BookShop>{

	@Override
	public int compare(BookShop arg0, BookShop arg1) {
		int diff= -Double.compare(arg0.getPrice(), arg1.getPrice());
		return diff;
	}
	
}
public class BookTesting {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("0.exit");
		System.out.println("1. Add new book in list.");
		System.out.println("2. Display all books in forward order.");
		System.out.println("3. Delete at book given index");
		System.out.println("4. Check if book with given isbn is in list or not");
		System.out.println("5. Delete all books in list");
		System.out.println("6. Display number of books in list");
		System.out.println("7. Sort all books by price in desc order");

		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		int choice;
		int count = 0;
		BookShop b1;
		Scanner sc = new Scanner(System.in);
		List<BookShop> list = new ArrayList<BookShop>();
		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1: {
				b1 = new BookShop();
				b1.acceptData(sc);
				list.add(b1);
			}
			break;
			case 2:
				for (BookShop bookShop : list) {
					System.out.println(bookShop);
				}

				break;
			case 3:
				System.out.println("Enter the index to remove book");
				int index = sc.nextInt();
				for (int i = 0; i < list.size(); i++) {
					if (index == i) {
						list.remove(i);
					}
				}
				break;
			case 4:
				System.out.println("enter the isbn to search");
				String str= sc.next();
				BookShop key = new BookShop();
				key.setIsbn(str);
				if (list.contains(key))
					System.out.println(key + " in list");
				else
					System.out.println(key + " not in list");
				break;
			case 5:
				list.clear();
				System.out.println("CLEARED WHOLE LIST");
				break;
			case 6:
				
				System.out.println("No of books in list :"+list.size()); 
				break;
			case 7:
				CompareBooks c= new CompareBooks();
				list.sort(c);
				System.out.println("BOOK LIST AFTER SORTING ");
				for (BookShop bookShop : list) {
					System.out.println(bookShop);
				}
				break;

			default:
				System.out.println("WRONG CHOICE RETRY!!!!!");
				break;
			}

		}

	}

}
