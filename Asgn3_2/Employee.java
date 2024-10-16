package com.sunbeam.assignment.p1;

import java.util.Scanner;

public class Employee {

	String firstName ;
	String lastName;
	double monthlySalary;
	Scanner sc = new Scanner(System.in);
	
	public Employee(String firstName, String lastName, double monthlySalary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		if(monthlySalary >= 0) {
			this.monthlySalary = monthlySalary;
			}
			else {
				System.out.println("salary cannot be negative");
			}
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		if(monthlySalary >= 0) {
		this.monthlySalary = monthlySalary;
		}
		else {
			System.out.println("salary cannot be negative ");
		}
	}
	
	public void accept() {
		
		System.out.print("Enter First Name : ");
        setFirstName(sc.next());		
        System.out.print("Enter Last Name : ");
        setLastName(sc.next());	
        System.out.print("Enter Monthly Salary : ");
        setMonthlySalary(sc.nextDouble());
        System.out.println("---------------------------------------------");
	}
	
	public void display() {
		
		System.out.println("First Name : " +getFirstName());
		System.out.println("Last Name : " +getLastName());
		System.out.println("Monthly Salary : " +getMonthlySalary());
		System.out.println("---------------------------------------------");
	}
	
	public void yearlySalary() {
		double annualSalary;
		annualSalary = getMonthlySalary() * 12;
		System.out.println("yearly salary : "+annualSalary);
		System.out.println("---------------------------------------------");
	}
	
	public void raisedSalary() {
		double raisedSalary;
		raisedSalary = ( getMonthlySalary() + 0.1 * getMonthlySalary() ) * 12;
		System.out.println("raised yearly salary : "+raisedSalary);
		System.out.println("---------------------------------------------");
	}
	
	
	
	
	
	
}
