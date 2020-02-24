package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlloPage extends BasePage {

    @FindBy(css="#main-menu .caption")
    private WebElement catalogButton;

    @FindBy(css="#nav > li.level0.nav-3.level-top > div > a > span")
    private WebElement buttonNaushn;

    @FindBy(css=".entry-point>li:nth-child(3) a[title='Beats']")
    private WebElement buttonBitsAllo;

    @FindBy(css=".input-text.navigation-from.validate-digits")
    private WebElement inputWindForPriceAlloFilter;

    @FindBy(css="span > span.new_sum")
    private WebElement valueInPriceField;


    public AlloPage(WebDriver driver){
        super(driver);
    }

    public AlloPage openCatalog() {
        if(!catalogButton.isDisplayed()) {
            catalogButton.click();
        }
        return this;
    }

    public AlloPage openNaushn() {
        buttonNaushn.click();
        return this;
    }

    public void openBitsAllo() {
        buttonBitsAllo.click();
    }

    public WebElement getInputWindForPriceAlloFilter() {
        return inputWindForPriceAlloFilter;
    }

    public WebElement getValueInPriceField() {
        return valueInPriceField;
    }

}



//public String siteAllo = "https://allo.ua/";
// WebElement buttonKatalogAllo = driver.findElement(By.cssSelector("#main-menu .caption"));
// WebElement buttonNaushn = driver.findElement(By.cssSelector("#nav > li.level0.nav-3.level-top > div > a > span"));
//WebElement buttonBitsAllo = driver.findElement(By.cssSelector("#menu_naushniki_i_akustika .first.column  li:nth-child(3) > a[href='//allo.ua/ua/naushniki/proizvoditel-beats/']"));
// WebElement inputWindForPriceAlloFilter = driver.findElement(By.cssSelector("fat-menu ul.menu-categories li.menu-categories__item:nth-child(3)"));
