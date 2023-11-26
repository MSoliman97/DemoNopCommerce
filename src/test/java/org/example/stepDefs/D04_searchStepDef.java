package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.ProductDetailsPage;
import pages.SearchPage;

public class D04_searchStepDef {
    SearchPage sp = new SearchPage(Hooks.driver);
    ProductDetailsPage pdp = new ProductDetailsPage(Hooks.driver);
    SoftAssert softAssert = new SoftAssert();

    @Given("user search on {string}")
    public void user_search_on(String product) {
        softAssert.assertTrue(Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/"));
        sp.productSearch(product);
        System.out.println(sp.productList.size());
        for (int i = 0 ; i < sp.productList.size(); i++ ){
            String productName = sp.productList.toString().toLowerCase();
            System.out.println(productName);

        }
    }
    @Then("search shows relevant results")
    public void search_shows_relevant_results() {
        Assert.assertTrue(sp.productList.getFirst().getText().contains("Apple MacBook Pro 13-inch"));

    }


    @Given("user search {string}")
    public void user_search(String product) {

    }
    @When("user will see product appear")
    public void user_will_see_product_appear() {

    }
    @Then("enter to the product page and validate it contains  the search data")
    public void enter_to_the_produact_page_and_validate_it_containes_the_search_data() {

    }
}
