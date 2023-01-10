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
Feature: User validate Registration page
  I want to use this template for my feature file

  Scenario Outline: User Enter username,password and confirmpassword as Data Driven
    Given The user opens Chrome Browser and Enter the Register page url "https://dsportalapp.herokuapp.com/register"
    Then The user enter the <UserName> ,<Password> and <ConfirmPassword>
    And click on Register
    Then It should open home page with an Alert messege "New Account Created."
    And click on signout
    Then click on signIn
    And The user should navigate to login page as title "Login"

    Examples: 
      | UserName   | Password        | ConfirmPassword  | Status |
      | SDET88 | Vasanthi123 | Vasanthi123 | Pass   |
      | SDET89     | dsalgo@123    | dsalgo@123     | Pass   |
