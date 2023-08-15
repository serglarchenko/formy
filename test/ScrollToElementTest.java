import CommonMethods.CommonMethods;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import static Constants.ConstantsUrl.*;

public class ScrollToElementTest extends BasePage {
    @Test
    public void scrollToElementTest() throws InterruptedException {
        driver.get(BASEURL + SCROLL);
        WebElement firstName = driver.findElement(By.id("name"));
        WebElement date = driver.findElement(By.id("date"));
        Actions action = new Actions(driver);
        action.moveToElement(firstName);
        firstName.sendKeys("Serhii");
        date.sendKeys(CommonMethods.getCurrentData("MM/dd/yyyy"));
        Thread.sleep(2000);

    }
}

