@lorem
Feature: Test the LOREM generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the lorem tab
    When the user clicks on the generate lorem button
    Then the lorem data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the lorem tab
    And the user fills in the fields needed to generate lorem data
    When the user clicks on the generate lorem button
    Then the lorem data result is visible