import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class filterItems {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");


        // 1. Locate the "Women" menu item
        WebElement womenMenu = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.linkText("Women"))); // Adjust locator

        // 2. Hover over the "Women" menu
        Actions actions = new Actions(driver);
        actions.moveToElement(womenMenu).perform();

        // 3. Locate the "Tops" submenu item
        WebElement topsLink = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.linkText("Tops"))); // Adjust locator

        // 4. Click the "Tops" link
        topsLink.click();
        driver.quit();

    }
}