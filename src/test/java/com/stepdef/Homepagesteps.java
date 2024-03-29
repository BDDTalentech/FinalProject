package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.pageobjects.HomepageObjects;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Homepagesteps {

	static WebDriver driver; 
	static WebDriverWait wait;

	@Given("^I open chrome$")
	public void i_open_chrome() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 7);
		PageFactory.initElements(driver, HomepageObjects.class);
		
	}
	
	@Given("^I open firefox$")
	public void i_open_firefox() throws Throwable {
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 7);
		PageFactory.initElements(driver, HomepageObjects.class);
		
	}
	
	
	
@When("^I navigate demo\\.oscommerce\\.com$")
	public void i_navigate_demo_oscommerce_com() throws Throwable {
		driver.get("https://demo.oscommerce.com/index.php");

		}

//@When("^I navigatee demo\\.oscommerce\\.com$")
//public void i_navigate_demo_oscommerce_com() throws Throwable {
	//driver.get(HomepageObjects.homepageURL);
//}

	@Then("^I should be taken to the demo\\.oscomemrce homepage$")
	public void i_should_be_taken_to_the_demo_oscomemrce_homepage() throws Throwable {
		Assert.assertEquals(driver.getCurrentUrl(), "https://demo.oscommerce.com/");
		Assert.assertEquals(driver.getTitle(), "osCommerce Demo");
		//wait.until(expectedconditions.)

	}

	@Given("^the browser should close$")
	public void the_browser_should_close() throws Throwable {
		driver.quit();
	}

	
	//these methods are from loginsteps

}
