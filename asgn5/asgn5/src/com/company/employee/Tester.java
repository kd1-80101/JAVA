package com.company.employee;

import java.util.Scanner;

public class Tester {

	public static int menu() {
		int choice;
		System.out.println("__________________________________________________");
		System.out.println("                       MENU                       ");
		System.out.println("0.EXIT");
		System.out.println("1.ADD SALARIED EMPLOYEE");
		System.out.println("2.ADD HOURLY PAID EMPLOYEE");
		System.out.println("3.ADD COMMISION EMPLOYEE");
		System.out.println("4.ADD BASE_SALARIED EMPLOYEE");
		System.out.println("5.DISPLAY ALL EMPLOYEE");
		System.out.println("6.INCREMENT SALARIED EMPLOYEE");
		System.out.println("ENTER YOUR CHOICE");
		System.out.println("__________________________________________________");
		choice = new Scanner(System.in).nextInt();
		return choice;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int maxEmployees;
		System.out.println("ENTER MAX NO OF EMPLOYEES IN THE COMPANY :");
		maxEmployees = sc.nextInt();
		int index = 0;

		Employee[] employee = new Employee[maxEmployees];

		int choice;
		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1:
				if (index >= 0 && index < maxEmployees) {
					employee[index] = new SalariedEmployee();
					employee[index].accept(sc);
					employee[index].calculateTotalSalary();
					index++;

				}
				break;

			case 2:
				if (index >= 0 && index < maxEmployees) {
					employee[index] = new HourlyEmployee();
					employee[index].accept(sc);
					employee[index].calculateTotalSalary();
					index++;

				}
				break;
			case 3:
				if (index >= 0 && index < maxEmployees) {
					employee[index] = new CommissionEmployee();
					employee[index].accept(sc);
					employee[index].calculateTotalSalary();
					index++;

				}
				break;
			case 4:
				if (index >= 0 && index < maxEmployees) {
					employee[index] = new BasePluseCommissionEmployee();
					employee[index].accept(sc);
					employee[index].calculateTotalSalary();
					index++;

				}
				break;
			case 5: {
				for (Employee arr : employee) {
					if (arr != null)
						System.out.println("USING toString  \n" + arr.toString());

				}

			}
				break;
			case 6: {
			
				for (Employee arr : employee) {
					if (arr != null) {
					
						if (arr instanceof BasePluseCommissionEmployee) {
						
								BasePluseCommissionEmployee ptr = (BasePluseCommissionEmployee) arr;
								ptr.incrementSalary();
							}
						}
					}
				
			}
				break;

			default:
				System.out.println("WRONG CHOICE ENTERED.. RETRY!!!!");
				break;
			}

		}

	}

}
