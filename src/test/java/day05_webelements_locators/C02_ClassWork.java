package day05_webelements_locators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C02_ClassWork {

    @Test
    public void test01() throws InterruptedException {

        // Google sayfasına gidelim
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        Thread.sleep(3000);

        // Arama kutusunu "name" attribute e göre bularak "selenium" yazalim
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("selenium");

        // Aramayı yapalim
        searchBox.submit();

        //Başlığın selenium içerdiğini test edelim
        //1. yol
        /*
        String actualTitle= driver.getTitle();
        String expectedTitle= "selenium";
        Assertions.assertTrue(actualTitle.contains(expectedTitle));
         */
        //2. yol
        Assertions.assertTrue(driver.getTitle().contains("selenium"));


        //Sayfada kaç tane link olduğunu yazdıralım
        /*
        Eger birden fazla webelementi locate etmek istiyorsak findElements methodunu kullaniriz
        Bu method bize bir listin icinde webelementleri return eder
         */

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("Linklerin sayisi " + links.size());


        //Sayfadaki linklerin metinleri varsa konsola yazdıralım
        for ( WebElement  w : links){
            if(!w.getText().isEmpty()) {
                System.out.println(w.getText());
            }
        }


        //sayfayı kapatalım
        driver.close();
    }
}