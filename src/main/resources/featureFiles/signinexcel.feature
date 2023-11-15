@SignIn
Feature: Checking sign in feature

 Scenario: Signing into homepage after registration
  Given The user opens DS Algo portal link
  When The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on log in button
  When User enters data from Excel file with SheetName "<SheetName>" and RowNumber <RowNumber>
  And User clicks log in 
  Then User is navigated to inside account page


Examples:
| SheetName | RowNumber |
| Login | 0 |



   
