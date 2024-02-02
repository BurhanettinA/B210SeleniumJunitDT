package day13_files_robot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import utilites.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDownload extends TestBase {
    @Test
    public void test01() {

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitForSecond(5);

        //Dosyanın başarıyla indirilip indirilmediğini test edelim

        //C:\Users\mua      \Downloads\b10 all test cases, code.docx
        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }


    @Test
    public void test02() {

        String dosyaYolu = System.getProperty("user.home") + "\\Downloads\\b10 all test cases, code.docx";

        try {
            Files.delete(Paths.get(dosyaYolu));
            System.out.println("bulunan eski dosyalar silindi");
        } catch (IOException e) {
            System.err.println("DOSYA SILINEMEDİ!!!");
        }

        //https://testcenter.techproeducation.com/index.php?page=file-download adresine gidelim.
        driver.get("https://testcenter.techproeducation.com/index.php?page=file-download");

        //b10 all test cases dosyasını indirelim
        driver.findElement(By.partialLinkText("b10 all test cases")).click();
        waitForSecond(5);

        //Dosyanın başarıyla indirilip indirilmediğini test edelim
        //C:\Users\Nutzer     \Downloads\b10 all test cases, code.docx
        Assertions.assertTrue(Files.exists(Paths.get(dosyaYolu)));
    }


}