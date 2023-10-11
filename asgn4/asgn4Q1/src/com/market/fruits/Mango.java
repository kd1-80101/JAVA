package com.market.fruits;

public class Mango extends Fruit {
	public Mango() {
		this("", 00.0, true);
	}

	public Mango(String color, Double weight, boolean fruitState) {
		super(color, weight, "Mango", fruitState);
	}

	@Override
	public void acceptData() {
		System.out.println("Please Enter The Details Of Mango :");

		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
		this.taste();

	}

	@Override
	public String taste() {
		return "sweet taste ";
	}

}
