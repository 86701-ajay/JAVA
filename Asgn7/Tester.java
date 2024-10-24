package com.sunbeam;

import java.security.PublicKey;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class StudentCityComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		
		return o1.getCity().compareTo(o2.getCity());
	}
	
}

class StudentNameComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}

class StudentMarksComparator implements Comparator<Students>{

	@Override
	public int compare(Students o1, Students o2) {
		// TODO Auto-generated method stub
		return Double.compare(o2.getMarks(), o1.getMarks() );
	}
	
}

public class Tester {

	public static int menu(Scanner sc) {
		System.out.println("1. sorted on their city (asc)");
		System.out.println("2. sorted on their on marks (desc)");
		System.out.println("3. sorted on their on name (asc)");
		System.out.println("4. sorted on the rollno");
		System.out.println("5.display all studnts");
		System.out.print("Enter your choice : ");
		return sc.nextInt();
	}
	
	public static void displayStudents(Students[] arr) {
		System.out.println("*************************************");
		for(Students e:arr) {
			System.out.println(e);
		}
		System.out.println("*************************************");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Students[] arr = new Students[5];
		Comparator<Students> comparator; 
		int choice;	
		arr[0] = new Students(2, "mahi", "chennai", 70);
		arr[1] = new Students(4, "virat", "banglore", 84);
		arr[2] = new Students(3, "gautam", "kolkata", 97);
		arr[3] = new Students(5, "rohit", "mumbai", 64);
		arr[4] = new Students(1, "rahul", "punjab", 94);
		
	    

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
                   comparator = new StudentCityComparator();
                   Arrays.sort(arr, comparator);
                   displayStudents(arr);
				break;

			case 2:
				comparator = new StudentMarksComparator();
				Arrays.sort(arr, comparator);
				displayStudents(arr);

				break;

			case 3:
                 comparator = new StudentNameComparator();
                 Arrays.sort(arr, comparator);
                 displayStudents(arr);
				break;

			case 4:
                 Arrays.sort(arr);
                 displayStudents(arr);
				break;
				
			case 5:
                displayStudents(arr);
				break;

			default:
				System.out.println("wrong choice...");
				break;
			}
		}

	}

}
