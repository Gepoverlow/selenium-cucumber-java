@telephone
Feature: Test the TELEPHONE generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the telephone tab
    When the user clicks on the generate telephone button
    Then the telephone data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the telephone tab
    And the user fills in the fields needed to generate telephone data
    When the user clicks on the generate telephone button
    Then the telephone data result is visible