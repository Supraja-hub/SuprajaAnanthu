package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NextPage {
	private static By nextproductLocator = By.linkText("MacBook air");

	public static void nextPageProducts(WebDriver driver) {
		driver.findElement(nextproductLocator).click();
	}

}
