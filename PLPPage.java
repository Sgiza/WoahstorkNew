package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PLPPage  extends BasePage {


    public PLPPage(WebDriver myDriver) {
        super(myDriver);
    }

    public WebElement getCheckoutElement() {
        return findElement("[class*='ButtonWrapper'] a");
    }

    public void clickCartButton() {
        findElement("[class*='CartButton']").click();
    }

    public void openPLPPage() {
        driver.get("https://test.woahstork.com/cbdmarketplace");
    }
}
