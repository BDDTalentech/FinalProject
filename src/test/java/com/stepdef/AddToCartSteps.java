package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddToCartSteps {
	static WebDriver driver;
	static WebDriver wait;
	
	
	@When("^I click on samsung galaxy tab$")
	public void i_click_on_samsung_galaxy_tab() throws Throwable {
		HomepageObjects.SamsungGalaxyTab.click();
		

	}

	@Then("^I should be taken to the samsung galaxy tab product page$")
	public void i_should_be_taken_to_the_samsung_galaxy_tab_product_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.ProductPageURL);
		
	}

	@When("^I click on the add to cart button$")
	public void i_click_on_the_add_to_cart_button() throws Throwable {
		HomepageObjects.AddToCart2.click();
		
	}

	@Then("^I should be taken to what's in my cart page$")
	public void i_should_be_taken_to_what_s_in_my_cart_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.CartViewURL);
	}


}
