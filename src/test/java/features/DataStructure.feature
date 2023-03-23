
@DataStructures
Feature: validating Data Structure page
Background: User is logged into the DS Algo portal
  When  User signed into DS_Portal 
    Then User stays in the homepage
  
  @ds1
Scenario: User is able to navigate to the Data Structure Page
    When User selects the Datastructure by clicking Get Started
    Then User is redirected to the Data Structure Page
    
 @ds2
  Scenario: User is able to navigate to the Time Complexity Page
    Given User is in the DataStructure page after login
    When User clicks on the Time complexity
    Then User is redirected to the Time complexity page

@ds3
  Scenario: User is able to navigate to the Try Here Editor page in Time complexity page
    Given User is in the Time complexity after login
    When User clicks on the Try Here box in  Time complexity
    Then User is redirected to the Try editor page of  Time complexity
      
   @ds4
  Scenario: User is able to write valid code in the  Time complexity Try editor box 
   When User enters following code in  Time complexity editor
      | print("Hello this is time complexity of datastructures") |
    And User clicks on Run in Time complexity
    Then User is able to see a valid output Hello this is time complexity of datastructures  
    
     @ds5
  Scenario: User is able to write invalid code in the  Time complexity Try editor box 
    When User enters following code in  Time complexity editor as "hello is invalid code for ds"
    And User clicks on Run in Time complexity
    Then User is able to see a Syntax Error 