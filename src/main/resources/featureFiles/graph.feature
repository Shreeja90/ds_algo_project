Feature: graph

	@Graph
  Scenario: Checking Graph pane
  
   Given The user opens DS Algo portal link
   When The user clicks the "Get Started" button
   And The user should be redirected to homepage
   And The user clicks on sign in button
   And User enter valid "<username>" and "<password1>"
   And User clicks sign in 
   And User is navigated to inside account page
   And The user clicks the "Getting Started" button in Graph pane
   And The user should be directed to "Graph" Page
#   And Navigate to Introduction of Graph
   And Click on the Graph links "<testlink>"
   And Validate the "<testlink>"
   And The user clicks "Try Here" button
   And  The user enters text print "hello" and clicks the run button
   Then hello should be printed

Examples:
| username | password1 | testlink |
| Tester_user63 | ds_algo123 | Graph |
| Tester_user63 | ds_algo123 | Graph Representations |

