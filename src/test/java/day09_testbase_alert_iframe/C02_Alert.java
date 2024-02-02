package day09_testbase_alert_iframe;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.TestBase;

public class C02_Alert extends TestBase {

    /*
        Eger bir safyadaki bir buttona tikladigimzda bir uyari penceresi aciliyorsa ve bu acilan pencereye sag tiklayarak inspect yapamiyorsak
        (locate edemiyorsak) bu bir JS Alerttir

        JS Alert ü handle edebilmek icin driverimizi o acilan pencereye gecirmemiz gerekir
        bunu switchTo() methodu ile ve alert() methodunu secerek yapariz

     */


    @Test
    public void acceptAlert() throws InterruptedException {
        //Bir metod olusturun: acceptAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //      birinci butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

        //      uyarıdaki OK butonuna tıklayın
        driver.switchTo().//->gecis methodu
                alert(). //->driver i alert e gecirdik
                accept();//->alert ten ok butonuna bastik


        //      result mesajının  “You successfully clicked an alert” oldugunu test edin.


        String actualResultMessage =driver.findElement(By.cssSelector("#result")).getText();
        String expectedResultMessage="You successfully clicked an alert";
        Assertions.assertEquals(expectedResultMessage,actualResultMessage);

    }

    @Test
    public void dismissAlert() {
        //Bir metod olusturun: dismissAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //       ikinci butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();

        //       uyarıdaki Cancel butonuna tıklayın
        driver.switchTo().alert().dismiss();//cancel butonuna basar

        //       result mesajının “successfuly” icermedigini test edin.
        String actualResultMessage = driver.findElement(By.cssSelector("#result")).getText();
        String unExpectedResultMessage="successfuly";
        //icerir kodunun false oldugunu doğrulamaliyiz
        Assertions.assertFalse(actualResultMessage.contains(unExpectedResultMessage));

    }

    @Test
    public void sendKeysAlert() {

        //  Bir metod olusturun: sendKeysAlert
        driver.get("https://testcenter.techproeducation.com/index.php?page=javascript-alerts");

        //  ucuncu butona tıklayın,
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();

        //          uyarıdaki  metin kutusuna isminizi yazin,
        driver.switchTo().alert().sendKeys("mehmet");

        //  OK butonuna tıklayın
        driver.switchTo().alert().accept();

        //  result mesajında isminizin görüntülendiğini doğrulayın.
        String actualResultMessage = driver.findElement(By.cssSelector("#result")).getText();
        Assertions.assertTrue(actualResultMessage.contains("mehmet"));

    }
}