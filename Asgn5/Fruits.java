package com.app.fruits;

import java.util.Scanner;

public abstract class Fruits {

	String color;
	double weight;
	String name;
	boolean isFresh;

	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public abstract String taste();

	public Fruits() {
		// TODO Auto-generated constructor stub
	}

	public Fruits(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter name : ");
		name = sc.next();
		System.out.print("Enter color : ");
		color = sc.next();
		System.out.print("Enter weight : ");
		weight = sc.nextDouble();
		System.out.print("Enter isFresh : ");
		isFresh = sc.nextBoolean();
		

	}

}
