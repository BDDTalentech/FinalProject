Feature: Users can see dvd movies under cartoons
Scenario: Users can successfully see the movies under the cartoon section
Given I open chrome 
When I navigate demo.oscommerce.com
And I click on dvdmovies
And I click on cartoons
Then I should be taken to the cartoon dvd movie page
And the browser should close