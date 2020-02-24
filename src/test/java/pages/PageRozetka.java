package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/*public class PageRozetka {
    String saitRothetka = "https://rozetka.com.ua/";
    WebElement buttonKatalogRothetka = driver.findElement(By.cssSelector("button.menu-toggler"));
    WebElement buttonTehnikRoth = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
    WebElement buttonRefrig = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3) [href='https://bt.rozetka.com.ua/refrigerators/c80125/']"));
    WebElement inputPris1 = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
*/


}
public class PageRozetka {

    WebDriver driver;
    By saitRothetka = By.xpath("//table//tr[@class='heading3']");
    public WebDriverWait wait;


    public PageRozetka(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);

    }
    //Get the User name from Home Page
    public String getHomePageDashboardUserName(){
        return    driver.findElement(PageRozetka).getText();
    }

}


    //Wait Wrapper Method
    public void waitVisibility(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    //Click Method
    public void click (By elementBy) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).click();
    }

    //Write Text
    public void writeText (By elementBy, String text) {
        waitVisibility(elementBy);
        driver.findElement(elementBy).sendKeys(text);
    }