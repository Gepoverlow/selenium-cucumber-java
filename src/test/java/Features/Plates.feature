@plates
Feature: Test the PLATES generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the plates tab
    When the user clicks on the generate plates button
    Then the plates data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the plates tab
    And the user selects "<selection>" from the menu of the plates field
    And the user types "<amount>" into the amount input plates field
    When the user clicks on the generate plates button
    Then the plates data result is visible
    Examples:
      | selection |  amount |
      | Diplomat  |   1     |
      | Military  |   5     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the plates tab
    And the user types "<amount>" into the amount input plates field
    When the user clicks on the generate plates button
    Then the plates data result is visible
    Examples:
      | amount |
      | 0      |
      | @@@    |
      | hello  |
      | -1     |