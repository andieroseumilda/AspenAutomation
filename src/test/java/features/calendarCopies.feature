Feature: To get the copies of IBE

  @tag
  Scenario: I should be able to see the copies in calendar page
    When i open the IBE page
    Then i should see the header copy "When would you like to stay?"
    And  i should see the hotel banner copy "The Bellevue Manila"
    And i should see the hotel country copy "Philippines"
    And i should see the CHECK-IN, TO and CHECK-OUT copy "Check-In", "Check-Out" and "to"
    And i should see the see rooms button copy "SEE ROOMS"
    And i should see the date today and tomorrow on the stay dates sections

    @tag1
    Scenario: I should be able to see the copies in calendar modal
      Given i open the IBE page
      When i click the stay dates section
      Then i should see these Labels "Check-In", "to" , and "Check-Out"
     # And i should see the date today and tomorrow on the Header of Calendar Modal
