// TopsPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class TopsPage {
    private WebDriver driver;

    @FindBy(css = "div[option-label='Category']")
    private WebElement categoryFilter;

    @FindBy(css = "div[option-label='Color']")
    private WebElement colorFilter;

    @FindBy(css = ".product-item")
    private List<WebElement> filteredProducts;

    public TopsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void selectCategory(String category) {
        categoryFilter.click();
        driver.findElement(By.xpath("//div[contains(@class,'filter-options-content')]//a[contains(text(),'" + category + "')]")).click();
    }

    public void selectColor(String color) {
        colorFilter.click();
        driver.findElement(By.xpath("//div[contains(@class,'filter-options-content')]//div[@option-label='" + color + "']")).click();
    }

    public int getFilteredProductCount() {
        return filteredProducts.size();
    }
}