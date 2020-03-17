package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
private static By usernameLoc = By.id("loginusername");
private static By passwordLoc = By.id("loginpassword");
private static By loginLoc = By.xpath("//button[text()='Log in']");
public static void enterUsername(WebDriver driver,String username)
{
driver.findElement(usernameLoc).sendKeys(username);

}
public static void enterPassword(WebDriver driver,String password)
{
driver.findElement(passwordLoc).sendKeys(password);
}
public static void clickLogin(WebDriver driver)
{
driver.findElement(loginLoc).click();
}

}

