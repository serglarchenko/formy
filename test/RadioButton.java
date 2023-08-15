import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.*;

public class RadioButton extends BasePage{
    @Test
    public void radioButton1() throws InterruptedException {
        driver.get(BASEURL + RADIO_BUTTON);
        WebElement radioButton3 = driver.findElement(By.cssSelector("input[value='option3']"));
        radioButton3.click();
        Thread.sleep(2000);
        WebElement radioButton2 = driver.findElement(By.cssSelector("input[value='option2']"));
        radioButton2.click();
        Thread.sleep(2000);
        WebElement radioButton1 = driver.findElement(By.cssSelector("#radio-button-1"));
        radioButton1.click();
        Thread.sleep(2000);
    }

    @Test
    public void checkBoxTest(){
        driver.get(BASEURL + CHECK_BOX);
        WebElement checkBox1 = driver.findElement(By.cssSelector("#checkbox-1"));
        checkBox1.click();
        Assert.assertTrue(checkBox1.isSelected());
        WebElement checkBox2 = driver.findElement(By.cssSelector("#checkbox-2"));
        checkBox2.click();
        Assert.assertTrue(checkBox2.isSelected());
        WebElement checkBox3 = driver.findElement(By.cssSelector("#checkbox-3"));
        checkBox3.click();
        Assert.assertTrue(checkBox3.isSelected());


    }
}
