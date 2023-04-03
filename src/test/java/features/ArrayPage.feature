
@array
Feature: validating Array page

Background: User signin into the DS Algo portal
   When  user is a registered user
   Then User is in homepage
  And User selects the Array by clicking Get Started
  Then User is in the Array Page
    
  
  @array1
  Scenario: User is able to navigate to Array in Python Page
    Given User is in array page
    When User clicks on the Array in Python and redirected to the Array in Python page
    Then User clicks on the Try Here box in Array in Python page and redirected to the Try editor page 
    When User enters following code in python editor
      | print("Hello this is Array in python") |
    And User clicks on Run in Array in Python page 
    Then User is able to see a valid output "true"
    
            
   @array2
    Scenario: User is able to navigate to Array Using List Page
    Given User is in array page 
    When User clicks on the Array Using List and redirected to the Array Using List page
    Then User clicks on the Try Here box in Array Using List page and redirected to the Try editor page
   	When User enters following code  in  List editor
      | print("Hello this is Array Using List") |
    And User clicks on Run in Array Using List page
    Then User is able to see a valid output "true"
  
   
   @array3
  Scenario: User is able to navigate to Basic Operations in List Page
     Given User is in array page
    When User clicks on the Basic Operations in List and redirected to List page
    Then User clicks on the Try Here box and redirected to the Try editor page Basic Operations in List Page
    When User enters following code in text editor
      | print("Hello this is Basic Operations in List") |
    And User clicks on Run in Basic Operations in List Page
    Then User is able to see a valid output "true"
  
        
  @array4
  Scenario: User is able to navigate to Applications of Array Page
    Given User is in array page
    When User clicks on the Applications of Array,redirected to the Applications of Array page
    Then User clicks on the Try Here box,redirected to Applications of Array Page
    When User enters following code in applications editor
      | print("Hello this is Applications of Array") |
    And User clicks on Run in Applications of Array Page
    Then User is able to see a valid output "true"
  
        
    @array5
  Scenario: User is able to navigate to Applications of Array Page
    Given User is in array page
    When User clicks on the Applications of Array,redirected to the Applications of Array page
    Then User clicks on the Try Here box,redirected to Applications of Array Page
    When User enters in array pge "test data"
    And User clicks on Run in Applications of Array Page
    Then User is able to see a valid output "false"
  
   
    
    
    
