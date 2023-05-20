Feature: login page feature

  Scenario: check the user able to login
    Given User is on login page
    Then Username field is displayed
    And  Password field is displayed
    And Login page is displayed
    And User enters username
    And User enters password
    Then Click on login butten
    And Dashboard URL should be displayed as "https://testing.presolv360.com/admin/dashboard"
