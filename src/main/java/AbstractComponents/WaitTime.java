package AbstractComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitTime {

    public static final int TO_SHORT_TO = 2;

    public final static int SHORT_TO = 5;

    public static final int MEDIUM_TO = 10;

    public static final int LONG_TO = 120;

    public static WebDriverWait wait_to = (WebDriverWait) new WebDriverWait(Baseclass.driver, Duration.ofSeconds(WaitTime.SHORT_TO));

}
