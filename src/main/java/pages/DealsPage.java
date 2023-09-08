package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DealsPage {
    private WebDriver driver;
    private By headPhonesButton = By.cssSelector("input[data-csa-c-element-id='filter-department-172541']");
    private By groceryButton = By.cssSelector("input[data-csa-c-element-id='filter-department-16310101']");
    private By discount10 = By.cssSelector("[data-csa-c-element-id='filter-discount-10-']");
    private By pagesPanel = By.className("a-pagination");
    private By pagesList = By.tagName("li");


    public DealsPage(WebDriver driver){
        this.driver=driver;
    }
    public void selectHeadphnes(){
        driver.findElement(headPhonesButton).click();
    }
    public void selectGrocery(){
        driver.findElement(groceryButton).click();
    }
    public void selectDiscount10(){
        driver.findElement(discount10).click();
    }
    public void goToPage4(){
        WebElement ulElement = driver.findElement(pagesPanel);
        ulElement.findElements(pagesList).get(3);
    }
}
