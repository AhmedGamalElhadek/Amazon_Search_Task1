package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;
    private By addedItem = By.className("a-truncate-cut");
    public CartPage(WebDriver driver){
        this.driver=driver;
    }
    public String getAddedItem(){
        return driver.findElement(addedItem).getText();
    }
}
