package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver myDriver) {
        this.driver = myDriver;
        wait = new WebDriverWait (driver,4);
    }

    protected WebElement findElement( String cssLocator) {
        return wait.until( ExpectedConditions.elementToBeClickable( By.cssSelector(cssLocator)));
    }
}
