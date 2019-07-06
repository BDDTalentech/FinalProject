package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		//features= "Features/TestNG/AddToCart.feature", //feature folder
		features= "Features/completed features/Login.feature", //feature folder
		glue = "com.stepdef" //stepdef package
		
		
		)

public class Runner3 extends AbstractTestNGCucumberTests {
	

}
