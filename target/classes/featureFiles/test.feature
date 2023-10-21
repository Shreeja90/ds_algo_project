Feature: test

@Smoke
  Scenario: Open DsAlgo portal
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page
 @Smoke
  Scenario: Checking Get Started link
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
 @Smoke
  Scenario: Checking Get Started link
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button