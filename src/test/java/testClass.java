import jdk.javadoc.internal.doclets.toolkit.util.DocFile;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;


public class testClass {
    private static Object WebElement;
    private static DocFile FileUtils;

    public static void main(String[] args) {

        String exePath = "/Users/KosNote/Downloads/chromedriver.exe";
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

        if (searchResult1.getText().contains(expectedResult)) {
            File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        }
    }
}


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





