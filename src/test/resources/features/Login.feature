Feature: Login requirement feature
  As a customer
  I want to logon to the application
  So I can subscribe to Journal

  @regression
  Scenario: Login with valid details
    Given I am on the homepage
    When I login with a valid details
    Then I am login successfully