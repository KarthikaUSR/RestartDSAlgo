
@Home
Feature: Home page with login feature
 
  @login
  Scenario Outline: Home page without login
  Given Enter DS Algo Home portal
  When Click <Names> Get Started buttons
  Then "You are not logged in" message displayed
  Examples: 
      |Names                       |
      |Data Structures-Introduction|          
      |Array|
      |Graph|
  @login
  Scenario Outline: Home page with login
 Given Enter DS Algo Home portal
  When Click Signin link
  And Enter user name as "karthika" 
  And Enter password as "Numpy@12345"
  And Click Login button
  When Click <Names> Get Started buttons
  Then <Names> page should open
  Examples: 
      |Names                       |
      |Data Structures-Introduction|          
      |Array|
      |Graph|

 