package day05_webelements_locators;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_Locators {

    @Test
    public void test01() throws InterruptedException {

        //Google sayfasına gidiniz
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://google.com");
        Thread.sleep(3000);

        //Arama kutusunu locate ediniz ve java yazdırıp aratınız
        //Eger bir webelementi tekrar kullanacaksak bir webelemente assigin edebiliriz
        /*
        1. yol
        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("java");
        searchBox.submit();  */
        /*
        Eger bir arama kutusunu locate edip bir text gönderirsek 2 sekilde enter tusuna basabiliriz
        1) submit() methodu
        2) Keys.ENTER (==>ENUM)
         */

        //Eger locate aldigimiz webelementi bir kere kullanacaksak bu sekilde de yazabiliriz
        driver.findElement(By.id("APjFqb")).sendKeys("java", Keys.ENTER);
        Thread.sleep(3000);


        //sayfayı kapatınız
        driver.close();


    }
}