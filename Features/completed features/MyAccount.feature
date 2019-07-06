Feature: User can sign in to view their Account information.

Scenario: User sccessfully signs in to view their account
Given I open chrome    
When I navigate demo.oscommerce.com
And I click on my account
#Then I should be taken to the login page
When I enter my email address
And my password
And click th sign in buton
And I should be taken to my account 
Then I should click on View or change my account information 
And I should be taken to my account page
And the browser should close 

 