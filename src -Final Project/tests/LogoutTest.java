package tests;


import org.junit.Assert;
import org.junit.Test;

//import org.testng.Assert;
//import org.testng.annotations.Test;

import pages.LoginPageObject;
import pages.ProductsPageObject;

public class LogoutTest extends BaseTest {

	 @Test
	    public void testLogout() {
	        LoginPageObject loginPage = new LoginPageObject(driver);
	        loginPage.login("standard_user", "secret_sauce");

	        ProductsPageObject productsPage = new ProductsPageObject(driver);
	        productsPage.logout();
	    }

	    @AfterTest
	    public void teardown() {
	        driver.quit();
	    }
	}
	





}


