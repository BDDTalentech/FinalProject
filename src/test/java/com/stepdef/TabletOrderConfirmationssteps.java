package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TabletOrderConfirmationssteps {
	
	static WebDriver driver = Homepagesteps.driver; 

	
	@Then("^I click on the osCommerce logo to be taken to main page$")
	public void i_click_on_the_osCommerce_logo_to_be_taken_to_main_page() throws Throwable {
		HomepageObjects.OsCommerceLogo.click();
	}

	@Then("^I select Samsung Galaxy Tab$")
	public void i_select_Samsung_Galaxy_Tab() throws Throwable {
		HomepageObjects.Galaxy.click();
	}

	@Then("^I should be taken to the Samsung Galaxy Tab product page$")
	public void i_should_be_taken_to_the_Samsung_Galaxy_Tab_product_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.GalaxyTabletURL);
	}

	@When("^I click on the Add to cart button$")
	public void i_click_on_the_Add_to_cart_button() throws Throwable {
		HomepageObjects.AddToCart.click();
	}

	@Then("^I should be taken to What's in my cart page$")
	public void i_should_be_taken_to_What_s_in_my_cart_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.CartViewURL);
	}

	@Then("^I click checkout$")
	public void i_click_checkout() throws Throwable {
		HomepageObjects.Checkout.click();
	}

	@Then("^I should be taken to Delivery Information Checkout page$")
	public void i_should_be_taken_to_Delivery_Information_Checkout_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.DeliveryInformationURL);
	}

	@Then("^I click Continue$")
	public void i_click_Continue() throws Throwable {
	HomepageObjects.Continue.click();
	}

	@Then("^I click Credit or Debit Card$")
	public void i_click_Credit_or_Debit_Card() throws Throwable {
		HomepageObjects.CreditCard.click();
	}

	@Then("^I should be taken to the Order Confirmation page$")
	public void i_should_be_taken_to_the_Order_Confirmation_page() throws Throwable {
	Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.OrderConfirmationURL);
	
	}


}
