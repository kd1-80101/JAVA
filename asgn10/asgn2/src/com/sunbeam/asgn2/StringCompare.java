package com.sunbeam.asgn2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class StringLengthCompare implements Comparator<String> {

	@Override
	public int compare(String arg0, String arg1) {
//		int diff = arg0.compareTo(arg1);
		int diff = arg0.length() - arg1.length();
		return diff;
	}

}

public class StringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		Collections.addAll(list, "prasann", "pavan", "suyash", "akhil", "pavan", "akash");
		System.out.println(list);
		String max = Collections.max(list, new StringLengthCompare());
		System.out.println("max String using Collections.max() : " + max);
	}

}
