package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderInfoPage {
	private static By nameLoc = By.id("name");
	private static By countryLoc = By.id("country");
	private static By cityLoc = By.id("city");
	private static By creditCardLoc = By.id("card");
	private static By monthLoc = By.id("month");
	private static By yearLoc = By.id("year");
	private static By purchaseLoc = By.xpath("//button[contains(text(),'Purchase')]");
// private static By checkplaceorderLoc= By.id("orderModalLabel");
	private static By clickoncloseLoc = By.xpath("//div[@id='orderModal']//button[@class='btn btn-secondary'][contains(text(),'Close')]");

// public static String checkPlaceOrder(WebDriver driver) {
// String Text = driver.findElement(checkplaceorderLoc).getText();
// System.out.println(Text);
// return Text;
// }
	public static void enterName(WebDriver driver, String name) {
		driver.findElement(nameLoc).sendKeys(name);
	}

	public static void enterCountry(WebDriver driver, String country) {
		driver.findElement(countryLoc).sendKeys(country);
	}

	public static void enterCity(WebDriver driver, String city) {
		driver.findElement(cityLoc).sendKeys(city);
	}

	public static void enterCreditCard(WebDriver driver, String creditcard) {
		driver.findElement(creditCardLoc).sendKeys(creditcard);
	}

	public static void enterMonth(WebDriver driver, String month) {
		driver.findElement(monthLoc).sendKeys(month);
	}

	public static void enterYear(WebDriver driver, String year) {
		driver.findElement(yearLoc).sendKeys(year);
	}

	public static void clickPurchase(WebDriver driver) {
		driver.findElement(purchaseLoc).click();
	}

	public static void clickOnClose(WebDriver driver) {
		driver.findElement(clickoncloseLoc).click();
	}
}
