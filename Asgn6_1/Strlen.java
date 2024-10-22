package com.sunbeam.entity;

import java.util.Scanner;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class Strlen {

	int str;
   Scanner sc = new Scanner(System.in);
   
   public void findLength() {
	
	   System.out.print("Enter the string : ");
		String s = sc.next();
		if( s.length()>8) {
			throw new ExceptionLineTooLong("the string is too long");
		}
		str = s.length();
		System.out.println("lenght : "+str);
	
	   
}
}
