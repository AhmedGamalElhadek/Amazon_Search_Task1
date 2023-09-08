package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    private WebDriver driver;
    private By addToCart = By.id("add-to-cart-button");
    private By cartButton = By.id("nav-cart-text-container");
    private By addMessage = By.cssSelector("span.a-size-medium-plus.a-color-base.sw-atc-text.a-text-bold");
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }
    public void clickAddToCart(){
        driver.findElement(addToCart).click();
    }
    public String getAddedToCartMessage(){ return driver.findElement(addMessage).getText(); }
    public CartPage goToCart(){
        driver.findElement(cartButton).click();
        return new CartPage(driver);
    }
}
