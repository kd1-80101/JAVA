package com.sunbeam.library;

import java.util.Objects;
import java.util.Scanner;

public class BookShop {
	private String isbn;
	private double price;
	private String authorName;
	private int quantity;

	public BookShop() {
		// TODO Auto-generated constructor stub
	}

	public BookShop(String isbn, String authorName, int quantity, double price) {

		this.isbn = isbn;
		this.price = price;
		this.authorName = authorName;
		this.quantity = quantity;
	}

	
	@Override
	public String toString() {
		return "\nBookShop [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", quantity=" + quantity
				+ "]";
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof BookShop) {
			BookShop other = (BookShop) obj;
			if (this.isbn.equals(other.isbn))
				return true;
		}
		return false;
	}

	public void acceptData(Scanner sc) {
		System.out.println("please enter book details");
		System.out.println("Enter book id");
		this.isbn = sc.next();
		System.out.println("Enter book author name");
		this.authorName = sc.next();
		System.out.println("Enter book quantity");
		this.quantity = sc.nextInt();

		System.out.println("Enter book price");
		this.price = sc.nextDouble();

	}

}
