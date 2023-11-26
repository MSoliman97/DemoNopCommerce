package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WishListPage extends  PageBase{


    /*********************************************CONSTRUCTORS**********************************************/
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    /*******************************************Elements*******************************************/
    @FindBy(css = "input[class='qty-input']")
    public WebElement qtyBox;

    /*******************************************Methods*******************************************/

}
