package pages;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import java.util.concurrent.TimeUnit;


public class TestMethodsForFilters {

    String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
    WebDriver driver;
    PageAllo pageAllo;
    PageRozetka pageRozetka;

    @BeforeTest
    public void setup() {

        System.setProperty("webdriver.chrome.driver", exePath);
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://allo.ua/");
    }


        @Test
     public void testCheckingFiltersForPrice() {
            pageRozetka = new PageRozetka(driver);
            pageRozetka.click(buttonKatalogRothetka);



        buttonKatalogAllo.click();

        buttonNaushn.click();
        buttonBitsAllo.click();

        inputPrizWindAllo.click();



        //WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        //String textValue = "flowers";





        // searchField.sendKeys(textValue);
        //searchField.submit();
    }
}
