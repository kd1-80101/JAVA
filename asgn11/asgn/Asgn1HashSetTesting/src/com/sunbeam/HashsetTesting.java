package com.sunbeam;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class HashsetTesting {

	public static void main(String[] args) {
		HashSet<BookShop> booklist = new HashSet<BookShop>();

		BookShop book1 = new BookShop("1234", 200, "Random1 ", 10);
		BookShop book2 = new BookShop("1235", 210, "Random2 ", 80);
		BookShop book3 = new BookShop("1236", 520, "Random3 ", 10);
		BookShop book4 = new BookShop("1237", 350, "Random4 ", 30);
		BookShop book5 = new BookShop("1238", 350, "Random5 ", 20);
		BookShop book6 = new BookShop("1239", 560, "Random6 ", 02);
		BookShop book7 = new BookShop("1234", 660, "Random7 ", 50); // duplicate value
		/*
		 * HashSet is allowing duplicate value, it is not giving any error, exception
		 * and adding the duplicate values because equals() is present and hashCode() is not
		 * present in class.. after hashCode and equals both are present no duplicate values are
		 * added, or no data modification is done for duplicate data
		 * Output is not in order of insertion or in any specific order
		 */
		Collections.addAll(booklist, book1, book2, book3, book4, book5, book6);
		booklist.add(book7);
		Iterator<BookShop> itr = booklist.iterator();
		System.out.println("Displaying list using iterator");
		while (itr.hasNext()) {
			BookShop b = itr.next();
			System.out.println(b);

		}
	}

}
