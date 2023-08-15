import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static Constants.ConstantsUrl.*;

public class CompleteWebForm extends BasePage{

    @Test
    public void fillOutApplicationFormTest(){
        driverOpensUrl(FORM);
        driver.findElement(By.id("first-name")).sendKeys("Serhii");
        driver.findElement(By.id("last-name")).sendKeys("La");
        driver.findElement(By.id("job-title")).sendKeys("Tester");
        driver.findElement(By.id("radio-button-3")).click();
        driver.findElement(By.xpath("//div[@class='input-group']/descendant::input[@id='checkbox-1']")).click();
        driver.findElement(By.cssSelector("option[value='1']")).click();
        driver.findElement(By.id("datepicker")).sendKeys("08/08/2023");
        driver.findElement(By.cssSelector(".btn.btn-lg.btn-primary")).click();
        Assert.assertEquals(driver.getCurrentUrl(),BASEURL+THANKS);
        String alertMsg = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
        Assert.assertEquals("The form was successfully submitted!", alertMsg);

    }
}