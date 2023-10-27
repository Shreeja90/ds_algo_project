Feature: DropDown Feature

@Dropdown
  Scenario: TC04 - Open DsAlgo portal
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    And The user should be redirected to homepage
    And User clicks on data structure dropdown
    Then I should see 6 different data structure entries in that dropdown