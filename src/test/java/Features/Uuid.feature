@uuid
Feature: Test the UUID generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the uuid tab
    When the user clicks on the generate uuid button
    Then the uuid data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the uuid tab
    And the user fills in the fields needed to generate uuid data
    When the user clicks on the generate uuid button
    Then the uuid data result is visible