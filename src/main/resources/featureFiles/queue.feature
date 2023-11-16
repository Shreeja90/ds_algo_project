Feature: Testing queue feature

 Scenario: Queue module scenario 
	
Given The user opens DS Algo portal link
When  The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
  And User enter valid "<username>" and "<password1>"
  And User clicks sign in 
  And User is navigated to inside account page  
    
	And The user clicks the Getting Started button of Queue module
	And Clicks Implementation of Queue in Python
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
  
  And Clicks Implemention using collections.dequeue link
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
  
  And Clicks Implementation using array link
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
	
	And Clicks Queue Operations
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
	
Then  Clicks Practice Questions Link
    
   Examples:
| username | password1 |
| Tester_user63 | ds_algo123 |