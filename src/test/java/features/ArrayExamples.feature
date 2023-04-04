@arrayex
Feature: Validating Practice questions in Array Page
Background: User signin to DS-PORTAL and in Array Page
 Given User is logged in and registered user
 When User selects Array and navigates to array home page
 Then User clicks Array in python link
 And user clicks Practice Questions 
 Then User navigates to Practice questions Page


 @arrayex1
 Scenario: User is able to navigate to Search the array Page
    When User clicks on the Search the array and redirected to the Search the array page
    Then  User clicks on the Try Here box in Search the array and redirected
     When User enters following code in  array examples editor
      | print("Hello this is array examples") |
    And User clicks on Run in array examples
    Then User is able to see output "true"
   
      
 
     @arrayex2
 Scenario: User is able to navigate to Max Consecutive ones Page
    When User clicks on the Max Consecutive ones and redirected 
    Then  User clicks on the Try Here box in Max Consecutive ones and redirected
     When User enters following code in  array examples editor
      | print("Hello this is array examples") |
    And User clicks on Run in array examples
    Then User is able to see output "true"
    
     
      @arrayex3
 Scenario: User is able to navigate to Find numbers with even number of digits ones Page
    When User clicks on the Find numbers with even number of digits ones and redirected 
    Then  User clicks on the Try Here box in Find numbers with even number of digits ones and redirected
     When User enters following code in  array examples editor
      | print("Hello this is array examples") |
    And User clicks on Run in array examples
    Then User is able to see output "true"
    
   
     @arrayex4
 Scenario: User is able to navigate to Squares of Sorted Array Page
    When User clicks on the Squares of Sorted Array and redirected 
    Then  User clicks on the Try Here box in Squares of Sorted Array and redirected
     When User enters following code in  array examples editor
      | print("Hello this is array examples") |
    And User clicks on Run in array examples
    Then User is able to see output "true"
   
    @array5
  Scenario: User is able to write invalid code in the Squares of Sorted Array Try editor box 
    When User clicks on the Squares of Sorted Array and redirected 
    Then  User clicks on the Try Here box in Squares of Sorted Array and redirected
     When User enters "test data"
    And User clicks on Run in array examples
    Then User is able to see output "false"
  
   