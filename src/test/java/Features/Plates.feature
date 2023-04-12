@plates
Feature: Test the PLATES generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the plates tab
    When the user clicks on the generate plates button
    Then the plates data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the plates tab
    And the user fills in the fields needed to generate plates data
    When the user clicks on the generate plates button
    Then the plates data result is visible