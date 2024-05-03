Feature: Amazon
   this document is for amazon login and shopping

  Scenario: Amazon userid test
    Given browser "chrome" us open with url "https://www.amazon.in/"
    And I click sign in
    When I enter valid userid "paragguide@yahoo.co.in"
    And Click continue button
    Then I Validate the userid
    #And Close Browser