Feature: Register Page Validation
  
  Scenario Outline:  Register Page Functionality
  Given User clicks on Get Started
  When  User should see Register button in home page and clicks Register
  Then  User should navigate to Register Page
  When User enters '<username>' '<Password >' '<confirm _password>'
  Then User clicks on Register button
  Then User should see' <status _message>'
  
  Examples:
  |username|Password|confirm_password| status message                                 |
  |ninjas  |nin123  |nin123          | New account created.You are logged in as ninjas|
  |code-ninjas|sdet@123|sdet@123     | New account created.You are logged in as ninjas|
