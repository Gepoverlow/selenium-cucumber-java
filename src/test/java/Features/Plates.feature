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
      | selection                 | amount |
      | 1971-1973                 | 1      |
      | 1973-2008                 | 5      |
      | 2008-2010                 | 10     |
      | 2010-present              | 15     |
      | Royalty                   | 20     |
      | Representatives           | 25     |
      | Senators                  | 30     |
      | Community politicians     | 35     |
      | Diplomat                  | 40     |
      | Pre 7/10/2014 oldtimer    | 45     |
      | Post 7/10/2014 oldtimer   | 50     |
      | International             | 55     |
      | Agricultural              | 60     |
      | Current international     | 65     |
      | Dealers pre 7/10/2014     | 70     |
      | Dealers post 7/10/2014    | 75     |
      | Trailer pre 7/10/2014     | 80     |
      | Trailer post 7/10/2014    | 85     |
      | Limousine pre 7/10/2014   | 90     |
      | Limousine post 7/10/2014  | 95     |
      | Test vehicle              | 99     |
      | Motorcycle pre 7/10/2014  | 99     |
      | Motorcycle post 7/10/2014 | 99     |
      | Taxi pre 7/10/2014        | 99     |
      | Taxi post 7/10/2014       | 99     |
      | Military                  | 99     |

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