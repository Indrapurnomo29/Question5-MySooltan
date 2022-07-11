Feature: User not successfully buy pillow in Demo Midtrans site

  Scenario: User not successfully buy pillow when the credentials entered are incorrect
    Given User open chrome and launch Demo Midtrans site to buy pillow
    When The credential entered are incorrect to buy pillow in Demo Midtrans site
    Then User not successfully buy pillow