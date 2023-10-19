package com.sunbeam;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class ComparePriceComparator implements Comparator<BookShop> {

	@Override
	public int compare(BookShop arg0, BookShop arg1) {
		int diff = -Double.compare(arg0.getPrice(), arg1.getPrice());
		return diff;
	}

}

public class HashsetTesting {

	public static void main(String[] args) {
		ComparePriceComparator cmp = new ComparePriceComparator();
		TreeSet<BookShop> booklist = new TreeSet<BookShop>(cmp);

		BookShop book1 = new BookShop("1234", 200, "Random1 ", 10);
		BookShop book2 = new BookShop("1235", 210, "Random2 ", 80);
		BookShop book3 = new BookShop("1236", 520, "Random3 ", 10);
		BookShop book4 = new BookShop("1237", 250, "Random4 ", 30);// 1st instance
		BookShop book5 = new BookShop("1238", 350, "Random5 ", 20);
		BookShop book6 = new BookShop("1239", 250, "Random6 ", 02);// duplicate value as price is duplicate 2nd instance
		BookShop book7 = new BookShop("1234", 660, "Random7 ", 50);// 1st instance
		BookShop book8 = new BookShop("1234", 660, "Random8 ", 50);// duplicate value as price is duplicate 2nd instance
		/*
		 * without natural ordering its giving error with natural ordering it is not
		 * allowing duplicate values for checking it is using comparator also output is
		 * in sorted manner o/p is sorted with help of isbn(natural ordering) with
		 * adding the comparator ComparePriceComparator it is now giving the output in
		 * the desc prices..
		 */
		Collections.addAll(booklist, book1, book2, book3, book4, book5, book6);
		booklist.add(book7);
		booklist.add(book8);
		Iterator<BookShop> itr = booklist.iterator();
		System.out.println("Displaying list using iterator");
		while (itr.hasNext()) {
			BookShop b = itr.next();
			System.out.println(b);
		}
		System.out.println();

		Iterator<BookShop> desc = booklist.descendingIterator();
		System.out.println("Displaying list using desc iterator");
		while (desc.hasNext()) {
			BookShop b = desc.next();
			System.out.println(b);
		}

//		NavigableSet<BookShop> desc = booklist.descendingSet();
//		System.out.println("Using booklist.descendingSet() " + desc);

	}

}
