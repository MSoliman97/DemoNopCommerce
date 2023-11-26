package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class D06_homeSlidersStepDef {
    HomePage hp = new HomePage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    @Given("open first slider from home page")
    public void open_first_slider_from_home_page() {
        hp.pressOnFirstSliderButton();
    }
    @When("direct you to iphone14 pro product details page")
    public void direct_you_to_iphone14_pro_product_details_page() throws InterruptedException {
        hp.pressOnFirstSliderPage();
    }
    @Then("validate on URL is right")
    public void validate_on_url_is_right() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/iphone14");

    }


    @Given("open second slider from home page")
    public void open_second_slider_from_home_page() {
        hp.pressOnSecondSliderButton();
    }
    @When("direct you to S22Ultra product details page")
    public void direct_you_to_S22Ultra_product_details_page() throws InterruptedException {
        hp.pressOnSecondSliderPage();
    }
    @Then("validate on URL")
    public void validate_on_url() {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/S22Ultra");
    }


}
