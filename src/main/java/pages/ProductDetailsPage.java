package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class ProductDetailsPage extends PageBase{

    SoftAssert softAssert;
    public ProductDetailsPage(WebDriver driver) {
        super(driver);
    }

    /*******************************************Elements*******************************************/
    @FindBy(css = "strong[class='current-item']")
     public WebElement productNameBreadCrumb;
    @FindBy(css = "button[class='button-2 email-a-friend-button']")
    WebElement sendProductToFriendByEmailBtn;
    @FindBy(xpath = "//div/a[@href='/productreviews/4'][2]")
    WebElement navigateToAddReviewPage;
    @FindBy(id = "add-to-wishlist-button-4")
    WebElement addToWishlistBtn;
    @FindBy(xpath = "//div/p[@class='content']")
    public WebElement successfulAddedMsg;
    @FindBy(xpath = "//p/a[@href='/wishlist']")
    WebElement navigateToWishListPageBtn;
    @FindBy(xpath = "//div[@class='compare-products']/child::button[1]")
    WebElement addToCompareBtn;
    @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p")
    WebElement productAddedToCompareMsg;
    @FindBy(xpath = "//div/p//a[@href='/compareproducts']")
    WebElement productCompareBtn;

    @FindBy(css = "input[class='search-box-text ui-autocomplete-input']")
    WebElement searchTxtBox;
    @FindBy(id = "ui-id-1")
    List<WebElement> productList;
    @FindBy(id="//button[@id='add-to-cart-button-4'])[1]")
    WebElement addToCartBtn ;
    @FindBy(xpath = "//div/p[@class='content']")
    WebElement confirmAddToCartMsg;
    @FindBy(xpath = "//p/a[@href='/cart']")
    WebElement navigateToCartPageFromNotification;

    /*******************************************Methods*******************************************/
    public void pressOnEmailProduct(){
        clickElement(sendProductToFriendByEmailBtn);
    }
    public void NavigateToAddReview(){
        clickElement(navigateToAddReviewPage);
    }
    public void clickOnAddToWishListBtn(){
        clickElement(addToWishlistBtn);
      softAssert = new SoftAssert();
        softAssert.assertEquals(addToWishlistBtn.getText(),"The product has been added to your ");

    }
    public void navigateToWishlistPage(){
        clickElement(navigateToWishListPageBtn);
    }
    public void addToCompare(){
        clickElement(addToCompareBtn);
        softAssert = new SoftAssert();
        softAssert.assertEquals(productAddedToCompareMsg.getText(),"The product has been added to your ");
    }
    public void navigateToComparePage(){
        clickElement(productCompareBtn);
    }
    public void productSearchUsingAutoSuggest(String searchTxt) throws InterruptedException {

        writeTxt(searchTxtBox, searchTxt);
        productList.get(0).click();
        Thread.sleep(3000);
    }
    public void addToCart(){
        clickElement(addToCartBtn);

    }

    /*public void addToCart(){
        jsScrollToElement(addToCartBtn);
        jsClick(addToCartBtn);
        softAssert = new SoftAssert();
        softAssert.assertTrue(confirmAddToCartMsg.getText().contains("The product has been added to your "));
    }*/
    public void navigateToCart(){
        clickElement(navigateToCartPageFromNotification);
    }

}

