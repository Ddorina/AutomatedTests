package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

	public class ProductDetailsPageObject {

	    private WebDriver driver;

	    public ProductDetailsPageObject(WebDriver driver) {
	        this.driver = driver;
	    }

	    private By addToCartButton = By.xpath("//button[text()='Add to cart']");
	    private By cartBadge = By.xpath("//span[@class='shopping_cart_badge']");
	    private By productTitle = By.xpath("//div[@class='inventory_details_name large_size']");
	    private By productDescription = By.xpath("//div[@class='inventory_details_desc large_size']");
	    private By productPrice = By.xpath("//div[@class='inventory_details_price']");
	    private By quantityField = By.className("input_qty");
	    private By checkoutButton = By.xpath("//a[text()='CHECKOUT']");

	    public void clickAddToCartButton() {
	        WebElement element = driver.findElement(addToCartButton);
	        element.click();
	    }

	    public String getCartBadgeText() {
	        WebElement element = driver.findElement(cartBadge);
	        return element.getText();
	    }

	    public String getProductTitle() {
	        WebElement element = driver.findElement(productTitle);
	        return element.getText();
	    }

	    public String getProductDescription() {
	        WebElement element = driver.findElement(productDescription);
	        return element.getText();
	    }

	    public String getProductPrice() {
	        WebElement element = driver.findElement(productPrice);
	        return element.getText();
	    }

	    public void enterQuantity(String quantity) {
	        WebElement element = driver.findElement(quantityField);
	        element.clear();
	        element.sendKeys(quantity);
	    }

	    public void clickCheckoutButton() {
	        WebElement element = driver.findElement(checkoutButton);
	        element.click();
	    }
	}

