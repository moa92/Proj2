package page;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

/*public class PageRozetka {
    String saitRothetka = "https://rozetka.com.ua/";
    WebElement buttonKatalogRothetka = driver.findElement(By.cssSelector("button.menu-toggler"));
    WebElement buttonTehnikRoth = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
    WebElement buttonRefrig = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3) [href='https://bt.rozetka.com.ua/refrigerators/c80125/']"));
    WebElement inputPris1 = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
    }
*/

public class PageRozetka {
    WebDriver driver;
    //String saitRothetka = "https://rozetka.com.ua/";
    public WebElement buttonKatalogRothetka = driver.findElement(By.cssSelector("button.menu-toggler"));
    WebElement buttonTehnikRoth = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
    WebElement buttonRefrig = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3) [href='https://bt.rozetka.com.ua/refrigerators/c80125/']"));
    WebElement inputWindForPriceRozetkaFilter = driver.findElement(By.cssSelector(".slider-filter__input.ng-pristine.ng-valid.ng-touched"));
    WebElement valueInPriceField = driver.findElement(By.cssSelector("span.goods-tile__price-value"));




    public WebDriverWait wait;

    public PageRozetka(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }

    public void click(WebElement element){
        driver.findElement((By) element).click();
    }

}


