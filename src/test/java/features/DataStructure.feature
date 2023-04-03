
@DataStructures
Feature: validating Data Structure page

  Background: 
    Given User is logged into the DS Algo portal
    When User sign in into DS_Portal
    Then User selects DataStructure by clicking Get started
    And User is in DataStructure HomePage

  @ds1
  Scenario: User is able to navigate to the Time Complexity Page
    Given User is in the DataStructure page
    When User clicks on the Time complexity, User is redirected to the Time complexity page
    Then User clicks on the Try Here box and redirected to the Try editor page
    When User enters following code in ds editor
      | print("Hello this is datastructure in python") |
    And User clicks on Run in dspage
    Then User is able to see a output "true"

  @ds2
  Scenario: User is able to navigate to the Time Complexity Page
    Given User is in the DataStructure page
    When User clicks on the Time complexity, User is redirected to the Time complexity page
    Then User clicks on the Try Here box and redirected to the Try editor page
    When User enter "test code"
    And User clicks on Run in dspage
    Then User is able to see a output "false"
