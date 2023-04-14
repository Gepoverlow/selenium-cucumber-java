@riziv
Feature: Test the RIZIV generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the riziv tab
    When the user clicks on the generate riziv button
    Then the riziv data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the riziv tab
    And the user fills in the fields needed to generate riziv data
    When the user clicks on the generate riziv button
    Then the riziv data result is visible