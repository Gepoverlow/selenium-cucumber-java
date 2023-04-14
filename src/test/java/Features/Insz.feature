@insz
Feature: Test the INSZ generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the insz tab
    When the user clicks on the generate insz button
    Then the insz data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the insz tab
    And the user types "<date>" into the date input and "<amount>" into the amount input insz fields
    When the user clicks on the generate insz button
    Then the insz data result is visible
    Examples:
      | date        | amount |
      | 12/01/1990  | 1      |
      | 01/12/1999  | 10     |
      | 07/07/2000  | 50     |
      | 12/10/2020  | 100    |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the insz tab
    And the user types "<date>" into the date input and "<amount>" into the amount input insz fields
    When the user clicks on the generate insz button
    Then the insz data result is visible
    Examples:
      | date       | amount |
      | notadate   | 0      |
      | &&&&&&&    | @@@    |
      | 12         | hello  |
      | 00/00/000  | -1     |