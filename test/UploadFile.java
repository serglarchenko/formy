import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static Constants.ConstantsUrl.UPLOAD;

public class UploadFile extends BasePage{
    @Test
    public void uploadFileTest() {
        driverOpensUrl(UPLOAD);
        WebElement upload = driver.findElement(By.id("file-upload-field"));
        upload.click();
        upload.sendKeys("resources/upload_file.png");

    }
}
