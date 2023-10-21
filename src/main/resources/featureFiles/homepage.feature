Feature: Ds_Algo

  Scenario: Checking Get Started link
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    And Validate the user is on Home page
    And The user clicks on the dropdown button
    Then Validate the dropdown values
