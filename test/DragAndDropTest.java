import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

import static Constants.ConstantsUrl.BASEURL;
import static Constants.ConstantsUrl.DRAG_DROP;

public class DragAndDropTest extends BasePage {
    @Test
    public void dragAndDropTest() throws InterruptedException {
        driver.get(BASEURL + DRAG_DROP);
        WebElement img = driver.findElement(By.id("image"));
        WebElement box = driver.findElement(By.id("box"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(img, box).build().perform();
        Thread.sleep(2000);

    }
}
