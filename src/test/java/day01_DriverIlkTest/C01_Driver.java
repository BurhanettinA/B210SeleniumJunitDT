package day01_DriverIlkTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_Driver {
    public static void main(String[] args) throws InterruptedException {

/*
ChromeDriver slenium dan gelen komutlari alir ve chormenin anlayacgi sekilde cevirir
bunun icin javada da System.setProperty("webdriver.com","drivers/chromedriver.exe");
ile seleniu chrume driver in konumunu bildirerek chrome browser chrome browser
in dogru bir sekilde baslatilmasini saglar
 */
        System.setProperty("webdriver.com","drivers/chromedriver.exe");

        WebDriver driver= new ChromeDriver();// bos bir chrome driver acar.
        driver.get("https://google.com");// get methodu ile string olarak belirtigimiz url ile gideriz
        Thread.sleep(3000);
        driver.quit();// oturumu sonlandirilir
    }

}