
@array

Feature: Array page validations

  Scenario Outline: User is able to login to DSAlgo Portal and perform validations on Array page
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    And The user should be redirected to homepage
    And The user clicks on sign in button
    When User enters data from Excel file with SheetName "<SheetName>" and RowNumber <RowNumber>
    And User clicks sign in
    Then User is navigated to inside account page
    When user clicks "Get Started" button under Array
    Then user is redirected to the Array page
    When user clicks the link "Arrays in Python"
    Then user is navigated to "Arrays in Python" page
    Then user scrolls down and clicks "Try Here" button and enters "Hello World" and click "Run" button and user input is displayed in the console
    When user navigates back and scrolls up the page and clicks "Arrays Using List" link
    Then user will be redirected to "Arrays Using List" page
    Then user scrolls down and clicks "Try Here" button and enters "Hello World" and click "Run" button and user input is displayed in the console
    When user navigates back and clicks "Basic Operations in Lists" link
    Then user moves to "Basic Operations in Lists" page
    Then user scrolls down and clicks "Try Here" button and enters "Hello World" and click "Run" button and user input is displayed in the console
    When user navigates back clicks "Applications of Array" link
    Then user gets redirected to "Applications of Array" page
    Then user scrolls down and clicks "Try Here" button and enters "Hello World" and click "Run" button and user input is displayed in the console
    And user navigates back and clicks "Practice Questions" link
    Then user is navigated to the practice links list page
    Then user clicks "Search the array" link
    And performs textbox input validations
    Then user navigates back and clicks "Max Consecutive ones" link
    And performs textbox input validations
    Then user clicks back and hits "Find Numbers with even number of digits" link
    And performs textbox input validations
    Then user goes back and clicks "Squares of a sorted Array" link
    And performs textbox input validations

    Examples: 
      | SheetName | RowNumber |
      | Login     |         0 |
