@smoke
Feature: F02_Login | users could use login functionality to use their accounts
 Scenario Outline: user could login with valid email and password
  Given  user go to l0gin page
    When user login with valid "<email>" and "<password>"
    And user press on login butt0n
    Then  user login to the system successfully
   Examples:
     | email | password|
     |test2@example.com|123456|

  Scenario Outline: user could login with invalid email and password
    Given  user go to login page
    When user login with invalid "<email>" and "<password>"
    And  user press on login button
    Then  user could not login to the system
    Examples:
      | email | password|
      |wrong@gmail.com|123456|