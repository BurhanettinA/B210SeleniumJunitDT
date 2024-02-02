package day13_files_robot;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C01_FileExists {

    @Test
    public void filesExistsTest() {

        // System.getProperty("user.dir") kodu java da programin suanda calistigi dizini
        // yani (current working directory) yi string olarak return eder
        System.out.println(System.getProperty("user.dir"));
        /*
        System.getProperty("user.home") methodu ile bilgisayarimizin bize ozgu olan ana yolunu
        dynamic olarak alabilir ve projedeki herkes icin ortak olan yol ile birlestirerek dosya
        yolunu tum kullanicilar icin dynamic bir forma donusturebiliriz
         */
        System.out.println(System.getProperty("user.home"));//C:\Users\Nutzer

        /*
       Bilgisayarimizdaki herhangi bir dosyanin varligini test edebilmek icin
       1- Oncelikle varligini test etmek istedigimiz dosyanin yolunu almaliyiz
       2- Aldigimiz dosya yolunu Files.exists () methodunu kulanarak test edebiliriz
         */

        //Bilgisayarimizdaki herhangi bir dosyanini varligini test edelim

        //C:\Users\Nutzer        \Desktop\Batch210.txt

        String ortakYol = "\\Desktop\\Batch210.txt";

        /*
        Files.exists(Paths.get(dynamicPath) methodunu kullanarak belirtilen path objesinin dosya sisteminde
        varolup olmadigini test ettik
         */
        String dynamicPath = System.getProperty("user.home") + ortakYol;
        Assertions.assertTrue(Files.exists(Paths.get(dynamicPath)));

    }


}