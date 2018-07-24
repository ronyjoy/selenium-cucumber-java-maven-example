Feature: Cargo UI

  @cargo
  Scenario: Login to CargoUI to verify actual number of links
    Given that I am on Cargospear login page
    When I have provided valid username and password
    Then I should be able to login
  @cargo
  Scenario: Login Failure
    Given that I am on Cargospear login page
    When I have provided invalid username or password
    Then I should not be able to login

