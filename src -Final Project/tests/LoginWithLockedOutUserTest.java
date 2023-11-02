package tests;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPageObject;

public class LoginWithLockedOutUserTest extends BaseTest {

    @Test
    public void testLoginWithLockedOutUser() {
        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.enterUsername("locked_out_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Epic sadface: Sorry, this user has been locked out.";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }
}