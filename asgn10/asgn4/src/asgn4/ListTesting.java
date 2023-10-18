package asgn4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class ListTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Collection<String> c = new ArrayList<>(); //[B, D, A, C, null, null, null] 
		Collection<String> c = new HashSet<>(); // [null, A, B, C, D]
		Collection<String> c = new LinkedHashSet<>(); // [B, D, A, C, null]
		Collection<String> c = new TreeSet<>(); // Exception in thread "main" java.lang.NullPointerException
		/*
		 * 
		 * 1.rrayList: - An ArrayList is like a simple list where you can put in many
		 * items in a particular order. It doesn't mind if you put the same thing
		 * multiple times, and it can also handle null values.
		 * 
		 * 2.HashSet: - A HashSet is more like a bag. It only accepts unique things, so
		 * you can't put the same item twice. It doesn't remember the order, but it's
		 * fine with null values.
		 * 
		 * 3.LinkedHashSet: - A LinkedHashSet is similar to a list. It keeps the order
		 * of things you put in and doesn't allow duplicates. It's also good with null
		 * values.
		 * 
		 * 4.TreeSet: - Lastly, a TreeSet is like a sorted list. It's strict and doesn't
		 * accept null values. It arranges things either naturally or based on a
		 * specific order you define."
		 * 
		 */
		c.add("B");
		c.add("D");
		c.add("A");
		c.add("C");
		c.add(null);
		c.add(null);
		c.add(null);
		System.out.println(c.toString());

	}

}
