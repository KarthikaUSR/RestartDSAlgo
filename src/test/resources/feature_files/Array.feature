@Array_page
Feature: Array page and links
  Background:
    Given Enter DS Algo Home portal
    And   Do Login 
    |username_a |password_a |
    |karthika   |Numpy@12345|    
    When Click on Getstarted button on 'Array' widget      
    Then "Array" page should be open
   
   @Arrays_page_links
  Scenario Outline: 'Arrays' links in Topics Covered section for Arrays page.

         
    When Click <Name> array links 
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
    
    Examples: 
      | Name                      | Python Code  | Result|
      | Arrays in Python          |print "hello" | hello |
      | Arrays Using List         |print "karthi"| karthi|
      |Basic Operations in Lists  |print "hello" | hello |
      |Applications of Array      |print "karthi"| karthi|
   
 

  @Array_Page_Practice_Questions_nonpythoncode
  Scenario Outline: Practice Questions_Nonpythoncode
    When  Click on 'Arrays in Python' link
    Then 'Arrays in Python' page should be open
    When Click on 'Practice Question' link in Array      
    Then 'Practice Questions' page should be open
    When click <PQ_Name> practical questions link
    Then 'Assessment' page should be open
    When Clear Editor Box
    And  Type Javacode "System.out.print(1+2);"  
    And  click run button
    Then Alert should displayed with ok button
    When Click Submit button  
    Then "Error occurred during submission" message displayed in console
    When Clear Editor Box
    And  Click Run and Submit button 
    Then "Error occurred during submission" message displayed in console

     Examples: 
     |PQ_Name|   
     |Search the array|
     |Max Consecutive Ones|
     |Find Numbers with Even Number of Digits|
     |Squares of  a Sorted Array|
     
   @Array_Page_Practice_Questions_Validandinvalid_Pythoncode
    Scenario Outline: Practice Questions_Nonpythoncode
    When  Click on 'Arrays in Python' link
    Then 'Arrays in Python' page should be open
    When Click on 'Practice Question' link in Array      
    Then 'Practice Questions' page should be open
    When click <PQ_Name> practical questions link
    Then 'Assessment' page should be open
    When Clear Editor Box
    And  Type valid code for question in editor box <Sheet_Name>    
    And  Click Run and Submit button       
    Then "Submission Successful" message displayed in console
    When Clear Editor Box
    And  Type invalid code for question in editor box <Sheet_Name>        
    And  Click Run and Submit button   
    Then " Some Tests failed. Please review code" message displayed in console

     Examples: 
     |PQ_Name                                |Sheet_Name|    
     |Search the array                       |Searchthearray|
     |Max Consecutive Ones                   |MaxConsecutiveOnes|
     |Find Numbers with Even Number of Digits|FindNumbersEvenNumberDigits|
     |Squares of  a Sorted Array             |SquaresSortedArray|
     
      
     
    
     

     
 
      
