package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DvdMoviesSteps {
	static WebDriver driver = Homepagesteps.driver;
	static WebDriverWait wait;
	
	
	@Given("^I opened chrome$")
	public void i_opened_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 5);
		PageFactory.initElements(driver, HomepageObjects.class);
		
		
	}

	@When("^I navigate to demo\\.oscommerce\\.com$")
	public void i_navigate_to_demo_oscommerce_com() throws Throwable {
		HomepageObjects.DvdMovies.click();
		
	}

	@When("^I click on dvdmovies$")
	public void i_click_on_dvdmovies() throws Throwable {
		HomepageObjects.DvdMovies.click();
		
	}

	@When("^I click on cartoons$")
	public void i_click_on_cartoons() throws Throwable {
		HomepageObjects.Cartoons.click();
	}

	@Then("^I should be taken to the cartoon dvd movie page$")
	public void i_should_be_taken_to_the_cartoon_dvd_movie_page() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), HomepageObjects.CartoonsURL);

	}

	
}
