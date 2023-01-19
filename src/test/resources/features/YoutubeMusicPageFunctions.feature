Feature: Testing youtube's video page elements

  Scenario:
    When user goes to the youtube
    And user writes "The Wekend -See Your Tears" in search box
    Then User sees video among Search results
    And user clicks on video
    And user sees video
    And user gives positive feedback
    And user writes comment



