package PageObject;

import AbstractComponents.Baseclass;
import com.sun.net.httpserver.Authenticator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;

import static AbstractComponents.Baseclass.driver;


public class LoginPage {

    public  LoginPage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

LoginPage loginPage;
    // LOGIN PAGE WEB ELEMENTS
        // MOBILE NUMBER TEXTBOX
    @FindBy(xpath = "//div/input[@placeholder = 'Enter mobile number']")
    private  WebElement txtMobileLoginPage;

    public WebElement getTxtMobileLoginPage(){
        return txtMobileLoginPage;
    }

        //TEXTBOX  PASSWORD
    @FindBy(xpath = "//div/input[@placeholder = 'Enter password']")
    private  WebElement txtPasswordLoginPage;

    public WebElement getTxtPasswordLoginPage(){
        return txtPasswordLoginPage;
    }

    // Login Button
    @FindBy(xpath = "//button[@class='primary-button']")
    private  WebElement btnLogin;

    public WebElement getBtnLogin(){
        return btnLogin;
    }



    //Sign up Button
    @FindBy(xpath="//div/span[@class='google-button__text']")
    private WebElement Sign_up_with_Google;

    public WebElement getSign_up_with_Google(){
        return Sign_up_with_Google;
    }

    @FindBy(xpath="//div/input[@placeholder='Enter your name']")
    private  WebElement textbox_name;

    public WebElement getTextbox_name(){
        return textbox_name;
    }

    //  Enter mobile number
    @FindBy(xpath = "//div/input[@placeholder='Enter mobile number']")
    private  WebElement textMobile;

    public WebElement getTextMobile(){
        return textMobile;
    }

    //Enter your company name
    @FindBy(xpath = "//div/input[@placeholder='Enter your company name']")
    private WebElement textCompanyName;

    public WebElement getTextCompanyName(){
        return textCompanyName;
    }

    //Enter email address

    @FindBy(xpath="//div/input[@placeholder='Enter email address']")
    private WebElement textEmail;

    public WebElement getTextEmail(){
        return textEmail;
    }

    //Enter Password
    @FindBy(xpath = "//div/input[@placeholder='Enter Password']")
    private WebElement textPassword;

    public WebElement getTextPassword(){
        return textPassword;
    }

//Sign up button
    @FindBy(xpath = "//button[contains(.,' Sign up')]")
    private WebElement signUpButton;

    public WebElement getSignUpButton(){
    return   signUpButton;
    }


public void Load_Login_Page(){


        driver.get(Baseclass.baseURL+"login");


    }


    public SaleOrder loginToApp(String user, String password){

        getTxtMobileLoginPage().sendKeys(user);
        getTxtPasswordLoginPage().sendKeys(password);
        getBtnLogin().click();
       return new SaleOrder(driver);

    }

}


