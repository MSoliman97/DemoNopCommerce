package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PageBase {
    /*********************************************GLOBAL_VARIABLES*******************************************/
    protected WebDriver driver;
    private JavascriptExecutor js ;
    private  Select select;
    private WebDriverWait wait ;
    private Actions action ;

    /*********************************************CONSTRUCTORS**********************************************/
    protected PageBase(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    /*********************************************COMMON_USER_ACTIONS**********************************************/
    protected void clickElement(WebElement ele){
        ele.click();
    }



    protected void writeTxt(WebElement ele, String text){
        ele.sendKeys(text);
    }

    protected void clearTxt(WebElement ele){
        ele.clear();
    }

    /*********************************************EXPLICIT_WAIT**********************************************/
    protected void waitEleByVisibility(WebElement ele , int sec){
        wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
        wait.until(ExpectedConditions.visibilityOf(ele));
    }
     /*****************************************USER_ADVANCED_ACTIONS**********************************************/

    protected void hoverEle(WebElement ele){
        action = new Actions(driver);
        action.moveToElement(ele).perform();
    }

    /*********************************************JS_INJECTION**********************************************/

    protected void jsClick(WebElement ele){
        js = (JavascriptExecutor) driver;
        js.executeScript("argument[0].click",ele);
    }
    protected void jsScrollToElement(WebElement ele){
        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView()",ele);
    }

    /*********************************************SELECT**********************************************/

    protected void selectByIndex (WebElement ele , int index){
        select = new Select(ele);
        select.selectByIndex(index);

    }
    protected void selectByValue (WebElement ele , String value){
        select = new Select(ele);
        select.selectByValue(value);

    }

    protected void selectByVisibleText (WebElement ele , String visibleText) {
        select = new Select(ele);
        select.selectByVisibleText(visibleText);
    }







}

