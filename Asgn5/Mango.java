package com.app.fruits;

import java.util.Scanner;

public class Mango extends Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet";
	}
	
	public Mango() {
		// TODO Auto-generated constructor stub
	}

	public Mango(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Mango [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	


}
