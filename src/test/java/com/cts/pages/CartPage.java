package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
	private static By placeOrderLoc = By.xpath("//button[@class='btn btn-success']");
	private static By clickondeleteLocator = By.linkText("Delete");

	public static void placeOrder(WebDriver driver) {
		driver.findElement(placeOrderLoc).click();
	}

	public static void clickonDelete(WebDriver driver) {
		driver.findElement(clickondeleteLocator).click();
	}

	public static String checkPlaceOrder(WebDriver driver) {
		String Text = driver.findElement(placeOrderLoc).getText();
		return Text;
	}
}
