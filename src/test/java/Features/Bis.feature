@bis
Feature: Test the BIS generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user scrolls to the bis tab
    And the user clicks on the bis header button
    And the bis form opens
    And the bis tab body is centered
    When the user clicks on the generate bis button
    Then the bis result is visible


  Scenario: Validate that it generated data with filling the form

    And the user scrolls to the bis tab
    And the user clicks on the bis header button
    And the bis form opens
    And the bis tab body is centered
    And the user fills in the bis form
    When the user clicks on the generate bis button
    Then the bis result is visible