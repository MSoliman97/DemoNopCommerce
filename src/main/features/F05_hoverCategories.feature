@smoke
Feature: F05_hoverCategories | hoover on main categories
  Scenario: hoover on computers menu
    Given user open homepage
    When user hoover on computers menu
    Then validate that list of sup categories appeared
