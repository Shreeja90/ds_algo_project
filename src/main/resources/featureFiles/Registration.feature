Feature: User is able to register successfully on DS Algo website
Scenario Outline: New user registration is successful
Given The user opens DS Algo portal link
When The user clicks the get started button
Then The user should be redirected to homepage
When User clicks on Register button
When user enters valid "<username>" and "<password1>" and "<password2>"
When user clicks register button in registration page
Then user is logged into the account
Then user clicks sign out button



Examples:
| username | password1 | password2 |
| Tester_user88 | ds_algo123 | ds_algo123 |
