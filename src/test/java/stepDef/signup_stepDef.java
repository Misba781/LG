package stepDef;

import base.Config;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.signup_page;

public class signup_stepDef extends Config {
    signup_page SP = new signup_page(driver);


    @And("i enter unique email address during signup")
    public void iEnterUniqueEmailAddressDuringSignup() {
        SP.enterEmail();
    }
    @And("i enter Valid password")
    public void iEnterValidPassword() {
        SP.enterpassword();
    }

    // i enter valid Confirm Password
    @And("i enter valid Confirm Password")
    public void iEnterValidConfirmPassword() {
        SP.enterConformPassword();
    }


    @And("i enter unique First Name {string} during signup")
    public void iEnterUniqueFirstNameDuringSignup() {
        SP.enterFirstName();
    }

    @And("i enter unique Last Name {string} during signup")
    public void iEnterUniqueLastNameDuringSignup() {
        SP.enterLastName();
    }


    @And("i click on  Sign up Button")
    public void iClickOnSignUpButton() {
        SP.SingUpButton();
    }

    @And("i click on {string} button from signup page")
    public void iClickOnButtonFromSignupPage() {
        SP.Signup();
    }

    @Given("i am at LG Homepage")
    public void iAmAtLGHomepage() {

    }

    @And("i click on no thank")
    public void iClickOnNoThank()  {

        SP.setNoThanks();
    }
}