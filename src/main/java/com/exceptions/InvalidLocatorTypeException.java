package com.exceptions;

public class InvalidLocatorTypeException extends RuntimeException{
	
	@Override
	public String toString() {
		return "The Locator Type You Entered Is Invalid";
	}
	
}
