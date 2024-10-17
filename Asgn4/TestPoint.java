package com.app.tester;

import com.app.geometry.Point2D;

public class TestPoint {

	public static void main(String[] args) {
		 
		Point2D p3 = new Point2D(7,9);
		Point2D p4 = new Point2D(7,9);
		System.out.println("p1"+ "("+p3.getDetails()+")");
		System.out.println("p2"+ "("+p4.getDetails()+")");
		p3.isEqual(p4);
//		p4.calculateDistance(p4);
		
		Point2D p1 = new Point2D();
		p1.accept();
		Point2D p2 = new Point2D();
		p2.accept();
		System.out.println("p1"+ "("+p1.getDetails()+")");
		System.out.println("p2"+ "("+p2.getDetails()+")");
		p1.isEqual(p2);
	}

}
