import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageAllo {
    String siteAllo = "https://allo.ua//";
    WebElement buttonKatalogAllo = driver.findElement(By.cssSelector("#main-menu .caption"));
    WebElement buttonNaushn = driver.findElement(By.cssSelector("#nav > li.level0.nav-3.level-top > div > a > span"));
    WebElement buttonBitsAllo = driver.findElement(By.cssSelector("#menu_naushniki_i_akustika .first.column  li:nth-child(3) > a[href='//allo.ua/ua/naushniki/proizvoditel-beats/']"));
    WebElement inputWindForPriceAlloFilter = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));




}
