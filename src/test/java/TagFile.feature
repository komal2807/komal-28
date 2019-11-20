Feature: demo on use of tags in cucumber
@First
Scenario: Regression Testing
Given User is testing for the login functionality
Then User able to login successfully

@second
Scenario: System Testing
Given User is testing the search functionality
Then search works successfully

@Demo
Scenario: display the name of the tester
Then "Lekha" is tester on Testme App