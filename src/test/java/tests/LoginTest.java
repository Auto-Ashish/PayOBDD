package tests;

import AbstractComponents.Baseclass;
import AbstractComponents.WaitTime;
import PageObject.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;




public class LoginTest  extends Baseclass {

    LoginPage loginPage=new LoginPage(driver);


    public void Signup() throws InterruptedException {

        loginPage.getTextbox_name().sendKeys("Alex");
        loginPage.getTextMobile().sendKeys("8149367129");
        loginPage.getTextCompanyName().sendKeys("Human");
        loginPage.getTextPassword().sendKeys("admin@9214");
        loginPage.getTextEmail().sendKeys("ashish.ut09@gmail.com");
        loginPage.getSignUpButton().click();
        SoftAssert softassert = new SoftAssert();
        String actualURL = "https://app.payobank.in/mobile-verification";
        WaitTime.wait_to.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(.,'Send verification OTP ')]")));

        String expectedURL = driver.getCurrentUrl();
        softassert.assertEquals(actualURL,expectedURL);

        softassert.assertAll();
    }




}
