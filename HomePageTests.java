import Pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;


public class HomePageTests extends  BaseTest {

        @Test
        public void GetVerifiedTest () {

            HomePage homePage = new HomePage (driver);

            homePage.openHomePage();
            homePage.clickGetVerifiedIcon();
            WebElement welcomeBack = homePage.getWelcomeBackElement();
            Assert.assertTrue(welcomeBack.isDisplayed());
        }
}
