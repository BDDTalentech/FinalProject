Feature: User can add an item to cart

Scenario: User can successfully add Samsung Galaxy Tab to their cart

Given I open chrome    
When I navigate demo.oscommerce.com
And I click on my account
#Then I should be taken to the login page
When I enter my email address
And my password
And click th sign in buton
Then I should be taken to my account
Then I click on the osCommerce logo to be taken to main page
Then I select Samsung Galaxy Tab
Then I should be taken to the Samsung Galaxy Tab product page
When I click on the Add to cart button
Then I should be taken to What's in my cart page
Then I click checkout 
Then I should be taken to Delivery Information Checkout page
Then I click Continue
Then I click Credit or Debit Card 
Then I click Continue
And I should be taken to the Order Confirmation page
#And the browser should close 