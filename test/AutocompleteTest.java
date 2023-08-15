import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Constants.ConstantsUrl.*;


public class AutocompleteTest extends BasePage{

    @Test
    public void autocompletedFieldsTest() {
        WebDriverWait wait = new WebDriverWait(driver,10);
        driver.get(BASEURL + AUTOCOMPLETE);
        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.click();
        autocomplete.sendKeys("1555");

        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@class='pac-container hdpi']")));
                //Commented part for implicit Waiter
                //WebElement popup = driver.findElement(By.xpath("//div[@class='pac-container hdpi']"));
        popup.isDisplayed();
        WebElement googleLabel = driver.findElement(By.xpath("//div[@class='pac-container hdpi']/descendant::img"));
        googleLabel.isDisplayed();
        WebElement msgText = driver.findElement(By.xpath("//div[@class='pac-container hdpi']/descendant::span"));
        msgText.getText().equals("Не вдається завантажити Карти Google на цій сторінці.");
        WebElement ownerLink = driver.findElement(By.xpath("//div[@class='pac-container hdpi']/descendant::a"));
        ownerLink.getText().equals("Ви є власником цього веб-сайту?");
        WebElement okButton = driver.findElement(By.xpath("//button[@class='dismissButton']"));
        okButton.click();
    }

}
