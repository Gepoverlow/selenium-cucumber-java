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
      | selection                         | amount |
      | Afghanistan                       | 1     |
      | American Samoa                    | 5     |
      | Angola                            | 5     |
      | Anguilla                          | 5     |
      | Antarctica                        | 5     |
      | Antigua and Barbuda               | 5     |
      | Argentina                         | 5     |
      | Armenia                           | 5     |
      | Aruba                             | 5     |
      | Bahamas                           | 5     |
      | Bahrain                           | 5     |
      | Barbados                          | 5     |
      | Belgium                           | 5     |
      | Belize                            | 5     |
      | Benin                             | 5     |
      | Bermuda                           | 5     |
      | Bolivia                           | 5     |
      | Bosnia and Herzegovina            | 5     |
      | Brazil                            | 5     |
      | British Indian Ocean Territory    | 5     |
      | British Virgin Islands            | 5     |
      | Brunei                            | 5     |
      | Burkina Faso                      | 5     |
      | Burundi                           | 5     |
      | Cabo Verde                        | 5     |
      | Cambodia                          | 5     |
      | Cameroon                          | 5     |
      | Canada                            | 5     |
      | Cayman Islands                    | 5     |
      | Central African Republic          | 5     |
      | Chad                              | 5     |
      | Christmas Island                  | 5     |
      | Cocos Islands                     | 5     |
      | Comoros                           | 5     |
      | Congo Republic                    | 5     |
      | Cook Islands                      | 5     |
      | Costa Rica                        | 5     |
      | Cote d’Ivoire                     | 5     |
      | Czechia                           | 5     |
      | Denmark                           | 5     |
      | Djibouti                          | 5     |
      | Dominica                          | 5     |
      | Dominican Republic                | 5     |
      | Ecuador                           | 5     |
      | Equatorial Guinea                 | 5     |
      | Eritrea                           | 5     |
      | Ethiopia                          | 5     |
      | Falkland Islands                  | 5     |
      | Faroe Islands                     | 5     |
      | Fiji                              | 5     |
      | Finland                           | 5     |
      | France                            | 5     |
      | French Guiana                     | 5     |
      | French Polynesia                  | 5     |
      | French Southern Lands             | 5     |
      | Gambia                            | 5     |
      | Germany                           | 5     |
      | Georgia                           | 5     |
      | Gibraltar                         | 5     |
      | Greece                            | 5     |
      | Greenland                         | 5     |
      | Grenada                           | 5     |
      | Guadeloupe                        | 5     |
      | Guam                              | 5     |
      | Guatemala                         | 5     |
      | Guernsey                          | 5     |
      | Guinea                            | 5     |
      | Guinea-Bissau                     | 5     |
      | Guyana                            | 5     |
      | Haiti                             | 5     |
      | Heard Island and McDonald Islands | 5     |
      | Honduras                          | 5     |
      | Isle of Man                       | 5     |
      | Jamaica                           | 5     |
      | Jersey                            | 5     |
      | Kazakhstan                        | 5     |
      | Kiribati                          | 5     |
      | Kosovo                            | 5     |
      | Kyrgyzstan                        | 5     |
      | Lesotho                           | 5     |
      | Lithuania                         | 5     |
      | Macedonia                         | 5     |
      | Maldives                          | 5     |
      | Mali                              | 5     |
      | Malta                             | 5     |
      | Marshall Islands                  | 5     |
      | Martinique                        | 5     |
      | Mauritania                        | 5     |
      | Mauritius                         | 5     |
      | Mexico                            | 5     |
      | Micronesia                        | 5     |
      | Moldavia                          | 5     |
      | Montserrat                        | 5     |
      | Morocco                           | 5     |
      | New Caledonia                     | 5     |
      | Nicaragua                         | 5     |
      | Niger                             | 5     |
      | Niue                              | 5     |
      | Norfolk Island                    | 5     |

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