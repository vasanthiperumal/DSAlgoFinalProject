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
@tag
Feature: Validate Array Page
  I want to use this template for validating Array Page

  @tag1
  Scenario: The user navigates to Array Page
   	Given The user is in the Home page after logged into dsAlgo	
    And the home page is diplayed with title "Numpy Ninja" for Array flow
    When The user clicks  "Get Started" button below the "Array" Page
    Then The user should navidates to "Arrays Page"
    When The user taps "Arrays in Python" button
    Then The user should be redirected to "Arrays in Python" of Arrays Page
		When The user taps "Try Here" button
		Then The user should be redirected to a Array page having an tryEditor with a Run button to test
		When user enter the Python code of Array Page
		| print "Arrays" |
    And clicks run button for Array Page
		And user is navigated to home page "https://dsportalapp.herokuapp.com/home" from Array Page

#
#The user is in the Array page after logged in	The user clicks "Arrays in Python" button	The user should be redirected to "Arrays in Python" page
#The user is in the Arrays in Python page after logged in	The user clicks "Try Here" button in Arrays in Python page	The user should be redirected to a page having an tryEditor with a Run button to test
#The user is in the Array page after logged in	The user clicks "Arrays using List" button	The user should be redirected to "Arrays using List" page
#The user is in the Arrays using List page after logged in	The user clicks "Try Here" button in Arrays using List page	The user should be redirected to a page having an tryEditor with a Run button to test
#The user is in the Array page after logged in	The user clicks "Basic Operations in List" button	The user should be redirected to "Basic Operations in List" page
#The user is in the Basic Operations in List page after logged in	The user clicks "Try Here" button in Arrays using List page	The user should be redirected to a page having an tryEditor with a Run button to test
#The user is in the Array page after logged in	The user clicks "Applications of Array" button	The user should be redirected to "Applications of Array" page
#The user is in the Applications of Array page after logged in	The user clicks "Try Here" button in Applications of Arrays page	The user should be redirected to a page having an tryEditor with a Run button to test
#The user is in the Array page after logged in	The user clicks "Practice Questions" button	The user should be redirected to "Practice" page
#The user is in the Practice page	The user clicks the "Search the array" link	The user should be redirected to "Question" page contains a question,an tryEditor with Run and Submit buttons
#The user is in the Practice page	The user clicks the "Max Consecutive Ones" link	The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
#The user is in the Practice page	The user clicks "Find Numbers with Even Number of Digits" link	The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons
#The user is in the Practice page	The user clicks "Squares of a  Sorted Array" link	The user should be redirected to "Question" page contains questions,an tryEditor  to write code with Run and Submit buttons

