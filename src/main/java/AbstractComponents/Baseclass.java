package AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class Baseclass {

    public static WebDriver driver;
    public  static String baseURL = "https://app.payobank.in/";




    public static void setup() {

        driver = new EdgeDriver();
        driver.manage().window().maximize();
     //   driver.get("https://app.payobank.in/register");
      //  driver.get("https://app.payobank.in/");


    }


}