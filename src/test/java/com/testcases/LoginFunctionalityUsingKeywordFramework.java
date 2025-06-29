package com.testcases;

import static com.reusablecode.Keyword.*;
import static com.utils.BrowserNames.*;
import static com.utils.Locators.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFunctionalityUsingKeywordFramework {

	@Test
	public void continue_With_Empty_Input() {
		RemoteWebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//button[contains(text(), 'Continue shopping')]")).click();
		} catch (NoSuchElementException e) {

		}
		driver.findElement(By.xpath("//span[contains(text(), 'Hello, sign in')]")).click();
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		String msg = driver.findElement(By.xpath("//div[contains(text(), 'Enter your mobile number or email')]"))
				.getText();
		Assert.assertTrue(msg.contains("Enter your mobile number or email"));
		driver.quit();
	}

	// using keyword driven frameword lezzgoo 
	@Test
	public void continue_With_Empty_Input_Using_Keyword() {
		// I've put locator types, locators and browser names in interface
		// and urls in file
		openBrowser(CHROME, "homePageUrl");
		clickAnElement(XPATH, SignInButtonxpath);
		clickAnElement(XPATH, SubmitButtonInSignInPagexpath);
		String msg = getTextOfElement(XPATH, EmptyInputWarningxpath);
		Assert.assertTrue(msg.contains("Enter your mobile number or email"));
		closeBrowser();
	}

}
