package test;
import org.junit.jupiter.api.Test;
import page.AlloPage;


public class FilterTest extends BaseTest {

    @Test
     public void testCheckingFiltersForPrice() {
        driver.get("https://allo.ua/");

        AlloPage alloPage = new AlloPage(driver);

        alloPage.openCatalog()
                .openNaushn()
                .openBitsAllo();


        alloPage.getInputWindForPriceAlloFilter().click();


//        pageRozetka.click(buttonKatalogRothetka);
//
//        buttonKatalogAllo.click();
//
//        buttonNaushn.click();
//        buttonBitsAllo.click();
//
//        inputPrizWindAllo.click();
//
//

        //WebElement searchField = driver.findElement(By.cssSelector("input.gLFyf.gsfi"));
        //String textValue = "flowers";





        // searchField.sendKeys(textValue);
        //searchField.submit();
    }
}
