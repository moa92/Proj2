import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class NameF {
    public static void main (String []args) {

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
    }

}
