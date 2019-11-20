Feature: Functional Testing on Test me
Scenario: valid Login

Given User has launched testme app in the browser
When User enters "Lalitha" and "password123"
And click on the login button
Then User must be logged in successfully