package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBase{

    /*******************************************Constructor*******************************************/
    public LoginPage(WebDriver driver){
        super(driver);
    }

    /*******************************************Elements*******************************************/
    @FindBy(xpath = "//div/input[@class='email']")
    WebElement emailTxt;
    @FindBy(xpath = "//div/input[@class='password']")
    WebElement passwordTxt;
    @FindBy(xpath ="//div/input[@type='checkbox']" )
    WebElement rememberMeCheckBox;
    @FindBy(xpath = "//div/button[@type='submit']")
    WebElement loginBtn;
    @FindBy(xpath = "//div/h1")
    public WebElement loginPageWelcomeMsg;
    @FindBy(css = "div[class='message-error validation-summary-errors']")
    public WebElement validationMsg;

    /*******************************************Methods*******************************************/

    public void writeEmailText (String emailData){
        writeTxt(emailTxt,emailData);
    }

    public void writePasswordText (String passData) {
        writeTxt(passwordTxt,passData);
    }

    public void pressOnRememberMe(){
        rememberMeCheckBox.click();
    }
    public void logInBtn (){
       clickElement(loginBtn);
    }


}
