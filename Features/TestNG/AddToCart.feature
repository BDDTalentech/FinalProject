Feature: User will be able to add product to their cart
Scenario: User will successfully be able to add samsung galaxy tab to their cart
Given I open chrome
When I navigate demo.oscommerce.com
And I click on samsung galaxy tab
#Then I should be taken to the samsung galaxy tab product page
When I click on the add to cart button
Then I should be taken to what's in my cart page
#And the browser should close