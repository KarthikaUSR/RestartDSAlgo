@Graph_page
Feature: Array page and links
  Background:
    Given Enter DS Algo Home portal
    And   Do Login 
    |username_a |password_a |
    |karthika   |Numpy@12345|    
    When Click on Getstarted button on 'Graph' widget      
    Then "Graph" page should be open
    
     @Arrays_page_links
  Scenario Outline: 'Graph' links in Topics Covered section for Arrays page.

         
    When Click <Name> graph links 
    Then <Name> page should open
    When Click 'Try here>>>' button
    Then "Assessment" page should be open
    When Type Sample <Python Code> and click run button
    Then <Result> should displayed
    When Clear Editor Box
    And  Type Javacode "System.out.print(1+2);"
    And  click run button
    Then Alert should displayed with ok button
    When click browser right arrow to go back
    Then <Name> page should open
    When Click on 'Practice Question' link in graph      
    Then 'Practice Questions' page should be open
    When click browser right arrow to go back
    Then <Name> page should open
    
    
    Examples: 
      | Name                | Python Code  | Result|
      | Graph               |print "hello" | hello |
      |Graph Representations|print "karthi"| karthi|
      
   