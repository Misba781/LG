package pageObject;

import base.Config;
import base.GenericFunctions;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class signup_page extends Config {




    public signup_page(WebDriver driver) {
        PageFactory.initElements(driver, this);
        Config.driver = driver;
    }

    @FindBy(how = How.ID, using ="input0label")
    public WebElement noThanksLoc;

    @FindBy(how = How.CLASS_NAME, using = "email full-width")
    public WebElement emailLocator;

    @FindBy(how = How.XPATH, using = "//input[@id='txtBoxPassword']")
    public WebElement passwordLocator;


    @FindBy(how = How.XPATH, using = "//input[@id='txtBoxPasswordConfirm']")
    public WebElement ConformPasswordLocator;

    @FindBy(how = How.XPATH, using = "//div[@class='navi-btm']/div[4]/div[3]/div[2]/a[1]")
    public WebElement SingUpButtonLocator;

    @FindBy(how = How.LINK_TEXT, using = "Sign Up now")
    public WebElement SingUpButtonNowLocator;
    @FindBy(how = How.NAME, using = "firstName")
    public WebElement firstNameLoc;
    @FindBy(how = How.NAME, using = "lastName")
    public WebElement lastNameLoc;

    public void setNoThanks()  {driver.switchTo().frame(0);
       driver.switchTo().window("noThanksLoc");

     noThanksLoc.sendKeys("misbauddin1988@gmail.com");
    }
    public void enterEmail() {
        emailLocator.sendKeys("Misbau@gmail.com");
    }

    public void enterFirstName() {
        firstNameLoc.sendKeys("misba");
    }

    public void enterLastName() {
        lastNameLoc.sendKeys("uddin");
    }

    public void enterpassword() {
        passwordLocator.sendKeys("12345");

    }
    public void enterConformPassword() {
        ConformPasswordLocator.sendKeys("12345");
    }

    public void  Signup() {
       SingUpButtonLocator.click();
    }
    public void  SingUpButton() {
      SingUpButtonNowLocator.click();
    }

}
