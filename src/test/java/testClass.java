import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class testClass {
    @Test
    public void Test() throws IOException, InterruptedException {

        String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

       WebDriverWait wait;

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait;
        wait = new WebDriverWait(driver,15);
        String searhWebSait = "https://allo.ua";
        driver.get(searhWebSait);

        WebElement buttonNaushn = driver.findElement(By.cssSelector("#nav > li.level0.nav-3.level-top > div > a > span"));
        WebElement buttonBitsAllo = driver.findElement(By.cssSelector("#menu_naushniki_i_akustika .first.column  li:nth-child(3) > a[href='//allo.ua/ua/naushniki/proizvoditel-beats/']"));
        WebElement inputWindForPriceAlloFilter =  driver.findElement(By.cssSelector(".input-text.navigation-from.validate-digits"));
        WebElement valueInPriceField = driver.findElement(By.cssSelector("span > span.new_sum"));


        buttonNaushn.click();
        buttonBitsAllo.click();
        inputWindForPriceAlloFilter.click();
        inputWindForPriceAlloFilter.clear();
        inputWindForPriceAlloFilter.sendKeys("4000");
        inputWindForPriceAlloFilter.submit();
        Thread.sleep(8000);

        ArrayList informationValuePrice = new ArrayList();
        informationValuePrice.add(valueInPriceField);


        for (type  : informationValuePrice) {


            Assertions
        }


        driver.quit();
    }




    @Test
    public void testGoogleSearch1() throws IOException {

        String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver = new ChromeDriver();
        String searhWebSait = "https://www.google.com/";
        driver.get(searhWebSait);

        WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        String textValue = "flowers";


        searchField.click();
        searchField.sendKeys(textValue);
        searchField.submit();

        String expectedResult = "flowers.ua";

        WebElement searchResult1 = driver.findElement(By.cssSelector("div#rso"));


        /* Date datenow = new Date();
          SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
           String fileName = format.format(datenow) + ".png";
*/


      if (searchResult1.getText().contains(expectedResult)) {

             File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(scrFile,new File("C:/Users/Oksana_Moshkivska/IdeaProjects/Proj/Screen/img1.png"));

        } else {
            Assertions.fail("Haven't found expected:" + expectedResult + "on the first page");
        }
        driver.quit();
    }



    @Test
    public void testGoogleSearch2() throws IOException {

        String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver = new ChromeDriver();
        String searhWebSait = "https://www.google.com/";
        driver.get(searhWebSait);

        WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        String textValue = "клапан";


        searchField.click();
        searchField.sendKeys(textValue);
        searchField.submit();

        String expectedResult = "www.meibes.ua › obvyazka-kotelnyix › smesitelnyie-klapanyi";

        WebElement searchResult1 = driver.findElement(By.cssSelector("#rcnt"));




           for (int iterator = 1; iterator <10; driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+ iterator + "]")))
           {
               Date datenow = new Date(1212121212121L);
               SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy hh-mm-ss");
               String fileName = format.format(datenow) + ".png";
               File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
               FileHandler.copy(scrFile,new File("C:/Users/Oksana_Moshkivska/IdeaProjects/Proj/Screen/"+fileName));

               if (searchResult1.getText().contains(expectedResult)) {

                   break;
               }


                   //Assertions.fail("Haven't found expected:" + expectedResult + "on the first page");

           }


        driver.quit();
    }




}

           /*for (int iterator = 1; iterator <10; driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+ iterator + "]")))
           {
               if(searchResult1.getText().contains(expectedResult)){
                   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             }
           }*/


        //WebElement resaltSerchPage = driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+ iteratlocat + "]"));


        //By element = By.xpath();
        //lastPage;


       //for(int page = 1; page < resaltSerchPage; page++)

           /*for (int iterator = 1; iterator <10; driver.findElement(By.xpath("//*[@id='nav']/tbody/tr/td["+ iterator + "]")))
           {
               if(searchResult1.getText().contains(expectedResult)){
                   File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
             }
           }*/



        /*if(searchResult1.getText().contains(expectedResult)) {
            private void captureScreenshot(String Object name;
            name) {
                File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);
               String path = "./target/screenshots/" + screenshot.getName();
                try {
                    FileUtils.copyFile(screenshot, new File(path));
                } catch (IOException e) {

                }
            }*/

            //sout to log page number
         /* } else {
           Assertions.fail("Haven't found expected:" + expectedResult + "on the first page"); }
           */

       // driver.quit();





