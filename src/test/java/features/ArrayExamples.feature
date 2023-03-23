@arrayex
Feature: Validating Practice questions in Array Page
Background: User signin to DS-PORTAL and in Array Page
 Given User is logged in and registered user
 When User is in Homepage of Ds_ALgo
 Then User selects Array Homepage
 And User navigates to Array Home page
 Then User clicks Array in python link
 And user clicks Practice Questions 
 Then User navigates to Practice questions Page
 
 @arrayex1
 Scenario: User is able to navigate to Search the array Page
    When User clicks on the Search the array
    Then User is redirected to the Search the array page
    
    @arrayex2
  Scenario: User is able to navigate to the Try Here Editor page in Search the array page
    When User clicks on the Try Here box in Search the array
    Then User is redirected to the Try editor page of Search the array
      
   @arrayex3
  Scenario: User is able to write valid code in the Search the array Try editor box 
    Given User is in the Try editor page of Search the array
    When User enters following code in search array editor
      | print("Hello this is Search the array") |
    And User clicks on Run in search array
    Then User is able to see a valid output Hello this is Search the array
    
     @arrayex4
 Scenario: User is able to navigate to Max Consecutive ones Page
    When User clicks on the Max Consecutive ones
    Then User is redirected to the Max Consecutive ones page
    
    @arrayex5
  Scenario: User is able to navigate to the Try Here Editor page in Max Consecutive ones page
    When User clicks on the Try Here box in Max Consecutive ones
    Then User is redirected to the Try editor page of Max Consecutive ones
      
   @arrayex6
  Scenario: User is able to write valid code in the Max Consecutive ones Try editor box 
    Given User is in the Try editor page of Max Consecutive ones
    When User enters following code in max consec editor
      | print("Hello this is Max Consecutive ones") |
    And User clicks on Run in max consecutive ones page
    Then User is able to see a valid output Hello this is Max Consecutive ones
    
      @arrayex7
 Scenario: User is able to navigate to Find numbers with even number of digits ones Page
    When User clicks on the Find numbers with even number of digits
    Then User is redirected to the Find numbers with even number of digits page
    
    @arrayex8
  Scenario: User is able to navigate to the Try Here Editor page in Find numbers with even number of digits page
    When User clicks on the Try Here box in Find numbers with even number of digits
    Then User is redirected to the Try editor page of Find numbers with even number of digits
      
   @arrayex9
  Scenario: User is able to write valid code in the Find numbers with even number of digits Try editor box 
    Given User is in the Try editor page of Find numbers with even number of digits
    When User enters following code in even numbers editor
      | print("Hello this is Find numbers with even number of digits") |
    And User clicks on Run Find numbers with even number of digits
    Then User is able to see a valid output Hello this is Find numbers with even number of digits
    
     @arrayex10
 Scenario: User is able to navigate to Squares of Sorted Array Page
    When User clicks on the Squares of Sorted Array
    Then User is redirected to the Squares of Sorted Array page
    
    @arrayex11
  Scenario: User is able to navigate to the Try Here Editor page in Squares of Sorted Array page
    When User clicks on the Try Here box in Squares of Sorted Array
    Then User is redirected to the Try editor page of Squares of Sorted Array
      
   @arrayex12
  Scenario: User is able to write valid code in the Squares of Sorted Array Try editor box 
    Given User is in the Try editor page of Squares of Sorted Array
    When User enters following code in sorted editor
      | print("Hello this isSquares of Sorted Array") |
    And User clicks on Run Squares of Sorted Array
    Then User is able to see a valid output Hello this is Squares of Sorted Array
    
    @array13
  Scenario: User is able to write invalid code in the Squares of Sorted Array Try editor box 
    When User enters following code in sorted array editor as "hello is invalid code for Squares of Sorted Array"
    And User clicks on Run in  Sorted Array
    Then User is able to see an invalid error
    
   