package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends PageBase{

    /*******************************************Constructor*******************************************/
    public RegisterPage(WebDriver driver){
        super(driver);

    }

    /*******************************************Elements*******************************************/

    @FindBy(id = "gender-male")
    WebElement genderSelect;
    @FindBy(id = "FirstName")
    WebElement firstNameTxt;
    @FindBy(id = "LastName")
    WebElement lastNameTxt;
    @FindBy(css ="select[name=DateOfBirthDay]" )
    WebElement daysDDL;
    @FindBy(css = "select[name=DateOfBirthMonth]")
    WebElement monthsDDL;
    @FindBy(css = "select[name=DateOfBirthYear]")
    WebElement yearsDDL;
    @FindBy(xpath = "(//div/input[@data-val=\'true\'])[3]")
    WebElement emailTxt;
    @FindBy(id = "Password")
    WebElement passwordTxt;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordTxt;
    @FindBy(id = "register-button")
    WebElement regKeyBtn;

    @FindBy(css = "div.result")
    public WebElement regSuccessfully;

    @FindBy(linkText = "Log out")
    WebElement logoutLink;


    /*******************************************Methods*******************************************/

    public void selectGender(){
        clickElement(genderSelect);
    }
    public void enterFirstName(String firstName){
        clickElement(firstNameTxt);
        writeTxt(firstNameTxt,firstName);
    }
    public void enterLastName(String lastName){
       clickElement(lastNameTxt);
       writeTxt(lastNameTxt,lastName);
    }

    public void enterDateOfBirth(){

        selectByIndex(daysDDL,25);
        selectByIndex(monthsDDL,4);
        selectByIndex(yearsDDL,85);
    }
    public void enterEmail(String email){
        clickElement(emailTxt);
        writeTxt(emailTxt,email);
    }

    public void enterPassword(String password){
        clickElement(passwordTxt);
        writeTxt(passwordTxt,password);
        clickElement(confirmPasswordTxt);
        writeTxt(confirmPasswordTxt,password);
    }
    public void pressOnRegisterBtn(){
       clickElement(regKeyBtn);
    }
    public void userLogout(){
        clickElement(logoutLink);
    }


}
