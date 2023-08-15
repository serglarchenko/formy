import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static Constants.ConstantsUrl.BASEURL;

public abstract class BasePage {
    WebDriver driver;

    @Before
    public void setup() {
        driver = WebDriverFactory.getDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }


    @After
    public void tearDown() {
        if (driver != null)
            driver.quit();
    }

    public void driverOpensUrl(String endpoint) {
        driver.get(BASEURL+endpoint);
    }
}
