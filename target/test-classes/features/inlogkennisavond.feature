Feature: sddcsdfsdfsdf

@Regressie
Scenario: Valid Credentials
    Given the browser is opened and showing the intranet homepage
    When user logs on with valid credentials
    Then login is successful
    And the homepage is displayed