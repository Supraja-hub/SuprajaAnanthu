package com.cts.pages;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;

	public class addToCartPage{
	
	private static By addCartLoc= By.linkText("Add to cart");
	private static By cartLoc= By.linkText("Cart");
	public static void clickOnAddToCart(WebDriver driver)
	{
	driver.findElement(addCartLoc).click();
	}
	public static void clickCart(WebDriver driver)
	{
	driver.findElement(cartLoc).click();
	}
	}


