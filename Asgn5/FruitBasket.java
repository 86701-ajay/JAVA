package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {

	public static int menu(Scanner sc) {
		System.out.println("0.EXIT");
		System.out.println("1. Add Mango");
		System.out.println("2. Add Orange");
		System.out.println("3. Add Apple");
		System.out.println("4. Display names of all fruits in the basket.");
		System.out.println("5. Display name,color,weight , taste of all fresh fruits , in the basket.");
		System.out.println("6. Display tastes of all stale(not fresh) fruits in the basket.");
		System.out.println("7. Mark a fruit as stale");
		System.out.println("8. Mark all sour fruits stale (optional)");
		System.out.print("Enter your choice : ");
		return sc.nextInt();

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice = 0;
		Fruits[] arr = new Fruits[3];
		int cnt = 0; 

		while ((choice = menu(sc)) != 0) {
			switch (choice) {
			case 1:
				if (cnt < arr.length) {
					arr[cnt] = new Mango();
					arr[cnt].accept(sc);
					cnt++;
				}
				break;

			case 2:
				if (cnt < arr.length) {
					arr[cnt] = new Orange();
					arr[cnt].accept(sc);
					cnt++;
				}
				break;

			case 3:
				if (cnt < arr.length) {
					arr[cnt] = new Apple();
					arr[cnt].accept(sc);
					cnt++;
				}
				break;

			case 4:
				for (Fruits e : arr)
					if (e != null)
						System.out.println(e.getName());
				break;

			case 5:
				for (Fruits e : arr)
					if (e != null)
						System.out.println(e + " " + e.taste());
				break;

			case 6:
				for (Fruits e : arr)
					if (e.isFresh() == false)
						System.out.println(e.taste());
				break;

			case 7:
				int num;
				System.out.print("Enter index no : ");
				num = sc.nextInt();
				if (num < cnt)
					arr[num].setFresh(false);
				break;

			case 8:
				for (Fruits e : arr)
					if (e.taste() == "sour")
						e.isFresh = false;
				break;

			default:
				break;
			}
		}

	}

}
