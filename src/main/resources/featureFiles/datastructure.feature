Feature: Data Structures page validations

  Scenario Outline: User is able to login to DSAlgo Portal and perform validations on data structures page
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    And The user should be redirected to homepage
    And The user clicks on sign in button
    When User enters data from Excel file with SheetName "<SheetName>" and RowNumber <RowNumber>
    And User clicks sign in
    Then User is navigated to inside account page
    When user clicks "Get Started" button under data structures tab
    And user scrolls down the page
    And user clicks the "Time complexity" link
    Then user is redirected to the practice questions page
    And user clicks the "Practice Questions" link
    Then user navigates back to the time complexity page
    Then user scrolls down and clicks "Try Here" button and enters "Hello World" and click "Run" button and user input is displayed in the console

    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |
      
