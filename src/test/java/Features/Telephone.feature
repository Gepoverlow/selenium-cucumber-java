@telephone
Feature: Test the TELEPHONE generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the telephone tab
    When the user clicks on the generate telephone button
    Then the telephone data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the telephone tab
    And the user selects "<selection>" from the menu of the telephone field
    And the user types "<amount>" into the amount input telephone field
    When the user clicks on the generate telephone button
    Then the telephone data result is visible
    Examples:
      | selection |  amount |
      | Aruba     |   1     |
      | Argentina |   5     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the telephone tab
    And the user types "<amount>" into the amount input telephone field
    When the user clicks on the generate telephone button
    Then the telephone data result is visible
    Examples:
      | amount |
      | 0      |
      | @@@    |
      | hello  |
      | -1     |