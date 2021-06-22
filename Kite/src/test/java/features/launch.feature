#Author: bilalroshan5@gmail.com
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
Feature: Finology Home Page

  @tag1
  Scenario Outline: Launch Finology
    Given Launch Finology Home Page
    #And  Enter <stock> in serach 
    #When Validate ITC data
    #And Scroll to cashflow statement
    #And copy cash flow data
    #Then return back to home
    Examples: 
      | stock |
      | ITC |   

  