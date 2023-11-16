Feature: Testing stack feature

 Scenario: Stack module scenario 
	
Given The user opens DS Algo portal link
When  The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
  And User enter valid "<username>" and "<password1>"
  And User clicks sign in 
  And User is navigated to inside account page  
    
	And The user clicks the Getting Started button in Stack Pane
	And Clicks Operations in Stack 
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
  
  And Clicks Implemention link
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
  
  And Clicks Application link
	And The user clicks Try Here button and enters the python code
	And Clicks run button, code is printed and then returns to the previous page
	
Then  Clicks Practice Questions Link
	    
   Examples:
| username | password1 |
| Tester_user63 | ds_algo123 |