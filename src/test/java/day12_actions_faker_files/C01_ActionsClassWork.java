package day12_actions_faker_files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.TestBase;

public class C01_ActionsClassWork  extends TestBase {
    @Test
    public void test01() {

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Events yazisina kadar scroll yapalim
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,2000).perform();
        waitForSecond(5);

        actions.scrollByAmount(0,-1000).perform();
        waitForSecond(5);
    }



    @Test
    public void test02() {

        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Events yazisina kadar scroll yapalim
        WebElement eventsText = driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0, eventsText.getLocation().getY()).perform();

        //Events yazisinin gorunur oldugunu test edin
        Assertions.assertTrue(eventsText.isDisplayed());
    }

    @Test
    public void test03() {
        //Techproeducation sayfasina gidelim
        driver.get("https://techproeducation.com");

        //Events yazisina kadar scroll yapalim
        WebElement eventsText = driver.findElement(By.xpath("//h2[.='Events']"));
        Actions actions = new Actions(driver);
        actions.scrollToElement(eventsText).perform();




    }
}