@polis
Feature: Test the POLIS generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the polis tab
    When the user clicks on the generate polis button
    Then the polis data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the polis tab
    And the user fills in the fields needed to generate polis data
    When the user clicks on the generate polis button
    Then the polis data result is visible