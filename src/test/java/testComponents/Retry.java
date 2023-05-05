package testComponents;

import AbstractComponents.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Retry extends Baseclass {

    public Retry(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
