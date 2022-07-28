Feature: Search and place order for products

  Scenario: Validate search on Home and Offers page
    Given user is on GreenCart Landing page
    When user searches for "tom"
    Then tomato should appear in the search results
    Given user is on GreenCart Offers page
    When user searches for "tom"
    Then tomato should appear in the search results on Offers page
    And the name should be identical to the one on the Landing page