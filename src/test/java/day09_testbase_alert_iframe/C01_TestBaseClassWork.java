package day09_testbase_alert_iframe;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilites.TestBase;

public class C01_TestBaseClassWork extends TestBase {



    @Test
    public void test01()  {

        //Yil, ay, gun dropdown menulerden reusable methodlar kullanarak secim yapalim

        driver.get("https://testcenter.techproeducation.com/index.php?page=dropdown");

        WebElement year = driver.findElement(By.id("year"));
        WebElement month = driver.findElement(By.id("month"));
        WebElement day = driver.findElement(By.id("day"));

        selectIndex(year,1);
        waitForSecond(2);
        selectIndex(month,2);
        waitForSecond(2);
        selectIndex(day,3);
        waitForSecond(4);

        selectVisibleText(year,"1999");
        waitForSecond(2);
        selectVisibleText(month,"August");
        waitForSecond(2);
        selectVisibleText(day,"19");

    }

    private void selectVisibleText(WebElement year, String number) {
    }

}