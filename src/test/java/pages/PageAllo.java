package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageAllo {
    WebDriver driver;
    public WebDriverWait wait;

    public PageAllo(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,15);
    }
    public By buttonKatalogAllo = By.cssSelector("#main-menu .caption");
    By buttonNaushn = By.cssSelector("#nav > li.level0.nav-3.level-top > div > a > span");
    By buttonBitsAllo = By.cssSelector("#menu_naushniki_i_akustika .first.column  li:nth-child(3) > a[href='//allo.ua/ua/naushniki/proizvoditel-beats/']");
    By inputWindForPriceAlloFilter = By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)");

    public void click(WebElement element){
        driver.findElement((By) element).click();
    }
}



//public String siteAllo = "https://allo.ua/";
// WebElement buttonKatalogAllo = driver.findElement(By.cssSelector("#main-menu .caption"));
// WebElement buttonNaushn = driver.findElement(By.cssSelector("#nav > li.level0.nav-3.level-top > div > a > span"));
//WebElement buttonBitsAllo = driver.findElement(By.cssSelector("#menu_naushniki_i_akustika .first.column  li:nth-child(3) > a[href='//allo.ua/ua/naushniki/proizvoditel-beats/']"));
// WebElement inputWindForPriceAlloFilter = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
