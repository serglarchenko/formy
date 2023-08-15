import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.*;

public class ModalTests extends BasePage{
    @Test
            public void getModalTest(){
        driver.get(BASEURL + MODAL );
        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        WebElement closeButton = driver.findElement(By.id("close-button"));
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", closeButton);


    }
}
