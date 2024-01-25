package day07_xpath_CssSelector;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C05_ClassWork {

    @Test
    public void test01() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        //http://zero.webappsecurity.com sayfasina gidin
        driver.get("http://zero.webappsecurity.com");

        //Signin buttonuna tiklayin
        driver.findElement(By.cssSelector("button[type='button']")).click();

        //Login alanine  “username” yazdirin
        //Password alanine “password” yazdirin
        //Sign in buttonuna tiklayin
        WebElement userTextBox = driver.findElement(By.cssSelector("input[type='text']"));
        userTextBox.sendKeys("username", Keys.TAB, "password",Keys.ENTER);
        Thread.sleep(3000);
        driver.navigate().back();//sayfaya giris yapabilmek icin back() kullandik

        //Online Banking altındaki Pay Bills sayfasina gidin
        driver.findElement(By.cssSelector("#onlineBankingMenu")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#pay_bills_link")).click();
        Thread.sleep(2000);

        //amount kismina yatirmak istediginiz herhangi bir miktari yazin
        //tarih kismina “2020-09-10” yazdirin
        WebElement amount = driver.findElement(By.cssSelector(".span1"));
        amount.sendKeys("300",Keys.TAB,"2020-09-10",Keys.TAB,Keys.TAB);
        Thread.sleep(3000);

        //Pay buttonuna tiklayin
        driver.findElement(By.cssSelector("#pay_saved_payees")).click();



        //“The payment was successfully submitted.” mesajinin ciktigini control edin
        WebElement succesMessage= driver.findElement(By.xpath("(//*[.='The payment was successfully submitted.'])[2]"));
        Assertions.assertEquals("The payment was successfully submitted.",succesMessage.getText());


        //sayfayı kapatınız
        driver.quit();

    }


}