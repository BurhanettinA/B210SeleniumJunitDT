package day13_files_robot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.TestBase;

public class C03_UploadFile extends TestBase {
    @Test
    public void upload() {


        //https://the-internet.herokuapp.com/upload adresine gidelim
        driver.get("https://the-internet.herokuapp.com/upload");

        //chooseFile butonuna basalim
        //Yuklemek istediginiz dosyayi secelim.
        WebElement chooseFile = driver.findElement(By.id("file-upload"));
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";
        chooseFile.sendKeys(dosyaYolu);
        waitForSecond(2);

        //Upload butonuna basalim.
        driver.findElement(By.id("file-submit")).click();
        waitForSecond(3);

        //“File Uploaded!” textinin goruntulendigini test edelim.
        String actualText = driver.findElement(By.xpath("//h3")).getText();
        Assertions.assertEquals("File Uploaded!",actualText);

    }
}