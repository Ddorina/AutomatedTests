package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import pages.LoginPageObject;
import pages.ProductsPageObject;

public class LoginTests extends BaseTest{

	@Test @Ignore
	public void testLoginWithValidData() {
		LoginPageObject loginPage = new LoginPageObject(driver);
	    loginPage.enterUsername("standard_user");
	    loginPage.enterPassword("secret_sauce");
	    loginPage.clickLoginButton();
		
}

	@Test @Ignore
    public void testLoginWithInvalidData() {
        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.enterUsername("aaa");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        String actualErrorMessage = loginPage.getErrorMessage();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
    }  
   
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
	
	 @Test
	 public void testLogout() {
		 LoginPageObject loginPage = new LoginPageObject(driver);
		 loginPage.enterUsername("standard_user");
		 loginPage.enterPassword("secret_sauce");
		 loginPage.clickLoginButton();
		 ProductsPageObject productsPage = new ProductsPageObject(driver);
	     productsPage.clickAddToCartButton();
	     productsPage.clickAddToCartButton();
	     String actualPageTitle = driver.getTitle();
	     String expectedPageTitle = "Swag Labs";
	     Assert.assertEquals(expectedPageTitle, actualPageTitle);
	 }
	 
	 
}
 



