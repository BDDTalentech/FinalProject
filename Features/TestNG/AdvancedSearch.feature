Feature: User should be able to search for products with special criteria

Scenario: User can search for a product using advanced search
Given I open chrome
When I navigate demo.oscommerce.com
And I click on advanced search
And I enter price from
And I click search
Then I should be taken to the products that meet the search criteria page