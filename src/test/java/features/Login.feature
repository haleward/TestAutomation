Feature: Login into Application

  Scenario: Positive test validating login
    Given Initialize the browser with chrome
    And Navigate to "http://qaclickacademy.com" Site
    And Click on home link in main page
    And click on login in home page
    When User enters "mirzo.haleward@gmail.com" and "1234567809" and logs in
    Then Verify that user is successfully logged in





