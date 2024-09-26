Feature: wiki page Automation

  @wiki01
  Scenario: verify the mapping of shareholding and shareholder value
    Given user navigates to wiki homepage
    When user extracts the shareholder value
    And user extracts the shareholding value
    Then validate the mapping

