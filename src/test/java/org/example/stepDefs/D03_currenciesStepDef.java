package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.HomePage;

public class D03_currenciesStepDef {
    HomePage hp = new HomePage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("select Euro currency from the dropdown list")
    public void select_euro_currency_from_the_dropdown_list() {
        hp.changeCurrency();
        softAssert.assertTrue(hp.changeCurrencyList.getText().contains("Euro"));
    }

    @When("currency should be changed and will appear beside the product price")
    public void currency_should_be_changed_and_will_appear_beside_the_product_price() {
        Assert.assertTrue(hp.productPriceLbl.getText().contains("€"));
    }
    @Then("validate on four products")
    public void validate_on_products_price_currencies() {
        for (int i = 0 ; i< 4 ; i++){
            Assert.assertTrue(hp.productsPriceAndSymbol.getText().contains("€"));
        }
    }
}
