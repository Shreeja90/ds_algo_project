Feature: test

@Smoke1
  Scenario: TC02 - Open DsAlgo portal
    Given The user opens DS Algo portal link
    Then The user should land in DS Algo portal page
    
 @Smoke2
  Scenario: TC03- Checking Get Started link
    Given The user opens DS Algo portal link
    When The user clicks the "Get Started" button
    Then The user should be redirected to homepage
 