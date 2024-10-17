package com.app.geometry;

import java.util.Scanner;

public class Point2D {
	
	int x;
	int y;
	Scanner sc = new Scanner(System.in);
	
	public Point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	public Point2D() {
		// TODO Auto-generated constructor stub
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}
	
	 public String getDetails() {
		 return (x + "," + y);
	 }
	 
	 public boolean isEqual(Point2D p2) {
		 
		 // this->p1
		 if((this.x == p2.x) && (this.y == p2.y)) {
			 System.out.println("p1 & p2 are located at the same position");
			 System.out.println("-----------------------------------------------------");
			 return true;
		 }
		 else {
			 
			 this.calculateDistance(p2);
			 
			 return false; 
		 }
		 
		 
		}
	 
	 public void calculateDistance(Point2D p2) {
//		 this -> p1
//		d=√((x2 – x1)² + (y2 – y1)²)
		
		 double distance = Math.sqrt(Math.pow((p2.x - this.x), 2) + Math.pow((p2.y - this.y), 2)) ;
		 System.out.println("Distance between p1 & p2 is : "+distance);
		 System.out.println("-----------------------------------------------------");
	}
	 
	 public void accept() {
		 
		 System.out.print("Enter x coord : ");
		 setX(sc.nextInt());
		 System.out.print("Enter y coord : ");
		 setY(sc.nextInt());
		 System.out.println("-----------------------------------------------------");
	}
	 

}
