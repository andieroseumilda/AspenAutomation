Feature: As a guest, i should book a reservation via smartphone.

  @happyPath
  Scenario: I should be able to book a reservation by using smartphone
    Given i open the IBE page
     When i select my desired stay dates from 2 days from now to 3 days from now
#     And i select my desired rooms
#     And i input my guest information
#     And i input my cc details
#    Then i should redirected to confirmation page