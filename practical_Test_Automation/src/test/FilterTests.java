package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.TopsPage;
import utils.TestBase;

public class FilterTests extends TestBase {

    @Test
    public void testFilterByCategoryAndColor() {
        String category = "Jackets";
        String color = "Blue";

        HomePage homePage = new HomePage(driver);
        homePage.clickWomenTops();

        TopsPage topsPage = new TopsPage(driver);
        topsPage.selectCategory(category);
        topsPage.selectColor(color);

        Assert.assertTrue(topsPage.getFilteredProductCount() > 0,
                "No products found after applying filters");
    }
}