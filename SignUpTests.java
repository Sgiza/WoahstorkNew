import Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Timestamp;

public class SignUpTests extends  BaseTest {

    @Test(priority = 1)

    public void SignUpSuccessTest () {

        SignUpPage signUpPage = new SignUpPage (driver);

        signUpPage.openSignUpPage();
        signUpPage.setEmailField(signUpPage.getRandomEmail());
        signUpPage.setPasswordField("incorrectPassword");
        signUpPage.setConfirmPasswordField("incorrectPassword");
        signUpPage.setZipCode("90066");
        signUpPage.clickCheckboxTermsAndConditions();
        signUpPage.clickCheckboxHIPAA();
        signUpPage.clickToLoginButton();
        WebElement phoneNumber = signUpPage.getphoneNumberElement();
        Assert.assertTrue(phoneNumber.isDisplayed());
    }
}
