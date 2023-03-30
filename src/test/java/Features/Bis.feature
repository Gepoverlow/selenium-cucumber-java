Feature: Test the BIS tab

  Scenario: Validate that the BIS tab is working as expected

    Given the browser is open
    And the user is on the home page
    And the user scrolls to the bis tab
    When the user clicks on the bis tab
    And the tab opens to show details
    And the tab is centered
    And the user fills in data
    And the user clicks on generate
    Then the results are shown