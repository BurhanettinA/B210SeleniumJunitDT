package day10_windowHandle_basicAuthentication;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.TestBase;


public class C03_BasicAuthantication extends TestBase {

    @Test
    public void test01() {

        //Aşağıdaki bilgileri kullanarak authentication yapınız:

        //    Url: https://the-internet.herokuapp.com/basic_auth
        //    Username: admin
        //    Password: admin


        //Sayfaya gidiniz
        driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");

        //    Congratulations! You must have the proper credentials. yazının çıktığını doğrulayın
        String expectedData1 = "Congratulations! You must have the proper credentials.";
        String actuelaDatas = driver.findElement(By.tagName("p")).getText();
        Assertions.assertEquals(expectedData1, actuelaDatas);

        //Elemental Selenium linkine tıklayınız
        driver.findElement(By.xpath("//a[@target='_blank']")).click();

        /*
        Not:
        "Elemental Selenium" yazisina tikladigimizda yeni bir tab acildi ama driverimiz hala ilk tab'da duruyor.
        Driver'i yeni acilan tab'a gecirmek icin swichTo yapacagiz
         */

        //Başlığın Elemental Selenium içerdiğini test edelim
        switchToWindow(1);

        Assertions.assertTrue(driver.getTitle().contains("Elemental Selenium"));
    }
}
