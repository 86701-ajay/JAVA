package com.app.fruits;

import java.util.Scanner;

public class Orange extends Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sour";
	}

	public Orange() {
		// TODO Auto-generated constructor stub
	}

	public Orange(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Orange [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}

}
