package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.WishListPage;

public class D08_WishlistStepDef {
    HomePage hp = new HomePage(Hooks.driver);
    WishListPage wlp = new WishListPage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("user scroll in homepage and press on HTC M8 add to wishlist")
    public void user_scroll_in_homepage_and_press_on_htc_m8_add_to_wishlist() {
        hp.addHTCM8ToWishList();

    }
    @When("successful message will appear")
    public void successful_message_will_appear() {
        Assert.assertTrue(hp.successfulAddToWishlistMsg.getText().contains("The product has been added to your"));

    }
    @Then("validate on background color of the message")
    public void validate_on_background_color_of_the_message() {

        String color = hp.successfulAddToWishlistMsg.getCssValue("color");
        Assert.assertEquals(color,"rgba(255, 255, 255, 1)");

    }


    @Given("user add HTC M8 to wishlist")
    public void user_Add_htc_m8_add_to_wishlist() {
        hp.addHTCM8ToWishList();
        softAssert.assertTrue(hp.successfulAddToWishlistMsg.getText().contains("The product has been added to your"));
        String color = hp.successfulAddToWishlistMsg.getCssValue("color");
        softAssert.assertEquals(color,"rgba(255, 255, 255, 1)");
    }
    @When("user navigate to wishlist page")
    public void user_navigate_To_Wishlist_Page() {
        hp.navigateToWishListAndValidateQuantity();

    }
    @Then("validate that qty of the product not equal zero")
    public void validate_that_qty_More_Than_Zero() {
        String actualResult = wlp.qtyBox.getText();
        Assert.assertNotEquals(actualResult,"1");

    }
}
