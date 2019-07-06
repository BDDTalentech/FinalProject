Feature: User can check the review for the Samsung Galaxy Tab product

Scenario: User can successfully check the review for the Samsung Galaxy Tab product

Given I open chrome
When I navigate demo.oscommerce.com
And I click the samsung galaxy tab
#Then I should be taken to the Samsung Galaxy Tab product page
When I click on the review button
Then I should be taken to product review
And the browser should close