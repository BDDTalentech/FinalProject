Feature: User can view the printers from the Printer tab

Scenario: User sccessfully views the printers under the printer tab
Given I open chrome    
When I navigatee demo.oscommerce.com
And I click on my account
Then I should be taken to the login page
When I enter my email address
And my password
And click th sign in buton
Then I should be taken to my account 
Then I select the Hardware tab
Then I select the Printers icon 
Then I should see the printers avaliable  
#And the browser should close 

