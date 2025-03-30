// SearchResultsPage.java
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class SearchResultsPage {
    private WebDriver driver;

    @FindBy(css = ".product-item-link")
    private List<WebElement> productTitles;

    public SearchResultsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean areAllResultsMatchingSearchTerm(String searchTerm) {
        return productTitles.stream()
                .allMatch(title -> title.getText().toLowerCase().contains(searchTerm.toLowerCase()));
    }
}