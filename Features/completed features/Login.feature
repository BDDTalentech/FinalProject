Feature: User can sign into their demo.oscommerce account 

Scenario: User sccessfully signs into their demo.oscommerce account 

Given I open chrome    
When I navigate demo.oscommerce.com
And I click on my account
#Then I should be taken to the login page
When I enter my email address
And my password
And click th sign in buton
Then I should be taken to my account 
#And the browser should close 

Scenario Outline: User should not be able to login with incorrect credentials 
Given I open chrome    
When I navigate demo.oscommerce.com
And I click on my account
#Then I should be taken to the login page
When I enter incorrect "<email address>" 
And incorrect "<password>" 
And click th sign in buton
Then I should be taken to my account 
#And the browser should close
Examples:

| email address         | password     | 
| lutfamashuk@yahoo.com | asdfghjkl    |
| tasnimhyder@yahoo.com | talentech123 |
| tasnimhyder@yahoo.com | asdfghjkl 	 |
| 											| talentech123 |
| lutfamashuk@yahoo.com | 						 |
|												|							 |

