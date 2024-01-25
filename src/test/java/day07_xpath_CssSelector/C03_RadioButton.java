package day07_xpath_CssSelector;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_RadioButton {

    WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }

    @Test
    public void test01() throws InterruptedException {

        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        // Cookies'i kabul edin
        //Cooikes cikmadi


        // "Create an Account" button'una basin
       driver.findElement(By.xpath("(//a[@role='button'])[2]")).sendKeys(Keys.ENTER);
       // createAccountButton.click();

        // "radio buttons" elementlerini locate edin
       // WebElement femaleRadioButton = driver.findElement(By.xpath("//label[text()='Female']"));
        WebElement maleRadioButton = driver.findElement(By.xpath("(//label[@class='_58mt'])[2]"));

        // Secili degilse cinsiyet butonundan size uygun olani secin
        if (!maleRadioButton.isSelected()) {
            maleRadioButton.click();
        }

    }

    @AfterEach
    void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}