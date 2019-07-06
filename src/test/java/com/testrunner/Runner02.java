package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features= "Features/TestNG", //feature folder
		glue = "com.stepdef" //stepdef package
		
		
		)

public class Runner02 extends AbstractTestNGCucumberTests {
	

}
