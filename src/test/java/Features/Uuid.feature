@uuid
Feature: Test the UUID generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the uuid tab
    When the user clicks on the generate uuid button
    Then the uuid data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the uuid tab
    And the user types "<version>" into the version input and "<amount>" into the amount input uuid fields
    When the user clicks on the generate uuid button
    Then the uuid data result is visible
    Examples:
      | version | amount |
      | 1       | 1      |
      | 4       | 5      |


  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the uuid tab
    And the user types "<version>" into the version input and "<amount>" into the amount input uuid fields
    When the user clicks on the generate uuid button
    Then the uuid data result is visible
    Examples:
      | version     | amount |
      | 3           | 0      |
      | -1          | @@@    |
      | 100000      | hello  |
      | notaversion | -1     |