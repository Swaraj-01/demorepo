package com.exceptions;

public class InvalidBrowserNameException extends RuntimeException{
	@Override
	public String toString() {
		return "The Browser Name You Entered Is Invalid";
	}
}
