
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.*;

public class KeyboardAndMouseInput extends BasePage {

    @Test
    public void keyboardAndMouseInputTest() throws InterruptedException {
        driver.get(BASEURL+KEY_PRESS);
        WebElement name = driver.findElement(By.id("name"));
        name.click();
        name.sendKeys("Serhii");
        Thread.sleep(2000);
        WebElement button = driver.findElement(By.id("button"));
        button.click();
    }

}
