@uuid
Feature: Test the UUID generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user scrolls to the uuid tab
    And the user clicks on the uuid header button
    And the uuid form opens
    And the uuid tab body is centered
    When the user clicks on the generate uuid button
    Then the uuid result is visible


  Scenario: Validate that it generated data with filling the form

    And the user scrolls to the uuid tab
    And the user clicks on the uuid header button
    And the uuid form opens
    And the uuid tab body is centered
    And the user fills in the uuid form
    When the user clicks on the generate uuid button
    Then the uuid result is visible