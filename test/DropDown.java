import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.*;

public class DropDown extends BasePage{

    @Test
    public void dropDownMenuTest(){
        driverOpensUrl(DROP_DOWN);
        WebElement dropdownMenuButton = driver.findElement(By.id("dropdownMenuButton"));
        dropdownMenuButton.click();
        WebElement checkBoxMenu = dropdownMenuButton.findElement(By.xpath("//div[@class='dropdown-menu show']/descendant::a[3]"));
        checkBoxMenu.click();
        Assert.assertEquals(driver.getCurrentUrl(),BASEURL+CHECK_BOX);

    }
}
