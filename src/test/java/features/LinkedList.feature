@LinkedList
Feature: Testing Linked List page

Background: User is logged into the DS Algo portal
  Given: User is on Signin page page on DS Algo portal
  When: User enters the valid username as"code_warriors" and password as "ssdet@88"
  And: User click on login button
  Then: User should see "you are logged in" message in the homepage

   
  @tag1
  Scenario: User is able to navigate to the "Linked List" Page
    Given User is in the "Homepage" after login
    When User selects the "Linked List" by clicking "Get Started"
    Then User is redirected to the "Linked List"
    
   @tag1
  Scenario: User is able to navigate to the "Introduction" Page
    Given User is in the "Linked List" after login
    When User clicks on the "Introduction"
    Then User is redirected to the "Introduction" page
      
    @tag1
  Scenario: User is able to navigate to the "Try Here box" in the "Introduction in Linked List" Page
    Given User is in the "Introduction in Linked List" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Introduction in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print'Hello World'"
    And: User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Introduction in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And: User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input"
    
   @tag1
  Scenario: User is able to navigate to the "Creating Linked List" Page
    Given User is in the "Linked List" after login
    When User clicks on the "Creating Linked List"
    Then User is redirected to the "Creating Linked List" page
      
    @tag1
  Scenario: User is able to navigate to the "Try Here box" in the "Creating Linked List in Linked List" Page
    Given User is in the "Creating Linked List in Linked List" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Creating Linked List in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print'Hello World'"
    And: User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Creating Linked List in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And: User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input" 
    
   
     @tag1
  Scenario: User is able to navigate to the "Types of Linked List" Page
    Given User is in the "Linked List" after login
    When User clicks on the "Types of Linked List"
    Then User is redirected to the "Types of Linked List" page
      
    @tag1
  Scenario: User is able to navigate to the "Try Here box" in the "Types of Linked List in Linked List" Page
    Given User is in the "Types of Linked List in Linked List" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Types of Linked List in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print'Hello World'"
    And: User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Types of Linked List in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And: User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input" 
    
    
    
     @tag1
  Scenario: User is able to navigate to the "Implement Linked List in Phyton" Page
    Given User is in the "Linked List" after login
    When User clicks on the "Implement Linked List in Phyton"
    Then User is redirected to the "Types of Linked List" page
      
    @tag1
  Scenario: User is able to navigate to the "Try Here box" in the "Implement Linked List in Phyton in Linked List" Page
    Given User is in the "Implement Linked List in Phyton in Linked List" after login
    When User clicks on the "Try Here box"
    Then User is redirected to the Try editor page with "Run Button" to click
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Implement Linked List in Phyton in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes valid phyton code "print'Hello World'"
    And: User clicks on "Run Button" after entering valid Phyton code
    Then User is able to see a valid output "Hello World"  
    
     @tag1
  Scenario: User is able to write code in the "Try editor box" in the "Types of Linked List in Linked List" page
    Given User is in the "Try editor box" with the "Run Button"
    When User writes invalid phyton code "print "Hello World""
    And: User clicks on "Run Button" after entering invalid Phyton code
    Then User is able to see a "Syntax Error: bad input" 
    

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
