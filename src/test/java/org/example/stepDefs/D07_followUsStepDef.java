package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class D07_followUsStepDef {

    HomePage hp = new HomePage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("user openes facebook Link")
    public void user_openes_facebook_link() throws InterruptedException {
        hp.pressOnFollowUsOnFaceBook();

    }
    @When("user redirect to facebook page URL")
    public void user_redirect_to_facebook_page_url() throws InterruptedException {
        hp.handleSecondPage();

    }
    @And("user validate facebook link and close this tap")
    public void user_validate_facebook_link_and_close_this_tap() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://www.facebook.com/nopCommerce");

    }
    @Then("user back to nopcommerce website and validate the url")
    public void user_back_to_noncommerace_website_and_validate_the_url() {
        hp.closeSecondPage();
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.nopcommerce.com/");
    }

    @Given("user openes Twitter Link")
    public void user_openes_Twitter_link() throws InterruptedException {
        hp.pressOnFollowUsOnTwitter();

    }
    @When("user redirect to Twitter page URL")
    public void user_redirect_to_Twitter_page_url() throws InterruptedException {
        hp.handleSecondPage();

    }
    @And("user validate Twitter link and close this tap")
    public void user_validate_Twitter_link_and_close_this_tap() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://twitter.com/nopCommerce");

    }
    @Then("user back to nopcommerce from twitter")
    public void user_back_to_nopcommerce_from_twitter() {
        hp.closeSecondPage();
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.nopcommerce.com/");
    }

    @Given("user openes RSS Link")
    public void user_openes_RSS_link() throws InterruptedException {
        hp.pressOnFollowUsOnRss();

    }
    @When("user redirect to RSS page URL")
    public void user_redirect_to_RSS_page_url() throws InterruptedException {
        hp.handleSecondPage();

    }
    @And("user validate RSS link and close this tap")
    public void user_validate_RSS_link_and_close_this_tap() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(currentUrl,"https://demo.nopcommerce.com/new-online-store-is-open");

    }
    @Then("user back to nopcommerce from RSS")
    public void user_back_to_nopcommerce_from_RSS() {
        hp.closeSecondPage();
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.nopcommerce.com/");
    }

    @Given("user openes Youtube Link")
    public void user_openes_Youtube_link() throws InterruptedException {
        hp.pressOnFollowUsOnYouTube();

    }
    @When("user redirect to Youtube page URL")
    public void user_redirect_to_Youtube_page_url() throws InterruptedException {
        hp.handleSecondPage();

    }
    @And("user validate Youtube link and close this tap")
    public void user_validate_Youtube_link_and_close_this_tap() {
        String currentUrl = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(currentUrl,"https://www.youtube.com/user/nopCommerce");

    }
    @Then("user back to nopcommerce from Youtube")
    public void user_back_to_nopcommerce_from_Youtube() {
        hp.closeSecondPage();
        String currentUrl = Hooks.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl,"https://demo.nopcommerce.com/");
    }
}
