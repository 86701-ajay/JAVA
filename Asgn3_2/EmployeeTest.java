package com.sunbeam.assignment.p1;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Jon","Snow",-10000);
		e1.display();
		e1.yearlySalary();
		e1.raisedSalary();
		
		Employee e2 = new Employee();
		e2.accept();
		e2.display();
		e2.yearlySalary();
		e2.raisedSalary();

	}

}
