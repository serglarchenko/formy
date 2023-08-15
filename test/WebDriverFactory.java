import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver;

    public static WebDriver getDriver(){
            System.setProperty("webdriver.chrome.driver", "/drivers/chromedriver/chromedriver.exe");
            driver = new ChromeDriver();
        return driver;
    }
}
