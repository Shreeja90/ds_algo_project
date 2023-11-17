
@Test
Feature: Registration feature
  
Scenario: To check registration feature
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    And The user should be redirected to homepage
    And The user clicks "Register"
    And user enters valid "<username>" and "<password1>" and "<password2>"
    And user clicks register button in registration page
    Then The user should be redirected to homepage with success message

Examples:
| username | password1 | password2 |
| Tester_user117 | dsalgo123 | dsalgo123 |
    
 

  