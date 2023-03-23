Feature: Graph Page Validation in the Numpy Ninja HomePage

  Scenario: User clicks the Get Started Graph Page
    Given User is  in  Graph Page
    When User clicks Graph in topics covered
    Then User is redirected to Graph page
    And User clicks the Try here button
    Then User enters following code in editor
      | print("This code is for Graph") |
    And clicks Run

  Scenario: Graph Representation page Validation
    Given User is in Graph  HomePage
    When User clicks Graph Representation in topics covered
    Then User clicks the Try here button
    Then User enters following code in editor
      | print("This code is for Graph Representation") |
    And clicks Run
