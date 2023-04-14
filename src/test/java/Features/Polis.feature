@polis
Feature: Test the POLIS generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the polis tab
    When the user clicks on the generate polis button
    Then the polis data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the polis tab
    And the user selects "<selection>" from the menu of the polis field
    And the user types "<amount>" into the amount input polis field
    When the user clicks on the generate polis button
    Then the polis data result is visible
    Examples:
      | selection |  amount |
      | Fidea     |   1     |
      | Baloise   |   5     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the polis tab
    And the user types "<amount>" into the amount input polis field
    When the user clicks on the generate polis button
    Then the polis data result is visible
    Examples:
      | amount |
      | 0      |
      | @@@    |
      | hello  |
      | -1     |