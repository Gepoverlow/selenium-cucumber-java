@insz
Feature: Test the INSZ generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the insz tab
    When the user clicks on the generate insz button
    Then the insz data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the insz tab
    And the user fills in the fields needed to generate insz data
    When the user clicks on the generate insz button
    Then the insz data result is visible