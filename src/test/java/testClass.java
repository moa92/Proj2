import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;


public class testClass {

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





