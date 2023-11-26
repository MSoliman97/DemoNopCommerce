package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchPage extends PageBase{

    /*******************************************Constructor*******************************************/
    public SearchPage(WebDriver driver){
        super(driver);
    }

    /*******************************************Elements*******************************************/

    @FindBy(css = "input[class='search-box-text ui-autocomplete-input']")
    WebElement searchTxtBox;
    @FindBy(css = "button[class='button-1 search-box-button']")
    WebElement searchBtn;
    @FindBy(id = "ui-id-1")
       public List<WebElement> productList;

    @FindBy(xpath = "//div/a[@href='/apple-macbook-pro-13-inch']")
    WebElement productTitle;


    /*******************************************Methods*******************************************/
    public void productSearch(String productName){
        writeTxt(searchTxtBox,productName);
        clickElement(searchBtn);
    }
    public void openProductDetails(){
        clickElement(productTitle);
    }

    public void productSearchUsingAutoSuggest(String searchTxt) throws InterruptedException {
        writeTxt(searchTxtBox,searchTxt);
        productList.get(0).click();
        Thread.sleep(3000);
    }

}
