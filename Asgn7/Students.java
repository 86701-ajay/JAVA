package com.sunbeam;

public class Students implements Comparable<Students> {

	private int roll;
	private String name;
	private String city;
	private double marks;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}

	public Students(int roll, String name, String city, double marks) {
		super();
		this.roll = roll;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Students [roll=" + roll + ", name=" + name + ", city=" + city + ", marks=" + marks + "]";
	}

	public int getRoll() {
		return roll;
	}


	public String getName() {
		return name;
	}

	

	public String getCity() {
		return city;
	}

	

	public double getMarks() {
		return marks;
	}

	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.roll - o.roll;
	}


	
	
	
	
}
