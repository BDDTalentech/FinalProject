package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

	public class AdvancedSearchSteps {
	
		static WebDriver driver;
	

	@When("^I click on advanced search$")
	public void i_click_on_advanced_search() throws Throwable {
		HomepageObjects.AdvancedSearch.click();

}

	@When("^I enter price from$")
	public void i_enter_price_from() throws Throwable {
		HomepageObjects.PriceFromTextBox.sendKeys(HomepageObjects.PriceFrom);
			
}
	
	@When("^I click search$")
	public void i_click_search() throws Throwable {
		HomepageObjects.SearchButton.click();
		
}

	@Then("^I should be taken to the products that meet the search criteria page$")
	public void i_should_be_taken_to_the_products_that_meet_the_search_criteria_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.AdvancedSearchURL);
		
	}

	
	
}


