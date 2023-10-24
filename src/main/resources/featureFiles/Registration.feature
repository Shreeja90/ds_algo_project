Feature: User is able to register successfully on DS Algo website
Scenario Outline: New user registration is successful
Given User is on DSAlgo Registration page
When User clicks on Register button
When user enters valid "<username>" and "<password1>" and "<password2>"
When user clicks register button in registration page
Then user is logged into the account
Then user clicks sign out button



Examples:
| username | password1 | password2 |
| Tester_user65 | ds_algo123 | ds_algo123 |