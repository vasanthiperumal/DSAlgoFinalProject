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
@tag3
Feature: Validate Data Structure Page
  I want to use this template for my feature file

  @tag4
  Scenario: The user navigates to Data Structure Page
   	Given The user is in the Home page after logged in	
    And the home page is diplayed with title "Numpy Ninja"
    When The user clicks  "Get Started" button below the "Data structures-Introduction" 
    Then The user should land in "Data Structures- Introduction Page"
    When The user clicks "Time Complexity" button
    Then The user should be redirected to "time complexity" of Data structures-Introduction
		When The user clicks "Try Here" button
		Then The user should be redirected to a page having an tryEditor with a Run button to test
		When user enter the Python code 
		| print"DataStructure Introduction" |
    And clicks run button
		And user is navigated to home page "https://dsportalapp.herokuapp.com/home"
				
   