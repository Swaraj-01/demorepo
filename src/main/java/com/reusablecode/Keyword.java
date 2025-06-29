package com.reusablecode;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.exceptions.InvalidBrowserNameException;
import com.exceptions.InvalidLocatorTypeException;
import static com.utils.FileHandling.*;

public class Keyword {

	static RemoteWebDriver driver;

	public static void openBrowser(String browserName, String urlKey) {

		String url = getURL(urlKey);
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else {
			throw new InvalidBrowserNameException();
		}
		driver.get(url);
		driver.manage().window().maximize();
		try {
			driver.findElement(By.xpath("//button[contains(text(), 'Continue shopping')]")).click();
		} catch (NoSuchElementException e) {

		}

	}

	public static void closeBrowser() {
		driver.close();
	}

	public static void clickAnElement(String LocatorType, String Locator) {
		findAnElement(LocatorType, Locator).click();
	}

	public static void sendkeysToAnElement(String LocatorType, String Locator, String TextToEnter) {
		findAnElement(LocatorType, Locator).sendKeys(TextToEnter);
	}
	
	public static String getTextOfElement(String LocatorType, String Locator) {
		String text = findAnElement(LocatorType, Locator).getText();
		return text;
	}

	public static WebElement findAnElement(String LocatorType, String Locator) {

		WebElement element = null;
		if (LocatorType.equalsIgnoreCase("cssselector")) {
			element = driver.findElement(By.cssSelector(Locator));
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(Locator));
		} else if (LocatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(Locator));
		} else if (LocatorType.equalsIgnoreCase("name")) {
			driver.findElement(By.name(Locator));
		} else if (LocatorType.equalsIgnoreCase("tagname")) {
			element = driver.findElement(By.tagName(Locator));
		} else if (LocatorType.equalsIgnoreCase("classname")) {
			element = driver.findElement(By.className(Locator));
		} else if (LocatorType.equalsIgnoreCase("linktext")) {
			element = driver.findElement(By.linkText(Locator));
		} else if (LocatorType.equalsIgnoreCase("partiallinktext")) {
			element = driver.findElement(By.partialLinkText(Locator));
		} else {
			throw new InvalidLocatorTypeException();
		}
		return element;

	}

	public static List<WebElement> findAllElements(String LocatorType, String Locator) {

		List<WebElement> elements = null;
		if (LocatorType.equalsIgnoreCase("cssselector")) {
			elements = driver.findElements(By.cssSelector(Locator));
		} else if (LocatorType.equalsIgnoreCase("xpath")) {
			elements = driver.findElements(By.xpath(Locator));
		} else if (LocatorType.equalsIgnoreCase("id")) {
			elements = driver.findElements(By.id(Locator));
		} else if (LocatorType.equalsIgnoreCase("name")) {
			elements = driver.findElements(By.name(Locator));
		} else if (LocatorType.equalsIgnoreCase("tagname")) {
			elements = driver.findElements(By.tagName(Locator));
		} else if (LocatorType.equalsIgnoreCase("classname")) {
			elements = driver.findElements(By.className(Locator));
		} else if (LocatorType.equalsIgnoreCase("linktext")) {
			elements = driver.findElements(By.linkText(Locator));
		} else if (LocatorType.equalsIgnoreCase("partiallinktext")) {
			elements = driver.findElements(By.partialLinkText(Locator));
		} else {
			throw new InvalidLocatorTypeException();
		}
		return elements;

	}

}
