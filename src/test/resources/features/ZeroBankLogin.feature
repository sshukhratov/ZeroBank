@ZeroBank
Feature: Zero Bank login verifications

  Background: Authorized user logs into Zero Bank website
    Given user on the login page
    And user enters valid username and password

    @test1
    Scenario: Login title verification
      When user looks at the title of page
      Then user should see "Zero - Log in" as title