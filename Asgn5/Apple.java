package com.app.fruits;

import java.util.Scanner;

public class Apple extends Fruits {

	@Override
	public String taste() {
		// TODO Auto-generated method stub
		return "sweet n sour";
	}
	
	
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	

	@Override
	public String toString() {
		return "Apple [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}


	public Apple(String color, double weight, String name, boolean isFresh) {
		super(color, weight, name, isFresh);
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
