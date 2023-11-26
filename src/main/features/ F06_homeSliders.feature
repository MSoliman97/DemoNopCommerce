@smoke
  Feature: > F06_homeSliders |
    Scenario: open first slider that will direct you to iphone 14 pro product
      Given open first slider from home page
      When  direct you to iphone14 pro product details page
      Then validate on URL is right

      Scenario: open second slider that will direct you to iphone 14 pro product
        Given open second slider from home page
        When direct you to S22Ultra product details page
        Then validate on URL