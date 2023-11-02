package tests;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPageObject;
import pages.ProductDetailsPageObject;
import pages.ProductsPageObject;

	public class AddAndRemoveProductFromCartTest extends BaseTest {

	    @Test
	    public void testAddAndRemoveProductFromCart() {
	        LoginPageObject loginPage = new LoginPageObject(driver);
	        loginPage.enterUsername("standard_user");
	        loginPage.enterPassword("secret_sauce");
	        loginPage.clickLoginButton();
	        ProductsPageObject productsPage = new ProductsPageObject(driver);
	        productsPage.clickProduct(1);
	        ProductDetailsPageObject productDetailsPage = new ProductDetailsPageObject(driver);
	        String expectedProductTitle = productDetailsPage.getProductTitle();
	        String expectedProductDescription = productDetailsPage.getProductDescription();
	        String expectedProductPrice = productDetailsPage.getProductPrice();
	        productDetailsPage.enterQuantity("1");
	        productDetailsPage.clickAddToCartButton();
	        String actualCartBadgeText = productDetailsPage.getCartBadgeText();
	        String expectedCartBadgeText = "1";
	        Assert.assertEquals(expectedCartBadgeText, actualCartBadgeText);
	        productsPage.clickCartButton();
	        CartPageObject cartPage = new CartPageObject(driver);
	        String actualProductTitle = cartPage.getProductTitle(1);
	        String actualProductDescription = cartPage.getProductDescription(1);
	        String actualProductPrice = cartPage.getProductPrice(1);
	        String actualQuantity = cartPage.getQuantity(1);
	        Assert.assertEquals(expectedProductTitle, actualProductTitle);
	        Assert.assertEquals(expectedProductDescription, actualProductDescription);
	        Assert.assertEquals(expectedProductPrice, actualProductPrice);
	        Assert.assertEquals("1", actualQuantity);
	        cartPage.clickRemoveButton(1);
	        String actualEmptyCartText = cartPage.getEmptyCartText();
	        String expectedEmptyCartText = "Your cart is empty";
	        Assert.assertEquals(expectedEmptyCartText, actualEmptyCartText);
	    }
	}


