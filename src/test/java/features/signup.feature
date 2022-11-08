Feature: Signup

  Scenario Outline: Create a brand new user

    Given i am at LG Homepage
    And i click on no thank
#    And i click on  Sign up Button
#    And i click on "SIGN UP NOW" button from signup page
#    And i enter unique email address during signup
#    And i enter Valid password
#    And i enter valid Confirm Password
#    And i enter unique First Name "<firstName>" during signup
#    And i enter unique Last Name "<lastName>" during signup
#    And i enter Date of Birth "<Date of Birth>" during signup
#    And i click on PRIVACY POLICY
#    And i click on TERMS AND CONDITIONS
#    When i click on SIGN UP button
#    Then i should  be able to successfully Create account

    Examples:
      | firstName | lastName |
      | razib     | ahmed    |



