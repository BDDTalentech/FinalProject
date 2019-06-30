package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;

public class MyAccountsteps {
	
	static WebDriver driver = Homepagesteps.driver;
	
	@Then("^I should click on View or change my account information$")
	public void i_should_click_on_View_or_change_my_account_information() throws Throwable {
		HomepageObjects.MyAccount.click(); 
		
	}

	@Then("^I should be taken to my account page$")
	public void i_should_be_taken_to_my_account_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.AccountviewURL);
		
	}


}
