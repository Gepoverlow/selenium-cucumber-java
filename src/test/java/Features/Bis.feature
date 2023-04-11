@bis
Feature: Test the BIS generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the bis tab
    When the user clicks on the generate bis button
    Then the bis data result is visible


  Scenario: Validate that it generated data with filling the form

    And the user opens the bis tab
    And the user fills in the fields needed to generate bis data
    When the user clicks on the generate bis button
    Then the bis data result is visible