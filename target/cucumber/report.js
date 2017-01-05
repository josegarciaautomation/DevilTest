$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("com/google/features/searchItem.feature");
formatter.feature({
  "line": 1,
  "name": "Search an item in google check the links in the results page",
  "description": "\nAs a user, I should be able to search an item and check the links in the results page",
  "id": "search-an-item-in-google-check-the-links-in-the-results-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2975555708,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "User search for an item and check the links in the results page",
  "description": "",
  "id": "search-an-item-in-google-check-the-links-in-the-results-page;user-search-for-an-item-and-check-the-links-in-the-results-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Test"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "I am in the Google page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I enter \"selenium\" to search for",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click in the search button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I see the results",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "the result links are valid",
  "keyword": "And "
});
formatter.match({
  "location": "SearchItemPositive.i_am_in_the_Google_page()"
});
formatter.result({
  "duration": 2549103957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 9
    }
  ],
  "location": "SearchItemPositive.i_enter_to_search_for(String)"
});
formatter.result({
  "duration": 234500525,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemPositive.i_click_in_the_search_button()"
});
formatter.result({
  "duration": 214393834,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemPositive.i_see_the_results()"
});
formatter.result({
  "duration": 1176491743,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemPositive.the_result_links_are_valid()"
});
formatter.result({
  "duration": 9419253352,
  "status": "passed"
});
formatter.after({
  "duration": 87252075,
  "status": "passed"
});
});