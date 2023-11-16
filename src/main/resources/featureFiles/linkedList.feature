Feature: linked List

	@LinkedList
  Scenario: Checking Linked List pane
  
   Given The user opens DS Algo portal link
   When The user clicks the "Get Started" button
   And The user should be redirected to homepage
   And The user clicks on sign in button
   And User enter valid "<username>" and "<password1>"
   And User clicks sign in 
   And User is navigated to inside account page
   And The user clicks the "Getting Started" button in Linked List pane
   And The user should be directed to "Linked List" Page
#   And Navigate to Introduction of Linked List
   And Click on the Linked List links "<testlink>"
   And Validate the "<testlink>"
   And The user clicks "Try Here" button
   And  The user enters text print "hello" and clicks the run button
   Then hello should be printed

Examples:
| username | password1 | testlink |
| Tester_user63 | ds_algo123 | Introduction |
| Tester_user63 | ds_algo123 | Creating Linked LIst |
| Tester_user63 | ds_algo123 | Types of Linked List |
| Tester_user63 | ds_algo123 | Implement Linked List in Python |
| Tester_user63 | ds_algo123 | Traversal|
| Tester_user63 | ds_algo123 | Insertion |
| Tester_user63 | ds_algo123 | Deletion |

