package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ForgottenPasswordSteps {
		
		static WebDriver driver;
		

		@When("^I click on Password Forgotten$")
		public void i_click_on_Password_Forgotten() throws Throwable {
			HomepageObjects.ForgottenPassword.click();
			
			
		}

		@Then("^I should be able to enter my email address$")
		public void i_should_be_able_to_enter_my_email_address() throws Throwable {
			Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.ForgottenPassword);
		}
	}


