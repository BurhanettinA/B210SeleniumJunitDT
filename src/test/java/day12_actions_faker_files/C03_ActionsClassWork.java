package day12_actions_faker_files;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.TestBase;

public class C03_ActionsClassWork extends TestBase {
    @Test
    public void test01() {
        //Google anasayfasına gidelim
        driver.get("https://google.com");

        //arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java yazdıralım, arattiralim
        Actions actions = new Actions(driver);
        WebElement searchBox =  driver.findElement(By.id("APjFqb"));
        actions.keyDown(searchBox, Keys.SHIFT).//==> search Box ta shift tusuna basili tutar
                sendKeys("selenium").//arama kutusuna selenium yazar
                keyUp(Keys.SHIFT).//Shift tusundan eleni kaldir
                sendKeys(" - java",Keys.ENTER).perform();
    }

    @Test
    public void test02() {
        //Google anasayfasına gidelim
        driver.get("https://google.com");
        //arama kutusunda shift tusuna basılı olarak selenium yazdıralım ve shift tuşunu serbest bırakarak java yazdıralım, arattiralim
        WebElement searchBox =  driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys(Keys.SHIFT, "selenium",Keys.SHIFT," - java", Keys.ENTER);
    }


       /*
       ÖDEV:
       //google sayfasına gidelim
       //Arama kutusuna "Selenium" yazın ve Enter tuşuna basın
       //Arattığımız kelimeyi arama kutusundan ctrl+x ile keselim
       //Tekrar google sayfasına gidip kestiğimiz kelimeyi ctrl+v ile yapıştırıp tekrar aratalım
        */


}