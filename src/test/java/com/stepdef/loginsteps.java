package com.stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Then;  
import cucumber.api.java.en.When;

public class loginsteps {

static WebDriver driver = Homepagesteps.driver; 

@When("^I click on my account$")
public void i_click_on_my_account() throws Throwable {
	HomepageObjects.myAccountButton.click();
	
}

@Then("^I should be taken to the login page$")
public void i_should_be_taken_to_the_login_page() throws Throwable {
	Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.loginpageURL);
}

@When("^I enter my email address$")
public void i_enter_my_email_address() throws Throwable {
HomepageObjects.emailTextBox.sendKeys(HomepageObjects.email);
}

@When("^my password$")
public void my_password() throws Throwable {
	HomepageObjects.passwordTextbox.sendKeys(HomepageObjects.password);

}

@When("^click th sign in buton$")
public void click_th_sign_in_buton() throws Throwable {
	HomepageObjects.signInButton.click();

}  

@Then("^I should be taken to my account$")
public void i_should_be_taken_to_my_account() throws Throwable {


}



}
