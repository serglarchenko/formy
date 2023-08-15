import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.DATE_PICKER;

public class DatePicker extends BasePage{
    @Test
    public void setDateWithPick() throws InterruptedException {
        driverOpensUrl(DATE_PICKER);
        WebElement datePicker = driver.findElement(By.id("datepicker"));
        Thread.sleep(1000);
        datePicker.sendKeys("08/08/2023");
        Thread.sleep(1000);
        datePicker.sendKeys(Keys.RETURN);
        Thread.sleep(3000);

    }
}
