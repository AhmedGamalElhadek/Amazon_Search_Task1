
package pages;

import org.openqa.selenium.*;

public class HomePage {
    private WebDriver driver;
    private By searchBox = By.id("twotabsearchtextbox");
    private By searchButton = By.id("nav-search-submit-button");
    private By todayDealsButton = By.partialLinkText("Today's Deals");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterSearchText(String text) {
        driver.findElement(searchBox).sendKeys(new CharSequence[]{text});
    }

    public SearchResultPage clickSearchButton() {
        driver.findElement(searchButton).click();
        return new SearchResultPage(driver);
    }
    public DealsPage clickTodayDeals(){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        WebElement element = (WebElement) jsExecutor.executeScript("return [...document.querySelectorAll('a')].find(a => a.textContent.includes(\"Today's Deals\"));");
        element.click();

        return new DealsPage(driver);
    }
}
