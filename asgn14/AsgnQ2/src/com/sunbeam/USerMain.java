package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class USerMain {
	public static int menu(Scanner sc) {
		int choice;
		System.out.println("Menu");
		System.out.println("1.Add New User");
		System.out.println("2.Delete User");
		System.out.println("3.Update User");
		System.out.println("4.Display all User");
		System.out.println("5.Display all User of specific id");
		System.out.println("6.Change vote status");
		System.out.println("0.Exit");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		do {
			choice = menu(sc);
			switch (choice) {
			case 1:
				try (UserDao d = new UserDao()) {
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter Last name");
					String lname = sc.next();
					System.out.println("Enter email");
					String email = sc.next();
					System.out.println("Enter password");
					String passwd = sc.next();
					System.out.println("Enter date");
					String date = sc.next();
					int c = d.addUser(fname, lname, email, passwd, date);
					System.out.println("rows affected :" + c);
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;
			case 2:
				try (UserDao d = new UserDao()) {
					System.out.println("Enter the id to be deleted :");
					int id = sc.nextInt();
					int c = d.delUser(id);
					System.out.println("rows affected :" + c);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 3:
				try (UserDao d = new UserDao()) {
					System.out.println("Enter the id to be updated :");
					int id = sc.nextInt();
					System.out.println("Enter First name");
					String fname = sc.next();
					System.out.println("Enter Last name");
					String lname = sc.next();
					System.out.println("Enter email");
					String email = sc.next();
					System.out.println("Enter password");
					String passwd = sc.next();
					System.out.println("Enter date");
					String date = sc.next();
					int c = d.updateUser(id, fname, lname, email, passwd, date);
					System.out.println("rows affected :" + c);
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 4:
				try (UserDao d = new UserDao()) {
					list = d.displayAllUsers();
					list.forEach(s -> System.out.println(s));
				} catch (Exception e) {
					e.printStackTrace();
				}

				break;

			case 5:
				try (UserDao d = new UserDao()) {
					System.out.println("Enter the id to be displayed :");
					int id = sc.nextInt();
					list = d.displayCustomUsers(id);
					list.forEach(s -> System.out.println(s));
				} catch (Exception e) {
					e.printStackTrace();
				}
				break;

			case 6:try (UserDao d = new UserDao()) {
				System.out.println("Enter the id to change voting status :");
				int id = sc.nextInt();
				int c = d.changeVoteStatus(id);
				System.out.println("rows affected :" + c);
			} catch (Exception e) {
				e.printStackTrace();
			}

				break;

			default:
				break;
			}
		} while (choice != 0);
	}

}
