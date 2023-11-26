@smoke
  Feature: F03_currencies | Change currency
    Scenario: guest user could change the currency of the products
      Given select Euro currency from the dropdown list
      When currency should be changed and will appear beside the product price
      Then validate on four products