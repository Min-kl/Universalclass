Feature: SignUp Universal Class Website

Background: 
     Given user navigates to website
 
Scenario Outline: valid details for Registration
    When user clicks on Subscribe
    And select desired course
    And user enters <FirstName>
    And enters <LastName>
    And enters <Email> and <Password>
    And check the checkbox
    And clicks on SignUp
    Then successful SignUp is done
    
 Examples: 
      | FirstName  | LastName   | Email                 |  Password  |
      | Anshula    | Tripathi   | anshula2197@gmail.com |  9039887576|

Scenario: Invalid details for Registration
    When user clicks on Subscribe
    And select desired course
    And user enter invalid details
    And clicks on SignUp button
    Then user is not able to SignUpg


                
Scenario: Successful Sign In
    When user clicks on Sign In
    And enter correct Email and Password
    And clicks on Sign In
    Then successful Sign In is done
     
Scenario: Unsuccessful Sign In
    When user clicks on Sign In button
    And enter invalid Email and Password
    And clicks on Sign In button
    Then user is not able to Sign In
  
Scenario: Password activation sent to mail
    Given User should be on home page
    When User open sign in function
    And Selects the forgot password
    Then Forgot passsword page opens
    When User enter valid email
    And Click on reset password button
    Then Mail for reset password is received
    
Scenario: Password activation is not received
    Given User should be on home page
    When User open sign in function
    And Selects the forgot password
    Then Forgot passsword page opens
    When User enter invalid email
    And Click on reset password button
    Then Error message should be displayed for it

Scenario: search the course on home page
    When user enter course in search box
    Then user can see the related course
    
Scenario: search the course by browse course
     When user enter course in search box by after clicking browse course
     Then user can see the available course
          
Scenario: search the course for invalid data
      When user enter random data or unavailable course
      Then user can not see the courses
    