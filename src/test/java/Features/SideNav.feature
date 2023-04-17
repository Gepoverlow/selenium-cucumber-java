@sidenav
Feature: Test the Side Navigation functionality

  Background:
    Given the user is on the home page

  Scenario: Validate that it filters to the bis tab

    When the user hovers over the side nav
    And the user clicks on the bis menu button
    Then the search input contains "bis"
    And the tab is displayed and open

  Scenario: Validate that it filters to the insz tab

    When the user hovers over the side nav
    And the user clicks on the insz menu button
    Then the search input contains "insz"
    And the tab is displayed and open

  Scenario: Validate that it filters to the kbo tab

    When the user hovers over the side nav
    And the user clicks on the kbo menu button
    Then the search input contains "kbo"
    And the tab is displayed and open

  Scenario: Validate that it filters to the lorem tab

    When the user hovers over the side nav
    And the user clicks on the lorem menu button
    Then the search input contains "lorem"
    And the tab is displayed and open

  Scenario: Validate that it filters to the nihii tab

    When the user hovers over the side nav
    And the user clicks on the nihii menu button
    Then the search input contains "nihii"
    And the tab is displayed and open

  Scenario: Validate that it filters to the plates tab

    When the user hovers over the side nav
    And the user clicks on the plates menu button
    Then the search input contains "plates"
    And the tab is displayed and open

  Scenario: Validate that it filters to the polis tab

    When the user hovers over the side nav
    And the user clicks on the polis menu button
    Then the search input contains "polis"
    And the tab is displayed and open

  Scenario: Validate that it filters to the riziv tab

    When the user hovers over the side nav
    And the user clicks on the riziv menu button
    Then the search input contains "riziv"
    And the tab is displayed and open

  Scenario: Validate that it filters to the telephone tab

    When the user hovers over the side nav
    And the user clicks on the telephone menu button
    Then the search input contains "telephone"
    And the tab is displayed and open

  Scenario: Validate that it filters to the uuid tab

    When the user hovers over the side nav
    And the user clicks on the uuid menu button
    Then the search input contains "uuid"
    And the tab is displayed and open