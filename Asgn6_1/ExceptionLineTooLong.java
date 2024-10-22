package com.sunbeam.exceptions;

public class ExceptionLineTooLong extends RuntimeException{
	
	public ExceptionLineTooLong() {
		
	}
	
	public ExceptionLineTooLong(String msg) {
		super(msg);
	}

}
