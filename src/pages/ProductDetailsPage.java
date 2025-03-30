package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage {
    private WebDriver driver;

    @FindBy(id = "product-addtocart-button")
    private WebElement addToCartButton;

    @FindBy(css = ".product-name")
    private WebElement productName;

    public ProductDetailsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickAddToCart() {
        addToCartButton.click();
    }

    public String getProductName() {
        return productName.getText();
    }
}