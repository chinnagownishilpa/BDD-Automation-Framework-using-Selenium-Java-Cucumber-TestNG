Feature: Checkout functionality

  Scenario: Successful checkout
    Given user is logged in
    When user completes checkout
    Then checkout should be successful
