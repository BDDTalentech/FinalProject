Feature: User can go to demo.oscommerce homepage 

Scenario: User sccessfully goes to demo.oscommerce homepage 
	Given I open chrome 
	When I navigate demo.oscommerce.com 
	#Then I should be taken to the demo.oscomemrce homepage 
	And the browser should close 
	
	
Scenario: User sccessfully goes to demo.oscommerce homepage 
	Given I open firefox 
	When I navigate demo.oscommerce.com 
	#Then I should be taken to the demo.oscomemrce homepage 
	And the browser should close 
	
	#this feature will only run the firefox browser