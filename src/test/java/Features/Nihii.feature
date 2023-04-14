@nihii
Feature: Test the NIHII generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the nihii tab
    When the user clicks on the generate nihii button
    Then the nihii data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the nihii tab
    And the user selects "<selection>" from the menu of the nihii field
    And the user types "<version>" into the version input and "<amount>" into the amount input nihii fields
    When the user clicks on the generate nihii button
    Then the nihii data result is visible
    Examples:
      | selection  | version | amount |
      | Podoloog   | 1       |  1     |
      | Apotheker  | 2       |  5     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the nihii tab
    And the user types "<version>" into the version input and "<amount>" into the amount input nihii fields
    When the user clicks on the generate nihii button
    Then the nihii data result is visible
    Examples:
      | version     | amount |
      | notaversion | 0      |
      | &&&&&&&     | @@@    |
      | 12          | hello  |
      | 00/00/000   | -1     |