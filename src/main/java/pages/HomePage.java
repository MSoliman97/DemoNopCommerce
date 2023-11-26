package pages;

import io.cucumber.java.zh_cn.假如;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends PageBase{

    /*********************************************CONSTRUCTORS**********************************************/
    public HomePage(WebDriver driver){
        super(driver);
    }

    /*********************************************WEB-ELEMENTS**********************************************/
    /**
     * 1)suffix Btn = Button.
     */
    @FindBy(xpath = "//li/a[@href='/register?returnUrl=%2F']")
    WebElement regPageBtn;
    @FindBy(xpath = "//li/a[@href='/login?returnUrl=%2F']")
    WebElement loginPageBtn;
    @FindBy(xpath = "//li/a[@class='ico-account']")
    public WebElement myAccountBtn;

    @FindBy(css = "a[href='/contactus']")
    WebElement contactUsBtn;
    @FindBy(id = "customerCurrency")
    public WebElement changeCurrencyList;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[2]/div/div[2]/div[3]/div[1]/span")
    public WebElement productPriceLbl;

    @FindBy(linkText = "Computers")
     WebElement computersMenu;

    @FindBy(linkText = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul")
    public List<WebElement> computersMenuList;

    @FindBy(linkText = "Notebooks")
    WebElement noteBooksMenu;
    @FindBy(xpath = "//div/span[@class='price actual-price']")
    public WebElement productsPriceAndSymbol;
    @FindBy(xpath = "//div[@class='nivo-controlNav']/a[@rel='0']")
    WebElement firstSliderButton;
    @FindBy(xpath = "//a[@class='nivo-imageLink'][1]")
    WebElement firstSliderPage;
    @FindBy(xpath = "//div[@class='nivo-controlNav']/a[@rel='1']")
    WebElement secondSliderButton;
    @FindBy(xpath = "//a[@class='nivo-imageLink'][2]")
    WebElement secondSliderPage;
    @FindBy(xpath = "//li/a[@href='http://www.facebook.com/nopCommerce']")
    WebElement followUsOnFacebookButton;

    @FindBy(xpath = "//li/a[@href='https://twitter.com/nopCommerce']")
    WebElement followUsOnTwitterButton;

    @FindBy(css = "a[href='/news/rss/1']")
    WebElement followUsOnRssButton;

    @FindBy(css = "a[href='http://www.youtube.com/user/nopCommerce']")
    WebElement  followUsOnYouTubeButton;
    @FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div/div[4]/div[2]/div[3]/div/div[2]/div[3]/div[2]/button[3]")
    WebElement htcM8AddToWishListBtn;
    @FindBy(xpath = "//div/p[@class='content']")
    public WebElement successfulAddToWishlistMsg;
    @FindBy(xpath = "//p/a[@href='/wishlist']")
    WebElement navigateToWishListPageBtn;
    /*********************************************METHODS**********************************************/
    public void enterRegPage(){
        clickElement(regPageBtn);
    }
    public void navigateToLoginPage(){

      clickElement(loginPageBtn);
    }
    public void navigateToMyAccountPage(){
        clickElement(myAccountBtn);
    }
    public void navigateToContactUsPage(){
        jsScrollToElement(contactUsBtn);
        clickElement(contactUsBtn);
    }

    public void changeCurrency(){
        selectByVisibleText(changeCurrencyList,"Euro");
    }

    public void hoverOnComputersMenu(){
        hoverEle(computersMenu);

    }
    public void pressOnFirstSliderButton() {
        clickElement(firstSliderButton);

    }
    public void pressOnFirstSliderPage() throws InterruptedException {
        clickElement(firstSliderPage);
        Thread.sleep(2000);
    }

    public void pressOnSecondSliderButton()  {
        clickElement(secondSliderButton);


    }
    public void pressOnSecondSliderPage() throws InterruptedException {
        clickElement(secondSliderPage);
        Thread.sleep(2000);
    }

    public void pressOnFollowUsOnFaceBook() throws InterruptedException {
        jsScrollToElement(followUsOnFacebookButton);
        clickElement(followUsOnFacebookButton);
        Thread.sleep(1000);
    }
    public void handleSecondPage()throws InterruptedException{
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        Thread.sleep(1000);
    }
    public void closeSecondPage(){
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void pressOnFollowUsOnTwitter()throws InterruptedException  {
        jsScrollToElement(followUsOnTwitterButton);
        clickElement(followUsOnTwitterButton);
        Thread.sleep(1000);
    }

    public void pressOnFollowUsOnRss() throws InterruptedException {
        jsScrollToElement(followUsOnRssButton);
        clickElement(followUsOnRssButton);
        Thread.sleep(1000);
    }

    public void pressOnFollowUsOnYouTube() throws InterruptedException {
        jsScrollToElement(followUsOnYouTubeButton);
        clickElement(followUsOnYouTubeButton);
        Thread.sleep(1000);
    }
    public void addHTCM8ToWishList(){
        jsScrollToElement(htcM8AddToWishListBtn);
        clickElement(htcM8AddToWishListBtn);
    }
    public void navigateToWishListAndValidateQuantity(){
        waitEleByVisibility(navigateToWishListPageBtn,5);
       jsScrollToElement(navigateToWishListPageBtn);
        clickElement(navigateToWishListPageBtn);

    }


}
