  Feature: Reading Data: The code should read all data
  Scenario: Read all data from csv file
    Given I have a file named DummyData.csv
    When data is requested
    Then I will recieve all the data: