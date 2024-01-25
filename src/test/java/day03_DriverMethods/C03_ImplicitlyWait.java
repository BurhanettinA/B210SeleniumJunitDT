package day03_DriverMethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_ImplicitlyWait {
    public static void main(String[] args) {

        /*
        nasil web sayfasini manuelde maxsimum aciyor isek ,
        otomasyondada sayfayi maxsimum acmaliyiz otomasyon net olarak gorebilmeli

        bir web sayfasina gittigimizde internet yada baska sebeblerden dolayi
        web elementler hemen yuklenmez ve hata aliriz. bundan dolayi Implicitywait kullanilir.
        bazi ekstra dinamik beklemeler icin explicit wait kullanmayi ogrenecegiz.
        Implicitly wait sayfadaki web elementelerinin olusmasini maxsimum olarak bekler.
        eger bu sure dolmadam yukleme gerceklesir ise  driver beklemez, yoluna devam eder,
        max surede yuklenmez ise hata verir-
       */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        //techpro sayfasına gidiniz
        driver.get("https://www.techproeducation.com");

        //sayfa başlığının TechPro Education olduğunu test ediniz
        String expectedData="TechPro Education";
        String actualData = driver.getTitle();
        if(actualData.equals(expectedData)){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        //facebook sayfasına gidiniz
        driver.get("https://facebook.com");

        //sayfa url'inin facebook içerdiğini test ediniz
        if(driver.getCurrentUrl().contains("facebook")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }

        //techpro sayfasına geri dönününüz
        driver.navigate().back();

        //Geri döndüğünüzü test ediniz
        actualData=driver.getTitle();
        if(actualData.equals("TechPro Education IT Programs")){
            System.out.println("TEST PASSED");
        }else{
            System.out.println("TEST FAILED");
        }
        //sayfayı kapatınız
        driver.quit();

    }

}
