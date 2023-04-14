@kbo
Feature: Test the KBO generator functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it generates data without filling the form

    And the user opens the kbo tab
    When the user clicks on the generate kbo button
    Then the kbo data result is visible


  Scenario Outline: Validate that it generates data with correctly filling the form

    And the user opens the kbo tab
    And the user types "<version>" into the version input and "<amount>" into the amount input kbo fields
    When the user clicks on the generate kbo button
    Then the kbo data result is visible
    Examples:
      | version | amount |
      | 1       | 1      |
      | 2       | 10     |
      | 3       | 50     |
      | 4       | 99     |

  Scenario Outline: Validate that it generates data with incorrectly filling the form

    And the user opens the kbo tab
    And the user types "<version>" into the version input and "<amount>" into the amount input kbo fields
    When the user clicks on the generate kbo button
    Then the kbo data result is visible
    Examples:
      | version     | amount      |
      | notaversion | -1          |
      | &&&&&&&     | 10000000    |
      | -1          | &&&&&       |
      | 12/12/2007  | notanamount |