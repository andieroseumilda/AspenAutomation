Feature: To get the copies of IBE

#  @calendarPage
#  Scenario: I should be able to see the copies in calendar page
#    When i open the IBE page
#    Then i should see the header copy "When would you like to stay?"
#    And  i should see the hotel banner copy "The Bellevue Manila"
#    And i should see the hotel country copy "Philippines"
#    And i should see the CHECK-IN, TO and CHECK-OUT copy "Check-In", "Check-Out" and "to"
#    And i should see the see rooms button copy "SEE ROOMS"
#    And i should see the date today and tomorrow on the stay dates sections
#
#    @calendarModal
#    Scenario: I should be able to see the copies in calendar modal
#      Given i open the IBE page
#      When i click the stay dates section
#      Then i should see these Labels "Check-In", "to" , and "Check-Out"
#      And i should see the date today and tomorrow on Calendar Modal

    @showRates
    Scenario: I should be able to see the lowest, median and highest rates
      Given i open the IBE page
      When i click the stay dates box
      Then i should see the number of months is up to 20
      And i should see the date today and tomorrow are preselected
      When i click the holiday
      Then i should see the holiday on the selected dates
      When i click the show rates
      Then i should see the lowest, median and highest rates



      //scenario checkin header label, on the calendar, and see rooms label

      



