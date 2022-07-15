Feature: Google search feature

  Scenario: Google search title verification
    When User is on Google search page
    And User searches for wooden spoon
    Then User should see wooden spoon in title