package testComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Listener {

    public Listener(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
}
