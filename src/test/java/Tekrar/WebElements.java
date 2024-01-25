package Tekrar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {
    WebDriver driver =new ChromeDriver();

    @Test
    public void Test() throws InterruptedException {
        //"https://www.facebook.com" adresine gidiniz
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);

        //"email box" i locate ediniz
        WebElement email= driver.findElement(By.id("email"));

        //"PasswordBox" i locate ediniz.
        WebElement password = driver.findElement(By.id("pass"));

        // email box a invalid email giriniz
        email.sendKeys("invalid@gmail.com");
        //password box a invalid password giriniz
        password.sendKeys("invalid");

        //log-oin butonuna basiniz
        password.submit();

        //login olunamadiginiz test ediniz(Negative test)
        WebElement valid =driver.findElement(By.className("_akzt"));
        Assertions.assertTrue(valid.isDisplayed());
        driver.quit();

    }
}