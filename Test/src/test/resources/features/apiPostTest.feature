Feature: apiPostTest

  Scenario: User should add Posts

    When User does POST response
    Then User has add list of posts