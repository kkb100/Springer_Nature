Feature: Login requirement feature
  As a customer
  I want to validate the logon page

  @regression
  Scenario: Login with valid details
    Given I am on the homepage
    When I navigate to login page
    Then I am validate i am in login page
