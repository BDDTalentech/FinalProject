package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ReviewSteps {
	static WebDriver driver = Homepagesteps.driver;
	

	@When("^I click the samsung galaxy tab$")
	public void i_click_the_samsung_galaxy_tab() throws Throwable {
		HomepageObjects.SamsungGalaxyTab.click();
	}

	@When("^I click on the review button$")
	public void i_click_on_the_review_button() throws Throwable {
		HomepageObjects.Review.click();
		
	}

	@Then("^I should be taken to product review$")
	public void i_should_be_taken_to_product_review() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.ReviewURL);

	}

	
}
