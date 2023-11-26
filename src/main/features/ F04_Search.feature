@smoke
Feature: F04_Search | UserCan serach on produacts
  Scenario Outline: user could search using product name
    Given user search on "<product>"
    Then search shows relevant results
    Examples:
      |product |
    |Apple MacBook Pro 13-inch|

  Scenario Outline: user could search for product using sku
    Given user search "<product>"
    When user will see product appear
    Then enter to the product page and validate it contains  the search data
    Examples:
      | product |
      | MacB    |