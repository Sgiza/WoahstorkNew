package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage {

    public HomePage ( WebDriver myDriver ) {
        super(myDriver);
    }
    public WebElement getWelcomeBackElement() {
        return findElement("[content='Welcome Back']");
    }

    public void clickGetVerifiedIcon() {
        findElement("[href='/profile']").click();
    }

    public void openHomePage() {
        driver.get("https://test.woahstork.com/");
    }
}
