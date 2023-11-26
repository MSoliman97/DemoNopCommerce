package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class D05_hoverCategoriesStepDef {

    HomePage hp = new HomePage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();
    @Given("user open homepage")
    public void user_open_homepage() {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
    }
    @When("user hoover on computers menu")
    public void user_hoover_on_computers_menu() {
        hp.hoverOnComputersMenu();

    }
    @Then("validate that list of sup categories appeared")
    public void validate_that_list_of_sup_categories_appeared() {
        String[] expectedText = {"desktops", "notebooks", "software"};
        for (int i = 0; i < hp.computersMenuList.size(); i++){
            String actualText = hp.computersMenuList.get(i).getText().toLowerCase().trim();
            Assert.assertEquals(actualText,expectedText[i]);
        }



    }
}
