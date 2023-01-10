#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: User validate LoginPage
  I want to use this template for my feature file



  Scenario Outline: User enters username, password as data driven
    Given The user opens Chrome Browser and Enter the Login page url "https://dsportalapp.herokuapp.com/login"
    When User enter <username> and <password>
    And click on Login
    Then it should open a Home page with "Successfully Logged In"


Examples: 
      | username   | password | status |
      | SDET88 | Vasanthi123 | Pass   |
      
