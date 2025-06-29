package com.utils;

public interface Locators {

	// All locator types:-
	String CSSSELECTOR = "cssselector";
	String XPATH = "xpath";
	String ID = "id";
	String NAME = "name";
	String TAGNAME = "tagname";
	String CLASSNAME = "classname";
	String LINKTEXT = "linktext";
	String PARTIALLINKTEXT = "partiallinktext";

	// Commonly used xpath locators :-
	String SignInButtonxpath = "//span[contains(text(), 'Hello, sign in')]";
	String SubmitButtonInSignInPagexpath = "//input[@type=\"submit\"]";
	String EmptyInputWarningxpath = "//div[contains(text(), 'Enter your mobile number or email')]";

}