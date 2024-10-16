package com.sunbeam.assignment.p1;

import java.util.Scanner;

public class Invoice {
	
	String part_no;
	String part_desc;
	int item_quant;
	double item_price;
    static double result = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public Invoice() {
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(String part_no, String part_desc, int item_quant, double item_price) {
		super();
		this.part_no = part_no;
		this.part_desc = part_desc;
		this.item_quant = item_quant;
		this.item_price = item_price;
	}

	public String getPart_no() {
		return part_no;
	}

	public void setPart_no(String part_no) {
		this.part_no = part_no;
	}

	public String getPart_desc() {
		return part_desc;
	}

	public void setPart_desc(String part_desc) {
		this.part_desc = part_desc;
	}

	public int getItem_quant() {
		return item_quant;
	}

	public void setItem_quant(int item_quant) {
		this.item_quant = item_quant;
	}

	public double getItem_price() {
		return item_price;
	}

	public void setItem_price(double item_price) {
		this.item_price = item_price;
	}
	
public void display() {
		
		System.out.println("no : "+ getPart_no());
		System.out.println("desc : "+ getPart_desc());
		System.out.println("quantity : "+ getItem_quant());
		System.out.println("price : "+ getItem_price());
		System.out.println("-----------------------------------");
//	System.out.println(x.getPart_no()+"     "+x.getPart_desc()+"     "+x.getItem_quant()+
//			"     "+x.getItem_price());
		
	}
	
public void accept() {
	System.out.print("Enter no : ");
	setPart_no(sc.next());
	System.out.print("Enter desc : ");
	setPart_desc(sc.next());
	System.out.print("Enter quant : ");
	setItem_quant(sc.nextInt());
	System.out.print("Enter price : ");
	setItem_price(sc.nextDouble());
	System.out.println("-----------------------------------");
}

public void totalPrice() {
	double amt;
	if(getItem_price() < 0) {
		setItem_price(0);
	}
	if(getItem_quant() < 0) {
		setItem_quant(0);
	}
	amt = getItem_price() * getItem_quant() ;
	result = result + amt;
	System.out.println("Total amount : "+result);
	System.out.println("-----------------------------------");
}

	

}
