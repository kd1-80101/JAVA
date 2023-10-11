package com.market.fruits;

public class Orange extends Fruit {

	public Orange() {
		this("", 00.0, true);
	}

	public Orange(String color, Double weight, boolean fruitState) {
		super(color, weight, "Orange", fruitState);

	}

	@Override
	public void acceptData() {
		System.out.println("Please Enter The Details Of Orange :");

		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
		this.taste();

	}

	@Override
	public String taste() {
		return "sour taste ";
	}
}
