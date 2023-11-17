Feature: Login Feature

  Scenario: 
  Given The user opens DS Algo portal link
  When The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
   When user log in with valid credentials from "<filename>" and "<row>"
   Then user click login button
   Then user should be logged in successfully
   
   
   
   Examples:
   | filename | row |
   | Login.txt | 1 |
   | Login.txt | 2 |
   