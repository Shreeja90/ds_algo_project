Feature: Registered user is able to login successfully to the DS Algo website with Valid Credentials
Scenario Outline: Registered user login is successful with the account created
Given User is on DSAlgo Portal sign in page
When User enter valid "<username>" and "<password1>"
When User clicks sign in
Then User is navigated to inside account page



Examples:
| username | password1 |
|Tester_user63 | ds_algo123 |