package day07_xpath_CssSelector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C04_CssSelector {

    /*
        SYNTAX
        1)  tagName [ attributeName  =  'attributeValue'  ]
        2)  Eger id ile css locate almak istersek    ==> #idAttributeValue
        3)  Eger class ile css locate almak istersek ==>.classAttriubetValue

        XPath ve CssSelector arasindaki fark nedir?
        1) cssSelector X Path a gore daha hizli calisir
        2) X Path ile bir webelement icin birden fazla sonuc verirse index ile bunu tek e dusurebiliriz
            Fakat cssSelector ile index kullanamayiz
        3) X Path ile bir webelementi sadece text i ile locate edebilirsiniz,
            Fakat cssSelector ile bunu yapamayiz
     */

    @Test
    public void test01() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //https://the-internet.herokuapp.com/add_remove_elements/ adresine gidin
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");

        //Add Element butonuna basin
        WebElement addElementButton = driver.findElement(By.cssSelector("button[onclick='addElement()' ]"));
        addElementButton.click();
        Thread.sleep(3000);

        //Delete butonu'nun gorunur oldugunu test edin
        WebElement deleteButton = driver.findElement(By.cssSelector("button[class='added-manually' ]"));
        Assertions.assertTrue(deleteButton.isDisplayed());

        //Delete tusuna basin
        Thread.sleep(3000);
        deleteButton.click();

        //"Add/Remove Elements" yazisinin gorunur oldugunu test edin
        WebElement addRemoveText = driver.findElement(By.cssSelector("h3"));
        Assertions.assertTrue(addRemoveText.isDisplayed());

        //sayfayı kapatınız
        driver.quit();

    }


}
