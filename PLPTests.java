import Pages.PLPPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PLPTests extends  BaseTest {

        @Test
        public void SignUpSuccessTest () {

            PLPPage plpPage = new PLPPage (driver);
            plpPage.openPLPPage();
            plpPage.clickCartButton();
            WebElement el = plpPage.getCheckoutElement();
            Assert.assertEquals(el.getText(), "CHECKOUT");
        }
    }

