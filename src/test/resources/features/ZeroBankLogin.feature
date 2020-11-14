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

  @test4
  Scenario: Modules' title verification
    When user enters valid username and password
    And user clicks to "account_activity_tab" link
    Then user should see "Zero - Account Activity" as title
    And user clicks to "transfer_funds_tab" link
    Then user should see "Zero - Transfer Funds" as title
    And user clicks to "pay_bills_tab" link
    Then user should see "Zero - Pay Bills" as title
    And user clicks to "money_map_tab" link
    Then user should see "Zero - My Money Map" as title
    And user clicks to "online_statements_tab" link
    Then user should see "Zero - Online Statements" as title



