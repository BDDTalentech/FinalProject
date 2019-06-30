Feature: User can sign into their demo.oscommerce account 

Scenario: User sccessfully signs into their demo.oscommerce account 
Given I open chrome    
When I navigatee demo.oscommerce.com
And I click on my account
Then I should be taken to the login page
When I enter my email address
And my password
And click th sign in buton
Then I should be taken to my account 
#And the browser should close 

 