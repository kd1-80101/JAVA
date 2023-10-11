package com.market.fruits;

import java.util.Scanner;

public class Fruit {
	private String color;
	private Double weight;
	private String name;
	private boolean fruitState;

	public Fruit(String color, Double weight, String name, boolean fruitState) {

		this.color = color;
		this.weight = weight;
		this.name = name;
		this.fruitState = fruitState;
	}

	final public boolean getFruitState() {
		return fruitState;
	}

	final public void setFruitState(boolean fruitState) {
		this.fruitState = fruitState;
	}

	public Scanner sc = new Scanner(System.in);

	final public String getColor() {
		return color;
	}

	final public void setColor(String color) {
		this.color = color;
	}

	final public Double getWeight() {
		return weight;
	}

	final public void setWeight(Double weight) {
		this.weight = weight;
	}

	final public String getName() {
		return name;
	}

	final public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "color =" + color + "\n weight =" + weight + "\n name =" + name + "";
	}

	public String taste() {
		return "no specific taste ";
	}

	public void acceptData() {
		// System.out.println("Please Enter the Name :");
//		this.name = sc.next();
		System.out.println("Please enter the weight of the fruit :");
		this.weight = sc.nextDouble();
		System.out.println("Please enter the Color of fruit :");
		this.color = sc.next();
		this.fruitState = true;

	}

	public void displayData() {
		System.out.println("Name of fruit :" + this.name);
		System.out.println("Color of fruit :" + this.color);
		System.out.println("Weight of fruit :" + this.weight);

	}

	public boolean isfresh() {
		if (this.fruitState)
			return true;
		else
			return false;
	}
}
