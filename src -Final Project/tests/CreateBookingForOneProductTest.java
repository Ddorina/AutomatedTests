package tests;
import org.junit.Assert;
	//import org.testng.annotations.Test;

import pages.LoginPageObject;

	public class CreateBookingForOneProductTest extends BaseTest {

	 @Test
	    public void testCreateBookingForOneProduct() {
	        LoginPageObject loginPage = new LoginPageObject(driver);
	        loginPage.enterUsername("standard_user");
	        loginPage.enterPassword("secret_sauce");

}

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
	    cartPage.clickCheckoutButton();
	    CheckoutStepOnePageObject checkoutStepOnePage = new CheckoutStepOnePageObject(driver);
	    String expectedSubtotal = expectedProductPrice;
	    String expectedTotal = expectedProductPrice;
	    checkoutStepOnePage.enterFirstName("John");
	    checkoutStepOnePage.enterLastName("Doe");
	    checkoutStepOnePage.enterZipCode("12345");
	    checkoutStepOnePage.clickContinueButton();
	    CheckoutStepTwoPageObject checkoutStepTwoPage = new CheckoutStepTwoPageObject(driver);
	    String actualSubtotal1 = checkoutStepTwoPage.getSubtotal();
	    String actualTotal1 = checkoutStepTwoPage.getTotal();
	    Assert.assertEquals(expectedSubtotal, actualSubtotal);
	    Assert.assertEquals(expectedTotal, actualTotal);
	    checkoutStepTwoPage.enterFirstName("John");
	    checkoutStepTwoPage.enterLastName("Doe");
	    checkoutStepTwoPage.enterZipCode("12345");
	    checkoutStepTwoPage.clickFinishButton();
	    CheckoutCompletePageObject checkoutCompletePage1 = new CheckoutCompletePageObject(driver);
	    String actualThankYouMessage1 = checkoutCompletePage1.getThankYouMessage();
	    String expectedThankYouMessage1 = "THANK YOU FOR YOUR ORDER";
	    Assert.assertEquals(expectedThankYouMessage, actualThankYouMessage);
	    String actualOrderCompleteMessage1 = checkoutCompletePage1.getOrderCompleteMessage();
	    String expectedOrderCompleteMessage1 = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	    Assert.assertEquals(expectedOrderCompleteMessage, actualOrderCompleteMessage);
	    String actualOrderNumber1 = checkoutCompletePage1.getOrderNumber();
	    Assert.assertTrue(actualOrderNumber.length() > 0);
	}
	
	    String expectedProductDescription1 = productDetailsPage.getProductDescription();
	    String expectedProductPrice1 = productDetailsPage.getProductPrice();
	    productDetailsPage.enterQuantity("1");
	    productDetailsPage.clickAddToCartButton();
	    String actualCartBadgeText1 = productDetailsPage.getCartBadgeText();
	    String expectedCartBadgeText1 = "1";
	    Assert.assertEquals(expectedCartBadgeText, actualCartBadgeText);
	    productsPage.clickCartButton();
	    CartPageObject cartPage = new CartPageObject(driver);
	    String actualProductTitle1 = cartPage.getProductTitle(1);
	    String actualProductDescription1 = cartPage.getProductDescription(1);
	    String actualProductPrice1 = cartPage.getProductPrice(1);
	    String actualQuantity1 = cartPage.getQuantity(1);
	    Assert.assertEquals(expectedProductTitle, actualProductTitle);
	    Assert.assertEquals(expectedProductDescription, actualProductDescription);
	    Assert.assertEquals(expectedProductPrice, actualProductPrice);
	    Assert.assertEquals("1", actualQuantity);
	    cartPage.clickCheckoutButton();
	    CheckoutStepOnePageObject checkoutStepOnePage = new CheckoutStepOnePageObject(driver);
	    String expectedSubtotal = expectedProductPrice;
	    String expectedTotal = expectedProductPrice;
	    checkoutStepOnePage.enterFirstName("John");
	    checkoutStepOnePage.enterLastName("Doe");
	    checkoutStepOnePage.enterZipCode("12345");
	    checkoutStepOnePage.clickContinueButton();
	    CheckoutStepTwoPageObject checkoutStepTwoPage = new CheckoutStepTwoPageObject(driver);
	    String actualSubtotal = checkoutStepTwoPage.getSubtotal();
	    String actualTotal = checkoutStepTwoPage.getTotal();
	    Assert.assertEquals(expectedSubtotal, actualSubtotal);
	    Assert.assertEquals(expectedTotal, actualTotal);
	    checkoutStepTwoPage.enterFirstName("John");
	    checkoutStepTwoPage.enterLastName("Doe");
	    checkoutStepTwoPage.enterZipCode("12345");
	    checkoutStepTwoPage.clickFinishButton();
	    CheckoutCompletePageObject checkoutCompletePage = new CheckoutCompletePageObject(driver);
	    String actualThankYouMessage = checkoutCompletePage1.getThankYouMessage();
	    String expectedThankYouMessage = "THANK YOU FOR YOUR ORDER";
	    Assert.assertEquals(expectedThankYouMessage, actualThankYouMessage);
	    String actualOrderCompleteMessage = checkoutCompletePage1.getOrderCompleteMessage();
	    String expectedOrderCompleteMessage = "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
	    Assert.assertEquals(expectedOrderCompleteMessage, actualOrderCompleteMessage);
	    String actualOrderNumber = checkoutCompletePage1.getOrderNumber();
	    Assert.assertTrue(actualOrderNumber.length() > 0);
	}
	}
