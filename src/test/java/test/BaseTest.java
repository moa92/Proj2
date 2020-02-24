package test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    //private String exePath = "/Users/Oksana_Moshkivska/Downloads/chromedriver.exe";
    protected WebDriver driver;

    @BeforeAll
    public static void init() {
      //  System.setProperty("webdriver.chrome.driver", exePath);
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @BeforeEach
    public void setup() {
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @AfterAll
    public static void cleanUp() {
//        if (driver != null) {
//            driver.quit();
//        }
    }
}
