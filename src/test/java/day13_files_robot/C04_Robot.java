package day13_files_robot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.TestBase;

import java.awt.*;
import java.awt.event.KeyEvent;

public class C04_Robot extends TestBase {

    @Test
    public void test01() throws AWTException {
        /*
        Upload file yaparken sendKeys() methodu islemedigi durumlarda TestBase classinda olusturdugumuz
        uploadFilePath() methodu ile dosya yi yukleyebiliriz
        Bu method kullanilirken manual olarak klavye yada mouse u kullanmamamiz gerekir
         */
        //Robot classi java nin yerel kütüphanesinde bulunur ve seleniumdaki actions class gibi mouse ve
        //klavye islemlerini simule eder

        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_WINDOWS);
        robot.keyRelease(KeyEvent.VK_WINDOWS);
        robot.delay(3000);

        robot.keyPress(KeyEvent.VK_N);
        robot.keyRelease(KeyEvent.VK_N);
        robot.delay(3000);
    }


    @Test
    public void robotTest() {

        //"https://www.ilovepdf.com/compress_pdf" sayfasina gidilir
        driver.get("https://www.ilovepdf.com/compress_pdf");

        //   yuklenmek istenen dosya yuklenir
        driver.findElement(By.id("pickfiles")).click();
        waitForSecond(2);

        String dosyaYolu = System.getProperty("user.home")+"\\Downloads\\Batch 210upload.pdf";

        uploadFilePath(dosyaYolu);

        //   dosyanin basariyla yuklendigini test edilir
        WebElement verify = driver.findElement(By.xpath("//span[.='Batch 210upload.pdf']"));
        Assertions.assertTrue(verify.isDisplayed());

    }
}