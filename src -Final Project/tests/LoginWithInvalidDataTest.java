package tests;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPageObject;


public class LoginWithInvalidDataTest extends BaseTest {

    @Test
    public void testLoginWithInvalidData() {
        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.enterUsername("wrong_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}


