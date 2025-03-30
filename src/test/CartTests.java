package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utils.TestBase;

public class CartTests extends TestBase {

    @Test
    public void testAddToCartFunctionality() {
        String expectedProductName = "Fusion Backpack";

        HomePage homePage = new HomePage(driver);
        homePage.navigateToGearSection();

        ProductDetailsPage productPage = new ProductDetailsPage(driver);
        String actualProductName = productPage.getProductName();
        productPage.clickAddToCart();

        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.getCartItemName(), actualProductName,
                "Product in cart doesn't match the selected product");
    }
}