Feature: Search requirement
  As a customer
  I want to perform a search
  So I can see items avaliable to subscribe


  @regression
  Scenario: Product search
    Given I am on the home page
    When I navigate to search page
    Then I can see the journal is displayed
