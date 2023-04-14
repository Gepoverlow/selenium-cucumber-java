@bis
Feature: Test the BIS generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the bis tab
    When the user clicks on the generate bis button
    Then the bis data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the bis tab
    And the user clicks on the "<genderKnown>" input of isGenderKnown and "<dobKnown>" of the isBirthdayKnown bis field
    And the user types "<date>" into the date input and "<amount>" into the amount input bis fields
    When the user clicks on the generate bis button
    Then the bis data result is visible
      Examples:
    | genderKnown | dobKnown | date       | amount |
    | yes         | yes      | 12/12/2007 | 1      |
    | yes         | no       | 12/12/2007 | 1      |
    | no          | no       | 12/12/2007 | 10     |
    | no          | yes      | 12/12/2007 | 10     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the bis tab
    And the user types "<date>" into the date input and "<amount>" into the amount input bis fields
    When the user clicks on the generate bis button
    Then the bis data result is visible
    Examples:
      | date       | amount |
      | notadate   | 0      |
      | &&&&&&&    | @@@    |
      | 12         | hello  |
      | 00/00/000  | -1     |