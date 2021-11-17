Feature: Checking Login functionality

Scenario: checking login functionality with valid credentials

Given User is on Login page
Then user enter username in username textfield
Then user enter password in Password textfield
Then user clicks on Login button
Then User is on Home Page