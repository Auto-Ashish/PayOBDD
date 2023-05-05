package StepDef;

import AbstractComponents.Baseclass;
import PageObject.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static AbstractComponents.Baseclass.driver;

public class StepDefs  {



    @Given("^User launched the Instance$")
    public  void User_launched_the_Instance(){
        LoginPage loginPage =new LoginPage(driver);
        Baseclass.setup();
        loginPage.Load_Login_Page();

    }

    @When("^Enter (.+) and (.+) in Login page$")
    public void Enter_username_and_password_in_Login_page(String user, String password){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loginToApp(user, password);

    }

    @Then("^Login should be done with valid credentials$")
    public void Login_should_be_done_with_valid_credentials(){
        System.out.println("Login process completed");
    }
}
