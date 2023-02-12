$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("homePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage Functionality Test",
  "description": "",
  "id": "homepage-functionality-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2748265300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "As a user I should navigate to Service Page",
  "description": "",
  "id": "homepage-functionality-test;as-a-user-i-should-navigate-to-service-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I click on Services link",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should navigate to Services page successfully",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify that \u0027Enterprise Solutions\u0027 link is available",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 55217300,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iClickOnServicesLink()"
});
formatter.result({
  "duration": 369200100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iShouldNavigateToServicesPageSuccessfully()"
});
formatter.result({
  "duration": 9550100,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.iVerifyThatEnterpriseSolutionsLinkIsAvailable()"
});
formatter.result({
  "duration": 24421400,
  "status": "passed"
});
formatter.after({
  "duration": 584976200,
  "status": "passed"
});
});