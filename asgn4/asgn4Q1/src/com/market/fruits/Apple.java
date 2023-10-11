package com.market.fruits;

public class Apple extends Fruit {

	public Apple() {
		this("", 00.0, true);

	}

	public Apple(String color, Double weight, boolean fruitState) {
		super(color, weight, "Apple", fruitState);

	}

	@Override
	public void acceptData() {
		System.out.println("Please Enter The Details Of Apple :");

		super.acceptData();
	}

	@Override
	public void displayData() {
		super.displayData();
		this.taste();

	}

	@Override
	public String taste() {
		return "sweet and sour taste ";
	}
}
