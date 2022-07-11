Feature: User login to Demo Midtrans site when email address and password entered are incorrect

  Scenario: User cannot login
    Given Open the chrome and launch Demo Midtrans site successfully
    When User input email address and password with entered are incorrect
    Then User not successfully login