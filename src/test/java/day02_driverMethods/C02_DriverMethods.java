package day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C02_DriverMethods {
    public static void main(String[] args) {

        //Google sayfasina gidelim
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        //Sayfa başlığını konsola yazdıralım
        String actualGoogleTitle = driver.getTitle();
        System.out.println("actualGoogleTitle = " + actualGoogleTitle);


        //Sayfanın Url'ini konsola yazdıralım
        String actualGoogleUrl=driver.getCurrentUrl();
        System.out.println("actualGoogleUrl = " + actualGoogleUrl);

        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");

        //Sayfa başlığını konsola yazdıralım
        String actualTechproTitle = driver.getTitle();
        System.out.println("actualTechproTitle = " + actualTechproTitle);

        //Sayfanın Url'ini konsola yazdıralım
        String actualTechproUrl=driver.getCurrentUrl();
        System.out.println("actualTechproUrl = " + actualTechproUrl);

        driver.quit();


    }
}
