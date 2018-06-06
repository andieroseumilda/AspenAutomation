Feature: To get the copies of IBE


  Scenario: I should be able to see the copies in calendar page
    When i open the IBE page
    Then i should see the header copy "When would you like to stay?"
    And  i should see the hotel banner copy "The Bellevue Manila"
    And i should see the hotel country copy "Philippines"
    And i should see the CHECK-IN, TO and CHECK-OUT copy "Check-In", "Check-Out" and "to"
    And i should see the see rooms button copy "SEE ROOMS"
    And i should see the date today and tomorrow on the stay dates sections
