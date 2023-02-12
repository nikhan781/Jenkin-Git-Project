Feature: HomePage Functionality Test

  Scenario: As a user I should navigate to Service Page
    Given I am on homepage
    When I click on Services link
    Then I should navigate to Services page successfully
    And I verify that 'Enterprise Solutions' link is available
