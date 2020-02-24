import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.text.BreakIterator;
import java.text.SimpleDateFormat;

public class TestMethodsForFilters {
    @Test
    public void testRozetkaF1() {

        String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", exePath);

        WebDriver driver = new ChromeDriver();

        driver.get(saitAllo);


        buttonKatalogAllo.click();


        buttonNaushn.click();


        buttonBitsAllo.click();


        inputPrizWindAllo.click();
        inputPrizWindAllo.clear();
        inputPrizWindAllo.sendKeys("2000");




        //WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        //String textValue = "flowers";





        // searchField.sendKeys(textValue);
        //searchField.submit();
    }
}
