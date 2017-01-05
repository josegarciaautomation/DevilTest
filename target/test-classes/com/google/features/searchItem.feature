Feature: Search an item in google check the links in the results page

As a user, I should be able to search an item and check the links in the results page

@Test
Scenario: User search for an item and check the links in the results page
	Given I am in the Google page
	And I enter "selenium" to search for
	When I click in the search button
	Then I see the results
	And the result links are valid
