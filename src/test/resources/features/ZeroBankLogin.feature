@ZeroBank
Feature: Zero Bank login verifications

  Background: Authorized user logs into Zero Bank website
    Given user on the login page

    @test1
    Scenario: Login title verification
      When user looks at the title of page
      Then user should see "Zero - Log in" as title

    @test2
    Scenario: Link text verification
      When user looks at the top left link text
      And user looks at the  href text of link text
      Then user should see "Zero Bank" as link text
      And user should see href contains "index.html"

    @test3
    Scenario: Zero Bank login title verification
      And user enters valid username and password
      When user looks at the title of page
      Then user should see "Zero - Account Summary" as title
