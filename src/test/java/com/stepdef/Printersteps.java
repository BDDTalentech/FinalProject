package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;

public class Printersteps {
	
	static WebDriver driver = Homepagesteps.driver; 

	
	@Then("^I select the Hardware tab$")
	public void i_select_the_Hardware_tab() throws Throwable {
		HomepageObjects.Hardware.click();
	}

	@Then("^I select the Printers icon$")
	public void i_select_the_Printers_icon() throws Throwable {
	HomepageObjects.Printers.click();
	}

	@Then("^I should see the printers avaliable$")
	public void i_should_see_the_printers_avaliable() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.PrintersURL);
	}



}
