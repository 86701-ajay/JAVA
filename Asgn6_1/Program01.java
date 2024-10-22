package com.sunbeam.tester;

import com.sunbeam.entity.Strlen;
import com.sunbeam.exceptions.ExceptionLineTooLong;

public class Program01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Strlen s = new Strlen();
		s.findLength();
	}	catch (ExceptionLineTooLong e) {
		e.printStackTrace();
	}
	
	System.out.println();
		System.out.println("Thank you ...");
	

}
}
