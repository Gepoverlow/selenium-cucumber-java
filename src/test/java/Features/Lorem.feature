@lorem
Feature: Test the LOREM generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the lorem tab
    When the user clicks on the generate lorem button
    Then the lorem data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the lorem tab
    And the user clicks on the "<lettersOnly>" input of lettersOnly lorem field
    And the user types "<length>" into the length input lorem field
    When the user clicks on the generate lorem button
    Then the lorem data result is visible
    Examples:
      |lettersOnly | length |
      | yes        | 10     |
      | no         | 1000   |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the lorem tab
    And the user types "<length>" into the length input lorem field
    When the user clicks on the generate lorem button
    Then the lorem data result is visible
    Examples:
      | length      |
      | notalength  |
      | &&&&&&&     |
      | 12          |
      | 00/00/000   |