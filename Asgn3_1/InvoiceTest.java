package com.sunbeam.assignment.p1;

public class InvoiceTest {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.out.println("no"+"   "+"desc"+"   "+"quant"+"   "+"price");
		Invoice i1 = new Invoice("1", "hard disk", 2, 1000);
        i1.display();
        i1.totalPrice();
        
        Invoice i2 = new Invoice();
        i2.accept();
        i2.display();
        i2.totalPrice();
        
        Invoice i3 = new Invoice("3", "mouse", 4, 150);
        i3.display();
        i3.totalPrice();
	}

}
