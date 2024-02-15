Feature: US20 TC

  Scenario:Displays all permissions in the Permissions module.

    When User logins
    And User clicks Permissions button
    Then User should verifies all permissions is displayed
