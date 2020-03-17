
package com.cts.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ThanksPage {
private static By thanksmessageLoc= By.xpath("//h2[contains(text(),'Thank you for your purchase!')]");
private static By OkLoc=By.xpath("//button[@class='confirm btn btn-lg btn-primary']");

public static String thanksMessage(WebDriver driver) {
String thanksElement = driver.findElement(thanksmessageLoc).getText();
System.out.println(thanksElement);
return thanksElement;
}
public static void clickOnOK(WebDriver driver) {
driver.findElement(OkLoc).click();
}

}


