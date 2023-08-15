import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.*;


public class SwitchWindowTests extends BasePage {
    @Test
    public void SwitchWindowTest() throws InterruptedException {
        driver.get(BASEURL + SWITCH_WINDOW);
        WebElement title = driver.findElement(By.xpath("//div[@class='container']/descendant::h1"));
        WebElement newTitleButton = driver.findElement(By.id("new-tab-button"));

        title.getText().equals("Switch Window");
        newTitleButton.isDisplayed();
        newTitleButton.click();
        Thread.sleep(2000);

        String originalHandler = driver.getWindowHandle();

        for (String handle1 : driver.getWindowHandles()) {
            driver.switchTo().window(handle1);
            Thread.sleep(2000);
        }
        driver.switchTo().window(originalHandler);
        Thread.sleep(2000);
    }

    @Test
    public void SwitchToAlertTest() throws InterruptedException {
        driver.get(BASEURL + SWITCH_WINDOW);
        WebElement alertButton = driver.findElement(By.id("alert-button"));
        alertButton.click();
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(2000);
    }
}
