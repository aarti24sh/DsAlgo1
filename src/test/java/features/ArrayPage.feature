
@array
Feature: validating Array page

Background: User signin into the DS Algo portal
   When  user is a registered user
   Then User is in homepage
  
  @array1
Scenario: User is able to navigate to the Array Page
    Given User is in the Homepage after login
    When User selects the Array by clicking Get Started
    Then User is redirected to the Array Page
    
 @array2
  Scenario: User is able to navigate to Array in Python Page
    Given User is in the Array page after login
    When User clicks on the Array in Python
    Then User is redirected to the Array in Python page
    
    @array3
  Scenario: User is able to navigate to the Try Here Editor page in Array in Python page
    Given User is in the Array in Python after login
    When User clicks on the Try Here box in Array in Python page
    Then User is redirected to the Try editor page in Array in Python page
      
   @array4
  Scenario: User is able to write valid code in the Array in python Try editor box 
    Given User is in the Try editor page
    When User enters following code in python editor
      | print("Hello this is Array in python") |
    And User clicks on Runin Array in Python page 
    Then User is able to see a valid output Hello this is Array in python  
   
   @array5
  Scenario: User is able to navigate to Array Using List Page
    Given User is in the Array page after login
    When User clicks on the Array Using List
    Then User is redirected to the Array Using List page
    
  
  @array6
  Scenario: User is able to navigate to the Try Here Editor page in Array Using List page
    Given User is in the Array Using List after login
    When User clicks on the Try Here box in Array Using List page
    Then User is redirected to the Try editor page Array Using List page
      
   @array7
  Scenario: User is able to write valid code in the Array Using List Try editor box 
    Given User is in the Try editor page 
    When User enters following code  in  List editor
      | print("Hello this is Array Using List") |
    And User clicks on Run in Array Using List page
    Then User is able to see a valid output Hello this is Array Using List 
   
  
   @array8
  Scenario: User is able to navigate to Basic Operations in List Page
    Given User is in the Array page after login
    When User clicks on the Basic Operations in List
    Then User is redirected to the Basic Operations in List page
    
  
  @array9
  Scenario: User is able to navigate to the Try Here Editor page in Basic Operations in List page
    Given User is in the Basic Operations in List after login
    When User clicks on the Try Here box in Basic Operations in List Page
    Then User is redirected to the Try editor page Basic Operations in List Page
      
   @array10
  Scenario: User is able to write valid code in the Basic Operations in List Try editor box 
    Given User is in the Try editor page
    When User enters following code in text editor
      | print("Hello this is Basic Operations in List") |
    And User clicks on Run in Basic Operations in List Page
    Then User is able to see a valid output Hello this is Basic Operations in List 
   
  @array11
  Scenario: User is able to navigate to Applications of Array Page
    Given User is in the Array page after login
    When User clicks on the Applications of Array
    Then User is redirected to the Applications of Array page
    
  
  @array12
  Scenario: User is able to navigate to the Try Here Editor page in Applications of Arrayt page
    Given User is in the Applications of Array after login
    When User clicks on the Try Here box in Applications of Array Page
    Then User is redirected to the Try editor page in Applications of Array Page
      
   @array13
  Scenario: User is able to write valid code in the Applications of Array Try editor box 
    When User enters following code in applications editor
      | print("Hello this is Applications of Array") |
    And User clicks on Run in Applications of Array Page
    Then User is able to see a valid output in editor
  
   
  
   @array14
  Scenario: User is able to write invalid code in the Applications of Array Try editor box 
    Given User is in the Try applications array editor page
    When User enters following code in app array editor as "hello is invalid code for Applications of Array"
    And User clicks on Run in Applications of Array
    Then User is able to see an error
    
    
    
