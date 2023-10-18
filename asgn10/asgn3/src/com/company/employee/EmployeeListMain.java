package com.company.employee;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

class CompareEmployee implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		int diff = arg0.getSocialSecurityNumber().compareTo(arg1.getSocialSecurityNumber());
		return diff;
	}

}

public class EmployeeListMain {

	public static void main(String[] args) {
		int choice;
		LinkedList<Employee> list = new LinkedList<Employee>();
		Employee emp;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println(
					"\n enter the choice \n1.add employee \n2.delete employee \n3.sort employees \n4.edit employee details \n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				emp = new Employee();
				emp.accept(sc);
				list.add(emp);
				System.out.println("Employee added");
				break;
			case 2: {
				System.out.println("Enter emp id to be modified: ");
				String id = sc.next();
				Employee key = new Employee();
				key.setSocialSecurityNumber(id);
				int index = list.indexOf(key);
				list.remove(index);
			}
				break;
			case 3: {

//				System.out.println("Enter SSN to find employee");
//				String str = sc.next();
//				Employee key = new Employee();
//				key.setSocialSecurityNumber(str);
//				if (list.contains(key)) {
//					System.out.println(key);
//				} else
//					System.out.println("Employee not found");
//				break;
				CompareEmployee cmp = new CompareEmployee();
				Collections.sort(list, cmp);
				System.out.println(list);
			}
				break;
			case 4: {
				System.out.println("Enter emp id to be modified: ");
				String id = sc.next();
				Employee key = new Employee();
				key.setSocialSecurityNumber(id);
				int index = list.indexOf(key);
				if (index == -1)
					System.out.println("Employee not found.");
				else {
					Employee oldEmp = list.get(index);
					System.out.println("Employee Found: " + oldEmp);
					System.out.println("Enter new information for the Employee");
					Employee newEmp = new Employee();
					newEmp.accept(sc);
					list.set(index, newEmp);
				}
			}
				break;

			default:
				System.out.println("Wrong choice");
				break;
			}
		} while (choice != 0);
	}

}
