package com.sunbeam.asgn6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class PersonMapMain {

	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		Map<Integer, Student> map = new HashMap<>();
		Student student;

		do {
			System.out.println("Please enter you choice");
			System.out.println("0.Exit");
			System.out.println("1.Add Student");
			System.out.println("2.Search Student");
			System.out.println("3.Print all Students");
			
			choice = sc.nextInt();
			switch (choice) {
			case 1: {
				student = new Student();
				student.acceptData(sc);
				map.put(student.getRollno(), student);

			}
				break;
			case 2: {
				System.out.print("enter the roll no to search : ");
				int roll = sc.nextInt();
				Student student1 = map.get(roll);
				if (student1 != null) {
					System.out.println("Student at " + roll + " is : " + student1);
				} else {
					System.out.println("At " + roll + " No Student Exists");
				}

			}
				break;
			case 3:
				Set<Entry<Integer,Student>> list= map.entrySet();
				System.out.println(list);
			default:
				System.out.println("Wrong CHoice Retry....");
				break;
			}
		} while (choice != 0);

	}

}
