package tests;
import org.junit.Assert;
import org.junit.Test;
import pages.LoginPageObject;
import pages.ProductsPageObject;
	

	public class LoginWithValidDataTest extends BaseTest {

	    @Test
	    public void testLoginWithValidData() {
	        LoginPageObject loginPage = new LoginPageObject(driver);
	        loginPage.enterUsername("standard_user");
	        loginPage.enterPassword("secret_sauce");
	        loginPage.clickLoginButton();
	       // ProductsPageObject productsPage = new ProductsPageObject(driver);
	        String actualUrl = driver.getCurrentUrl();
	        String expectedUrl = "https://www.saucedemo.com/inventory.html";
	        Assert.assertEquals(expectedUrl, actualUrl);

}

	    //String actualTitle = productspageobject.();
	  //  String expectedTitle = "Swag Labs";
	  // Assert.assertEquals(expectedTitle, actualTitle);
	}
	