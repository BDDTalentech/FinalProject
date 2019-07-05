package com.testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
		features= "Features/completed features", //feature folder
		glue = "com.stepdef" //stepdef package
		
		
		)

public class Runner01 extends AbstractTestNGCucumberTests {
	
/////////HELLLOO WORLD 
	// Hello Lutfa
	
}
