@nihii
Feature: Test the NIHII generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the nihii tab
    When the user clicks on the generate nihii button
    Then the nihii data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the nihii tab
    And the user fills in the fields needed to generate nihii data
    When the user clicks on the generate nihii button
    Then the nihii data result is visible