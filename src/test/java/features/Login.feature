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

     
Feature: Application Login
    
#Background:
#Given validate the browser
#When browser is launched
#Then hit the url

# using parameter
@SanityTest @SmokeTest
Scenario: Home Page deafult login
Given User is on Home Page
When User provides search text "cat"
And Clicks on Enter
Then Search result is displayed

# using parameter
@SanityTest
Scenario: Home Page deafult login
Given User is on Home Page
When User provides search text "dog"
And Clicks on Enter
Then Search result is displayed

# Using data table
@RegTest
Scenario: Home Page deafult login
Given User is on Home Page
When User provides the details
|cat| dog | human |
And Clicks on Enter
Then Search result is displayed

# Using Example keyword
@Jenkins
Scenario Outline: Home Page deafult login
Given User is on Home Page
When User provides the <Search1> and <Search2>
And Clicks on Enter
Then Search result is displayed

Examples:
|Search1|Search2|
|cat    |dog    |
|mouse  |human  |