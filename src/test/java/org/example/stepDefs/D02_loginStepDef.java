package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;

public class D02_loginStepDef {
    HomePage hp = new HomePage(Hooks.driver);
    LoginPage lp = new LoginPage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    /*********************************************Valid-TestScenario**********************************************/
    @Given("user go to l0gin page")
    public void userGoToLoginPage() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        hp.navigateToLoginPage();
        softAssert.assertTrue(lp.loginPageWelcomeMsg.getText().contains("Welcome, Please Sign In!"));
    }
    @When("user login with valid {string} and {string}")
    public void user_login_with_and_p_ssw0rd(String email, String password) {
        lp.writeEmailText(email);
        lp.writePasswordText(password);

    }
    @And("user press on login butt0n")
    public void user_press_on_loginButton() {
        lp.logInBtn();

    }
    @Then("user login to the system successfully")
    public void user_login_to_the_system_successfully() {
        Assert.assertEquals(hp.myAccountBtn.getText(),"My account");

    }


    /*********************************************invalid-TestScenario**********************************************/
    @Given("user go to login page")
    public void user_go_to_login_page() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        hp.navigateToLoginPage();
        softAssert.assertTrue(lp.loginPageWelcomeMsg.getText().contains("Welcome, Please Sign In!"));
    }
    @When("user login with invalid {string} and {string}")
    public void user_login_with_invalid_email(String email, String password) {
        lp.writeEmailText(email);
        lp.writePasswordText(password);

    }
    @And("user press on login button")
    public void user_press_on_login_button() {
        lp.logInBtn();
    }
    @Then("user could not login to the system")
    public void user_could_not_login_to_the_system() {
        Assert.assertTrue(lp.validationMsg.getText().contains("Login was unsuccessful. Please correct the errors and try again."));
        String color = lp.validationMsg.getCssValue("color");
        Assert.assertEquals(color,"red #e4434b");
    }
}
