@kbo
Feature: Test the KBO generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the kbo tab
    When the user clicks on the generate kbo button
    Then the kbo data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the kbo tab
    And the user fills in the fields needed to generate kbo data
    When the user clicks on the generate kbo button
    Then the kbo data result is visible