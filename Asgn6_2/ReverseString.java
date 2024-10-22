package com.sunbeam.p1;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str;
		String rstr ="";
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		str = sc.next();
		sc.close();
		for(int i=str.length()-1; i>=0; i--) {
			rstr = rstr+str.charAt(i);
		}
		System.out.println("reverse string : "+rstr);
		

	}

}
