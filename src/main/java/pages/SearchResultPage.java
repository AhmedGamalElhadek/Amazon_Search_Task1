
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {
    private WebDriver driver;
    private By firstItem = By.cssSelector(".a-size-base-plus.a-color-base.a-text-normal");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getProductName(){
        return driver.findElement(firstItem).getText();
    }

    public ProductPage clickFirstItem(){
        driver.findElement(firstItem).click();
        return new ProductPage(driver);
    }
}