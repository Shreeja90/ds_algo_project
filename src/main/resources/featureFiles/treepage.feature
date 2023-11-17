Feature: Tree Page

 @TreePage1
  
 Scenario Outline: Checking the Tree Page
  
  
  Given The user opens DS Algo portal link
  When The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
  And User enter valid credentials
  | username | password |
	| Tester_user63 | ds_algo123 | 
  And User clicks sign in 
  Then User is navigated to inside account page
  Given The user clicks the "Getting Started" button in Tree Pane
   And The user should be directed to "Tree" Page
   And Click on the links and Validate the links
 | testlink |
 | Overview of Trees |
 | Terminologies |
 | Types of Trees |
 | Tree Traversals |
 | Traversals-Illustration |
 | Binary Trees |
 | Types of Binary Trees |
 | Implementation in Python |
 | Binary Tree Traversals |
 | Implementation of Binary Trees |
 | Applications of Binary trees |
 | Binary Search Trees |
 | Implementation Of BST |

@TreePage
  
  Scenario: Checking Tree Pane
  
   Given The user opens DS Algo portal link
   When The user clicks the "Get Started" button
   And The user should be redirected to homepage
   And The user clicks on sign in button
   And User enter valid "<username>" and "<password1>"
   And User clicks sign in 
   And User is navigated to inside account page
   And The user clicks the "Getting Started" button in Tree Pane 
   And The user should be directed to "Tree" Page
   And Navigate to Overview of Trees
   And Click on the Tree links "<testlink>"
   And Validate the "<testlink>"
   And The user clicks "Try Here" button
   And  The user enters text print "hello" and clicks the run button
   Then hello should be printed

Examples:
| username | password1 | testlink |
| Tester_user63 | ds_algo123 | Overview of Trees |
| Tester_user63 | ds_algo123 | Terminologies |
| Tester_user63 | ds_algo123 | Types of Trees |
| Tester_user63 | ds_algo123 | Tree Traversals |
| Tester_user63 | ds_algo123 | Traversals-Illustration |
| Tester_user63 | ds_algo123 | Binary Trees |
| Tester_user63 | ds_algo123 | Types of Binary Trees |
| Tester_user63 | ds_algo123 | Implementation in Python |
| Tester_user63 | ds_algo123 | Binary Tree Traversals |
| Tester_user63 | ds_algo123 | Implementation of Binary Trees |
| Tester_user63 | ds_algo123  | Applications of Binary trees |
| Tester_user63 | ds_algo123  | Binary Search Trees |
| Tester_user63 | ds_algo123  | Implementation Of BST |



@Practice

Scenario Outline: Checking Practice Questions

 Given The user opens DS Algo portal link
  And The user clicks the "Get Started" button
  And The user should be redirected to homepage
  And The user clicks on sign in button
  And User enter valid "<username>" and "<password1>"
  And User clicks sign in 
  And User is navigated to inside account page
  And The user clicks the "Getting Started" button in Tree Pane
  And The user should be directed to "Tree" Page
  And  Navigate to Overview of Trees
  When User Clicks on Practice Questions
  Then User is navigated to Practice Questions Page
   
Examples:
| username | password1 |
| Tester_user63 | ds_algo123 |

 