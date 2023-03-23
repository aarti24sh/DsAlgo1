@Stack
Feature: User tests the slack on DS Algo application
  
  Background: User is logged into the DS Algo portal
  Given: User is on Signin page page on DS Algo portal
  When: User enters the valid username as"code_warriors" and password as "ssdet@88"
  And: User click on login button
  Then: User should see "you are logged in" message in the homepage
 
 
  @tag1
  Scenario: User is able to navigate to the "Stack" Page
    Given User is in the "Homepage" after login
    When User selects the "Stack" by clicking "Get Started"
    Then User is redirected to the "Stack Page"
    
 @tag2
  Scenario: User is able to navigate to the "Operations in Stack" Page
    Given User is in the "Stack page" after login
    When User clicks on the "Operations in Stack"
    Then User is redirected to the "Operations in Stack" page
    
    @tag3
  Scenario: User is able to navigate to the "Try Here box" in the "Operations in Stack" Page
    Given User is in the "Operations in Stack" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
      
   @tag4
  Scenario: User is able to write code in the "Try editor box" in the "Operations in Stack" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print'Hello World'"
    And User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag5
  Scenario: User is able to write code in the "Try editor box" in the "Operations in Stack" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input"
    
    @tag6
  Scenario: User is able to navigate to the "Implementation" Page
    Given User is in the "Stack page" after login
    When User clicks on the "Implementation"
    Then User is redirected to the "Implementation" page
    
    @tag7
  Scenario: User is able to navigate to the "Try Here box" in the "Implementation" Page
    Given User is in the "Implementation in Stack" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
    
      @tag8
  Scenario: User is able to write code in the "Try editor box" in the "Implementation" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print 'Hello World'"
    And User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag9
  Scenario: User is able to write code in the "Try editor box" in the "Implementation" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input"
    
     @tag10
  Scenario: User is able to navigate to the "Applications" Page
    Given User is in the "Stack page" after login
    When User clicks on the "Applications"
    Then User is redirected to the "Applications" page
  
   @tag11
  Scenario: User is able to navigate to the "Try Here box" in the "Applications" Page
    Given User is in the "Applications in Stack" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click  
    
    
      @tag12
  Scenario: User is able to write code in the "Try editor box" in the "Applications" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print 'Hello World'"
    And User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag13
  Scenario: User is able to write code in the "Try editor box" in the "Applications" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input"
    
    @tag14
  Scenario: User is able to navigate to the "Practice Questions" Page
    Given User is in the "Stack page" after login
    When User clicks on the "Practice Questions"
    Then User is redirected to the "Practice Questions" page 
    
    
    
  
