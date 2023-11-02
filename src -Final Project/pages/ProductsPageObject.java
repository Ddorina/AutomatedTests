package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPageObject {

    private WebDriver driver;

    public ProductsPageObject(WebDriver driver) {
        this.driver = driver;
    }

    private By addToCartButton = By.xpath("//button[text()='Add to cart']");
    private By removeButton = By.xpath("//button[text()='Remove']");
    private By cartBadge = By.xpath("//span[@class='shopping_cart_badge']");
    private By filterDropdown = By.className("product_sort_container");
    private By filterOptionAtoZ = By.xpath("//option[text()='Name (A to Z)']");
    private By filterOptionZtoA = By.xpath("//option[text()='Name (Z to A)']");
    private By filterOptionLowToHigh = By.xpath("//option[text()='Price (low to high)']");
    private By filterOptionHighToLow = By.xpath("//option[text()='Price (high to low)']");

    public void clickAddToCartButton() {
        WebElement element = driver.findElement(addToCartButton);
        element.click();
    }

    public void clickRemoveButton() {
        WebElement element = driver.findElement(removeButton);
        element.click();
    }

    public String getCartBadgeText() {
        WebElement element = driver.findElement(cartBadge);
        return element.getText();
    }

    public void selectFilterOptionAtoZ() {
        WebElement element = driver.findElement(filterDropdown);
        element.click

        WebElement option = driver.findElement(filterOptionAtoZ);
        option.click();
    }

    public void selectFilterOptionZtoA() {
        WebElement element = driver.findElement(filterDropdown);
        element.click();
        WebElement option = driver.findElement(filterOptionZtoA);
        option.click();
    }

    public void selectFilterOptionLowToHigh() {
        WebElement element = driver.findElement(filterDropdown);
        element.click();
        WebElement option = driver.findElement(filterOptionLowToHigh);
        option.click();
    }

    public void selectFilterOptionHighToLow() {
        WebElement element = driver.findElement(filterDropdown);
        element.click();
        WebElement option = driver.findElement(filterOptionHighToLow);
        option.click();
    }
}