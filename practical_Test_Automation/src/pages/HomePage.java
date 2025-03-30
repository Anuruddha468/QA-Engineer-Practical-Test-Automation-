package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    @FindBy(id = "search")
    private WebElement searchField;

    @FindBy(css = "a[href*='women/tops']")
    private WebElement womenTopsLink;

    @FindBy(css = "a[href*='gear']")
    private WebElement gearSectionLink;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void searchForItem(String searchTerm) {
        searchField.sendKeys(searchTerm);
        searchField.submit();
    }

    public void clickWomenTops() {
        womenTopsLink.click();
    }

    public void navigateToGearSection() {
        gearSectionLink.click();
    }
}