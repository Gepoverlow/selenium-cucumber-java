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
      | selection             | version | amount |
      | Arts                  | 1       | 1      |
      | Ziekenhuisapotheker   | 5       | 5      |
      | Tandarts              | 10      | 10     |
      | Vroedvrouw            | 15      | 15     |
      | Verpleegkundige       | 20      | 20     |
      | Kinesitherapeut       | 25      | 25     |
      | Logopedist            | 30      | 30     |
      | Opticien              | 35      | 35     |
      | Audicien              | 40      | 40     |
      | Bandagist             | 45      | 45     |
      | Podoloog              | 50      | 50     |
      | Dietisten             | 55      | 55     |
      | Orthopedist           | 60      | 60     |
      | Apotheker             | 70      | 70     |
      | Ziekenhuis            | 75      | 75     |
      | Klinisch-Laboratorium | 80      | 80     |
      | Ziekenhuisapotheker   | 99      | 99     |

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
      | &A          | 1000   |