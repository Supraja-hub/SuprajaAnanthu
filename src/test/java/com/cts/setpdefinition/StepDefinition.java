package com.cts.setpdefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cts.pages.addToCartPage;
import com.cts.pages.CartPage;
import com.cts.pages.ContactInfoPage;
import com.cts.pages.HomePage;
import com.cts.pages.LoginPage;
import com.cts.pages.NextPage;
import com.cts.pages.OrderInfoPage;
import com.cts.pages.ThanksPage;

import io.cucumber.java.en.*;

public class StepDefinition {
	WebDriver driver;

	@Given("I have browser with demoblaze page")
	public void i_have_browser_with_demoblaze_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demoblaze.com/");
	}

	@When("I enter username as {string} and I enter password as {string}")
	public void i_enter_username_as_and_I_enter_password_as(String username, String password)
			throws InterruptedException {
		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, username);
		LoginPage.enterPassword(driver, password);
		LoginPage.clickLogin(driver);
	}

	@Then("I should have login to the account")
	public void i_should_have_login_to_the_account() {
		System.out.println("Then");
	}

	@When("I enter valid username as {string} and invalid password as {string}")
	public void i_enter_username_as_and_invalid_password_as1(String userName, String Password)
			throws InterruptedException {
		HomePage.clickOnLogin(driver);
		Thread.sleep(2000);
		LoginPage.enterUsername(driver, userName);
		LoginPage.enterPassword(driver, Password);
		LoginPage.clickLogin(driver);

	}

	@Then("I should get error popup message as {string}")
	public void i_should_get_popup_as(String expectedtext) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualtext = driver.switchTo().alert().getText();
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);
	}

//	
//	 @When("I enter username as {string} and password as {string}")
//	 public void i_enter_username_as_and_password_as(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get popup as {string}")
//	 public void i_should_get_popup_as1(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @When("I enter valid username as {string} and password as {string}")
//	 public void i_enter_valid_username_as_and_password_as1(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get error popup message as {string}")
//	 public void i_should_get_error_popup_message_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @When("I enter valid username as {string} and password as {string}")
//	 public void i_enter_valid_username_as_and_password_as1(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get error popup message as {string}")
//	 public void i_should_get_error_popup_message_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @When("I enter valid username as {string} and password as {string}")
//	 public void i_enter_valid_username_as_and_password_as(String string, String string2) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get error popup message as {string}")
//	 public void i_should_get_error_popup_message_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @When("I enter valid useremail as {string} and username as {string} and message as {string}")
//	 public void i_enter_valid_useremail_as_and_username_as_and_message_as(String string, String string2, String string3) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get popup message as {string}")
//	 public void i_should_get_popup_message_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @When("I enter valid useremail as {string} and username as {string} and message as {string}")
//	 public void i_enter_valid_useremail_as_and_username_as_and_message_as(String string, String string2, String string3) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
//	
//	 @Then("I should get popup message as {string}")
//	 public void i_should_get_popup_message_as(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	 }
	@When("I enter valid recepeintEmail as {string} and recepientName as {string} and message as {string}")
	public void i_enter_valid_recepeintEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
	String recepientName, String Message) {
	ContactInfoPage.clickOnContact(driver);
	WebDriverWait wait = new WebDriverWait(driver, 30);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-email")));
	ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("recipient-name")));
	ContactInfoPage.enterRecepientName(driver, recepientName);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("message-text")));
	ContactInfoPage.enterMessage(driver, Message);
	ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get complete contact filling popup message as {string}")
	public void i_should_get_complete_contact_filling_popup_message_as(String expectedContactFillingAlertMessage) {
	WebDriverWait wait = new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.alertIsPresent());
	String actualContactFillingAlertMessage = driver.switchTo().alert().getText();
	Assert.assertEquals(actualContactFillingAlertMessage, expectedContactFillingAlertMessage);
	}

	@When("I will not enter valid recepientEmail as {string} and recepientName as {string} and message as {string}")
	public void i_will_not_enter_valid_recepientEmail_as_and_recepientName_as_and_message_as(String recepientMailId,
	String recepientName, String Message) {
	ContactInfoPage.clickOnContact(driver);
	ContactInfoPage.enterRecepientMailId(driver, recepientMailId);
	ContactInfoPage.enterRecepientName(driver, recepientName);
	ContactInfoPage.enterMessage(driver, Message);
	ContactInfoPage.clickOnMessage(driver);
	}

	@Then("I should get popup message without filling details as {string}")
	public void i_should_get_popup_message_without_filling_details_as(
	String expectedWithoutContactFillingAlertMessage) {
	WebDriverWait wait = new WebDriverWait(driver, 40);
	wait.until(ExpectedConditions.alertIsPresent());
	String actualWithoutContactFillingAlertMessage = driver.switchTo().alert().getText();
	Assert.assertEquals(actualWithoutContactFillingAlertMessage, expectedWithoutContactFillingAlertMessage);
	}


	@When("I click on the product in home page and click on add to cart")
	public void i_click_on_the_product_in_home_page_and_click_on_add_to_cart() {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
	}

	@Then("I should get a popup message as {string}")
	public void i_should_get_a_popup_message_as(String expectedText) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
	}

	@When("I click on next and selcet a product and add to cart")
	public void i_click_on_next_and_selcet_a_product_and_add_to_cart() throws InterruptedException {
		Thread.sleep(1000);
		HomePage.clickNext(driver);
		NextPage.nextPageProducts(driver);
		Thread.sleep(1000);
		addToCartPage.clickOnAddToCart(driver);

	}

	@Then("It should navigate to the next page and I should get a popup message as {string}")
	public void it_should_navigate_to_the_next_page_and_I_should_get_a_popup_message_as(String expectedText) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);

	}

	@When("I click on delete")
	public void i_click_on_delete() throws InterruptedException {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.clickonDelete(driver);

	}

	@Then("The product should be deleted")
	public void the_product_should_be_deleted() {
		System.out.println("Then");

	}

	@When("I click on place order")
	public void i_click_on_place_order() {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

	}

	@Then("it should display {string} form for filling details")
	public void it_should_display_form_for_filling_details(String expectedText) {
		// String actualText=OrderInfo.checkPlaceOrder(driver);
		// System.out.println(actualText);
		// Assert.assertEquals(expectedText, actualText);
		System.out.println("Then");
	}

	@When("I enter name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfoPage.enterName(driver, name);
		OrderInfoPage.enterCountry(driver, country);
		OrderInfoPage.enterCity(driver, city);
		OrderInfoPage.enterCreditCard(driver, creditcard);
		OrderInfoPage.enterMonth(driver, month);
		OrderInfoPage.enterYear(driver, year);
		OrderInfoPage.clickPurchase(driver);
	}

	@Then("It should display a popup message as {string}")
	public void it_should_display_a_popup_message_as(String expectedmessage) {
		String actualmessage = ThanksPage.thanksMessage(driver);
		System.out.println(actualmessage);
		Assert.assertEquals(expectedmessage, actualmessage);

	}

	@When("I enter Blank name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order")
	public void i_enter_Blank_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfoPage.enterName(driver, name);
		OrderInfoPage.enterCountry(driver, country);
		OrderInfoPage.enterCity(driver, city);
		OrderInfoPage.enterCreditCard(driver, creditcard);
		OrderInfoPage.enterMonth(driver, month);
		OrderInfoPage.enterYear(driver, year);
		OrderInfoPage.clickPurchase(driver);

	}

	@Then("It should display a error popup message as {string}")
	public void it_should_display_a_error_popup_message_as(String expectedText) {

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		String actualText = driver.switchTo().alert().getText();
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);
	}

	@When("I enter name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on close")
	public void i_enter_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_close(
			String name, String country, String city, String creditcard, String month, String year) {
		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfoPage.enterName(driver, name);
		OrderInfoPage.enterCountry(driver, country);
		OrderInfoPage.enterCity(driver, city);
		OrderInfoPage.enterCreditCard(driver, creditcard);
		OrderInfoPage.enterMonth(driver, month);
		OrderInfoPage.enterYear(driver, year);
		// OrderInfo.clickPurchase(driver);
		OrderInfoPage.clickOnClose(driver);

	}

	@Then("It should go back to the cartpage and assert for {string}")
	public void it_should_go_back_to_the_cartpage_and_assert_for(String expectedText) {

		String actualText = CartPage.checkPlaceOrder(driver);
		System.out.println(actualText);
		Assert.assertEquals(expectedText, actualText);

	}

	@When("I enter name as {string} and country as {string} and city as {string} and credit card as {string} and month as {string} and year as {string} and click on purchase order and click on ok")
	public void i_enter_name_as_and_country_as_and_city_as_and_credit_card_as_and_month_as_and_year_as_and_click_on_purchase_order_and_click_on_ok(
			String name, String country, String city, String creditcard, String month, String year) {

		HomePage.clickHome(driver);
		HomePage.clickOnProduct(driver);
		addToCartPage.clickOnAddToCart(driver);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		addToCartPage.clickCart(driver);
		CartPage.placeOrder(driver);

		OrderInfoPage.enterName(driver, name);
		OrderInfoPage.enterCountry(driver, country);
		OrderInfoPage.enterCity(driver, city);
		OrderInfoPage.enterCreditCard(driver, creditcard);
		OrderInfoPage.enterMonth(driver, month);
		OrderInfoPage.enterYear(driver, year);
		OrderInfoPage.clickPurchase(driver);
		ThanksPage.clickOnOK(driver);
	}

	@Then("It should navigate to {string} page")
	public void it_should_navigate_to_page1(String expectedtext) {
		String actualtext = HomePage.checkHomePageElement(driver);
		System.out.println(actualtext);
		Assert.assertEquals(expectedtext, actualtext);

	}
}

