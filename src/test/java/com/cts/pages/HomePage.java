package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	private static By loginLoc = By.linkText("Log in");
	private static By productLoc = By.linkText("Samsung galaxy s6");
	private static By homeLoc = By.partialLinkText("Home");
	private static By nextLoc = By.xpath("//button[@id='next2']");
	private static By productstoreLoc = By.id("nava");

	public static void clickOnLogin(WebDriver driver) {
		driver.findElement(loginLoc).click();
	}

	public static void clickOnProduct(WebDriver driver) {
		driver.findElement(productLoc).click();
	}

	public static void clickHome(WebDriver driver) {
		driver.findElement(homeLoc).click();
	}

	public static String checkHomePageElement(WebDriver driver) {
		String text = driver.findElement(productstoreLoc).getText();
		return text;
	}

	public static void clickNext(WebDriver driver) {
		driver.findElement(nextLoc).click();

	}

}
