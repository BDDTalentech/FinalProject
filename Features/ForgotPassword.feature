Feature: User should be able to sign in when forgotten password

Scenario: User will be able to sign in their account when forgotten password
Given I open chrome
When I navigatee demo.oscommerce.com
And I click on my account
And I click on Password Forgotten
Then I should be able to enter my email address 
#And the browser should close
  