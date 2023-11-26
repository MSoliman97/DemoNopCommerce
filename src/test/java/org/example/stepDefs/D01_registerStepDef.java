package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.RegisterPage;

public class D01_registerStepDef {

    HomePage hp = new HomePage(Hooks.driver);
    RegisterPage rp = new RegisterPage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    String firstName = "Automation";
    String lastName = "Tester";


    @Given("user go to register page")
    public void user_go_to_register_page() {

        hp.enterRegPage();

    }
    @And("user select gender type")
    public void user_select_gender_type() {
        rp.selectGender();

    }
    @And("user enter {string} and {string}")
    public void user_enter_first_name_and_last_name(String firstName, String lastName) {
        rp.enterFirstName(firstName);
        rp.enterLastName(lastName);

    }
    @And("user enter date of birth")
    public void user_enter_date_of_birth() {
        rp.enterDateOfBirth();

    }
    @And("user enter {string} field")
    public void user_enter_email_field(String email) {
        rp.enterEmail(email);


    }
    @And("user fills Password fields {string}")
    public void user_fills_password_fields(String password) {
        rp.enterPassword(password);


    }
    @When("user clicks on register button")
    public void user_clicks_on_register_button() {
        rp.pressOnRegisterBtn();

    }
    @Then("success message is displayed")
    public void success_message_is_displayed() {
        softAssert.assertTrue(rp.regSuccessfully.getText().contains("Your registration completed"));
        String color = rp.regSuccessfully.getCssValue("color");
        Assert.assertEquals(color,"rgba(76, 177, 124, 1)");


    }
}
