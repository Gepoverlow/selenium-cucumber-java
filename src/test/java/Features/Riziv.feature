@riziv
Feature: Test the RIZIV generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the riziv tab
    When the user clicks on the generate riziv button
    Then the riziv data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the riziv tab
    And the user selects "<selection>" from the menu of the riziv field
    And the user types "<amount>" into the amount input riziv field
    When the user clicks on the generate riziv button
    Then the riziv data result is visible
    Examples:
      | selection |  amount |
      | Dietisten |   1     |
      | Tandarts  |   5     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the riziv tab
    And the user types "<amount>" into the amount input riziv field
    When the user clicks on the generate riziv button
    Then the riziv data result is visible
    Examples:
      | amount |
      | 0      |
      | @@@    |
      | hello  |
      | -1     |