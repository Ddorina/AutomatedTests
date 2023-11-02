package tests;
import org.junit.Assert;
import org.junit.Test;

import pages.LoginPageObject;
import pages.ProductsPageObject;


public class FilterProductsTest extends BaseTest {

    @Test
    public void testFilterProducts() {
        LoginPageObject loginPage = new LoginPageObject(driver);
        loginPage.enterUsername("standard_user");
        loginPage.enterPassword("secret_sauce");
        loginPage.clickLoginButton();
        ProductsPageObject productsPage = new ProductsPageObject(driver);
        productsPage.selectSortOption("Name (Z to A)");
        productsPage.selectFilterOption("Sauce Labs Bolt T-Shirt");
        int actualProductCount = productsPage.getProductCount();
        Assert.assertEquals(1, actualProductCount);
        String actualProductTitle = productsPage.getProductTitle(1);
        String expectedProductTitle = "Sauce Labs Bolt T-Shirt";
        Assert.assertEquals(expectedProductTitle, actualProductTitle);
        String actualProductDescription = productsPage.getProductDescription(1);
        String expectedProductDescription = "Get your testing superhero on with the Sauce Labs bolt T-shirt. From American Apparel, 100% ringspun combed cotton, heather black with red bolt.";
        Assert.assertEquals(expectedProductDescription,actualProductDescription);

}
    
        String actualProductPrice = productsPage.getProductPrice(1);
        String expectedProductPrice = "$15.99";
        Assert.assertEquals(expectedProductPrice, actualProductPrice);
    }
}
