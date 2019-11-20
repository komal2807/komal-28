Feature: demo on scenario outline examples

Scenario Outline: login for testmeApp

Given User must be in the login page
When user enters "<username>" and "<password>"
And performs login
Then User must be in home page

Examples:
|username||password|
|abc||abc|
|xyz||xyz|