Feature: Test that all tabs from home page can open and generate data

  Scenario Outline: Validate that all tabs are working as expected without any inputs

    Given the browser is open
    And the user is on the home page in search of a "<tab>"
    And the user scrolls to the tab
    When the user clicks on the tab
    And the tab opens to show details
    And the tab is centered
    And the user clicks on generate
    Then the results element is visible

    Examples:
    | tab       |
    | bis       |
    | insz      |
    | kbo       |
    | lorem     |
    | nihii     |
    | plates    |
    | polis     |
    | riziv     |
    | telephone |
    | uuid      |