Feature: User buy pillow with valid data in Danamon Online Banking payment method

  Scenario: User can buy pillow with Danamon Online Banking payment method
    Given User open chrome and system redirect to Demo Midtrans site
    When User input valid data to buy pillow with Danamon Online Banking payment method
    Then User successfully buy pillow with Danamon Online Banking payment method