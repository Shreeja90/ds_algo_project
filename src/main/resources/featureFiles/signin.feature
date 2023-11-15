@SignIn
Feature: Checking sign in feature

 Scenario: Signing into homepage after registration
  Given The user opens DS Algo portal link
  When The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
  And User enter valid "<username>" and "<password1>"
  And User clicks sign in 
  Then User is navigated to inside account page



Examples:
| username | password1 |
| Tester_user63 | ds_algo123 |