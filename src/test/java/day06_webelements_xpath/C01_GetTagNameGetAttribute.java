package day06_webelements_xpath;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_GetTagNameGetAttribute {

    @Test
    public void test01() {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //arama kutusunun tag name'inin input olduğunu test edelim
        WebElement searchBox = driver.findElement(By.id("searchHeaderInput"));
        String actualTagName = searchBox.getTagName();
        String expectedTagName = "input";
        Assertions.assertEquals(actualTagName, expectedTagName);


        //arama kutusunun class attribütunun değerinin form-input olduğunu test ediniz

        //Junit'te; assertEquals kullanıldığında ilk önce expectedResult sonra actualResult yazılmalı
        String actualAttributeValue= searchBox.getAttribute("class");
        String expectedAttributeValue="form-input";
        Assertions.assertEquals(expectedAttributeValue,actualAttributeValue);



        //sayfayı kapatınız
        driver.quit();

    }
}