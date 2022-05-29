Feature: Login into Application

 Scenario Outline: Positive test validating login
    Given Open the browser with chrome
    And Go to "http://qaclickacademy.com" Site
    And Click on the home link in main page
    And click on login button in home page
    When The user enters <username> and <password> and logs in
    Then make sure the user is successfully logged in
    And close browsers

    Examples:

   | username                   | password   |
   | mirzo.haleward@gmail.com   | 1234567809 |
   | test99@gmail.com           | 123456     |

