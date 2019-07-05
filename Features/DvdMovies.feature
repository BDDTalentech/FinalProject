Feature: Users can see dvd movies under cartoons
Scenario: Users can successfully see the movies under the cartoon section
Given I open chrome 
When I navigatee demo.oscommerce.com
And I click on dvdmovies
And I click on cartoons
Then I should be taken to the cartoon dvd movie page
