package day02_driverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C03_GetMethodsTest {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        //Amazon sayfasina gidelim. https://www.amazon.com/
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");

        //Sayfa basligini(title) yazdirin
        String actualAmazonTitle=driver.getTitle();
        System.out.println("actualAmazonTitle = " + actualAmazonTitle);

        //Sayfa basliginin "Amazon" icerdigini test edin
        if(actualAmazonTitle.contains("Amazon")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfa adresini(url) yazdirin
        String actualUrl = driver.getCurrentUrl();
        System.out.println("actualUrl = " + actualUrl);

        //Sayfa url'inin "amazon" icerdigini test edin.
        if(actualUrl.contains("amazon")){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfa handle degerini yazdirin
        String amazonHandleDegeri=driver.getWindowHandle();
        System.out.println("amazonHandleDegeri = " + amazonHandleDegeri);

        driver.navigate().refresh();//==> F5 basiyor bu kdo sayfayi yniliyor ve sayfayi geciyoruz.
        driver.navigate().refresh();
        Thread.sleep(3000);

        //Sayfa HTML kodlarinda "Gateway" kelimesi gectigini test edin
        String amazonHtmlCssCodes=driver.getPageSource();
        if(amazonHtmlCssCodes.contains("Gateway")   ){
            System.out.println("TEST PASSED");
        }else {
            System.out.println("TEST FAILED");
        }

        //Sayfayi kapatin.
        driver.quit();



    }
}