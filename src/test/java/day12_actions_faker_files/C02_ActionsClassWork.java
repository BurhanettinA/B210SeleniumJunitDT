package day12_actions_faker_files;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilites.TestBase;

public class C02_ActionsClassWork extends TestBase {

    @Test
    public void test01() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(0);//safyada 1 tane iframe bulundugu icin calisma yapaacağımız webelementler burada bulundugu icin index ile gecis yaptik

        //Drag me to my target Webelementini Drop here Webelementi üzerine bıkalım
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();//-> Drag webelementini alip drop webelementinin uzerine biraktik

    }

    @Test
    public void test02() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//safyada 1 tane iframe bulundugu icin calisma yapaacağımız webelementler burada bulundugu icin index ile gecis yaptik

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).//=>drag webelementine tikla ve basili tut
                moveToElement(drop).//=>drag webelementini tutup drop webelementinin uzerine götürür
                release().//==>Basili tutulan webelementi serbest birakir
                perform();
    }


    @Test
    public void test03() {

        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//safyada 1 tane iframe bulundugu icin calisma yapaacağımız webelementler burada bulundugu icin index ile gecis yaptik

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.clickAndHold(drag).moveByOffset(187,50).release().perform();

    }

    @Test
    public void test04() {
        //https://jqueryui.com/droppable/ adresine gidelim
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(0);//safyada 1 tane iframe bulundugu icin calisma yapaacağımız webelementler burada bulundugu icin index ile gecis yaptik

        //Drag me to my target webelementini Drop here webelementi üzerine bıkalım
        WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions actions = new Actions(driver);
        actions.dragAndDrop(drag,drop).perform();//-> Drag webelementini alip drop webelementinin uzerine biraktik

        String actualDropText = drop.getText();
        Assertions.assertEquals("Dropped!", actualDropText);

    }
}