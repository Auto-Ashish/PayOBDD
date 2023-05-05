package PageObject;

import AbstractComponents.Baseclass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class SaleOrder extends Baseclass {

    public SaleOrder(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

}
