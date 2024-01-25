package day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class C01_Driver {

    public static void main(String[] args) {
  /*
        WebDriverManager sayesinde istedigimiz browser icin setup yaparak otomasyonda kullanabilirz
        Bu sayede broweser a gore gerekli olan driver i bilgisayarimiza indirmek ve yapilandirmak zorunda
        kalmayiz
         */
        WebDriverManager.chromedriver().setup();
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.get("https://google.com");
        chromeDriver.quit();


        //  WebDriverManager.firefoxdriver().setup();
        //  WebDriver fireFoxDriver =new FirefoxDriver();
        //  fireFoxDriver.get("https://google.com");
        //   fireFoxDriver.quit();

        WebDriverManager.edgedriver().setup();
        WebDriver edgeDriver=new EdgeDriver();
        edgeDriver.get("https://google.com");
        edgeDriver.quit();

        /*
        driver.get(String Url)
        driver.getTitle() String
        driver.getCurrentUrl() String
        driver.getPageSource() String olarak kaynak kadalari veriri
        driver,getWindowHandle
         */


    }

}
