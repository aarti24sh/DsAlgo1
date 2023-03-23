@SignIn
Feature: Validating Sign-in

  Scenario Outline: sign in dsalgo portal after entering into home page
    Given User clicks Get Started
    When User clicks on sign in button
    Then User should see login username and password fields
    When User enters "<username>" and "<password>"
    Then User is logged in
    

    Examples: 
      | username   | password      |
      | code-ninja | sdet@123      |
      
     
     