@CEA10-320
Feature: Ceallo file sorting functionality
  User Story :
  As a user, I should be able to change folder view order by using Name/Size/Modified buttons

  User can change folder view order by Name
  User can change folder view order by Size
  User can change folder view order by Modified
  User can change the folder view by clicking the toggle-view button at the right corner of all files tab screen
  User can select all the files at once and see the total values of all files in the first line when clicked on the “select all” checkbox at the left top corner of the list



  Background: Ceallo icon is clickable and user is on the home page
    Given user is on the home page


  @CEA10-311
  Scenario: User can change folder view order by Name
    When User clicks on the Name button
    Then User should see the folder view order by Name

  @CEA10-312
  Scenario: User can change folder view order by Size
    When User clicks on the Size button
    Then User should see folder view order by Size

  @CEA10-314
  Scenario: User can change folder view order by Modified
    When User clicks on the Modified button
    Then User should see folder view order by Modified

  @CEA10-316
  Scenario: User can change the folder view by clicking the
  toggle-view button at the right corner of all files tab screen
    When user clicks on the toggle-view button
    Then user should change the folder view

  @CEA10-319
  Scenario: User can select all the files at once and see the
  total values of all files in the first line when clicked on
  the “select all” checkbox at the left top corner of the list
    When user clicks on select all checkbox
    Then user see total values of all files on first line

